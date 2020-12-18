package by.jonline.grow.programmingwithclass.exercise14;

import java.util.Arrays;

public class Bank {

    private int customerId;
    private int bankAccountId;

    private String name;
    private Customer[] customers;
    private BankAccount[] bankAccounts;

    {
        customers = new Customer[5];
        bankAccounts = new BankAccount[5];

    }

    public Bank(String name) {
        this.name = name;
    }

    public void createAccount(Customer customer) {

        if (customer == null) {
            System.out.println("нет пользователя");
            return;
        }

        if (!existCustomer(customer)) {
            System.out.println("пользователя не существует");
            addCustomer(customer);
            System.out.println("пользователь добавлен");
        }

        if (bankAccountId == bankAccounts.length) {
            increaseBankAccounts();
        }

        bankAccounts[bankAccountId] = new BankAccount(name + customer.getId() + bankAccountId, customer.getId());

        bankAccountId++;


    }

    private void addCustomer(Customer customer) {
        if (customerId == customers.length) {
            increaseCustomers();
        }
        customers[customerId] = customer;
        customerId++;
    }

    private void increaseCustomers() {
        Customer[] copy = Arrays.copyOf(customers, customers.length);

        customers = new Customer[copy.length * 2];

        customers = Arrays.copyOf(copy, copy.length);

        System.out.println("размер пользователей увеличен");

    }

    private void increaseBankAccounts() {
        BankAccount[] copy = Arrays.copyOf(bankAccounts, bankAccounts.length);

        bankAccounts = new BankAccount[copy.length * 2];

        bankAccounts = Arrays.copyOf(copy, bankAccounts.length);

        System.out.println("размер аккаунтов увеличен");

    }

    private boolean existCustomer(Customer customer) {

        for (int i = 0; i < customerId; i++) {
            if (customer.equals(customers[i])) {
                return true;
            }
        }

        return false;
    }

    public void activateAccount(Customer customer, String accountCode) {
        BankAccount account;
        if (customer == null) {
            System.out.println("пользователя нет");
            return;
        }

        if (!existCustomer(customer)) {
            System.out.println("такого пользователя нет");
            return;
        }

        account = findAccount(accountCode, customer.getId());
        if (account == null) {
            System.out.println("у этого пользователя нет этого аккаунта");
            return;
        }

        account.setActive(true);

    }

    public void blockAccount(Customer customer, String accountCode) {
        BankAccount account;
        if (customer == null) {
            System.out.println("пользователя нет");
            return;
        }

        if (!existCustomer(customer)) {
            System.out.println("такого пользователя нет");
            return;
        }

        account = findAccount(accountCode, customer.getId());
        if (account == null) {
            System.out.println("у этого пользователя нет этого аккаунта");
            return;
        }

        account.setActive(false);
    }

    public BankAccount findAccount(String accountCode, int customerId) {
        for (int i = 0; i < bankAccountId; i++) {
            if (accountCode.equals(bankAccounts[i].getAccountCode())) {
                if (customerId == bankAccounts[i].getCustomerId()) {
                    return bankAccounts[i];
                }
            }
        }
        return null;
    }

    public void sort() {
        BankAccount swap;
        boolean q = true;

        while (q) {

            q = false;

            for (int i = 0; i < bankAccountId - 1; i++) {

                if (bankAccounts[i].getCustomerId() > bankAccounts[i + 1].getCustomerId()) {
                    swap = bankAccounts[i];
                    bankAccounts[i] = bankAccounts[i + 1];
                    bankAccounts[i + 1] = swap;
                    q = true;
                }

            }

        }
    }

    public void addMoney(Customer customer, String accountCode, double money) {
        BankAccount account;
        if (customer == null) {
            System.out.println("пользователя нет");
            return;
        }

        if (!existCustomer(customer)) {
            System.out.println("такого пользователя нет");
            return;
        }

        account = findAccount(accountCode, customer.getId());
        if (account == null) {
            System.out.println("у этого пользователя нет этого аккаунта");
            return;
        }

        account.setMoney(account.getMoney() + money);
    }


    public void getMoney(Customer customer, String accountCode, double money) {

        BankAccount account;
        if (customer == null) {
            System.out.println("пользователя нет");
            return;
        }

        if (!existCustomer(customer)) {
            System.out.println("такого пользователя нет");
            return;
        }

        account = findAccount(accountCode, customer.getId());
        if (account == null) {
            System.out.println("у этого пользователя нет этого аккаунта");
            return;
        }

        account.setMoney(account.getMoney() - money);
    }

    public double allMoney(Customer customer) {
        double sum = 0;

        for (int i = 0; i < bankAccountId; i++) {
            if (bankAccounts[i].getCustomerId() == customer.getId()) {
                sum += bankAccounts[i].getMoney();
            }
        }
        return sum;
    }

    public double allPositiveMoney(Customer customer) {
        double sum = 0;
        for (int i = 0; i < bankAccountId; i++) {
            if (bankAccounts[i].getCustomerId() == customer.getId()) {
                if (bankAccounts[i].getMoney() > 0) {
                    sum += bankAccounts[i].getMoney();
                }
            }
        }
        return sum;
    }

    public double allNegativeMoney(Customer customer) {
        double sum = 0;
        for (int i = 0; i < bankAccountId; i++) {
            if (bankAccounts[i].getCustomerId() == customer.getId()) {
                if (bankAccounts[i].getMoney() < 0) {
                    sum += bankAccounts[i].getMoney();
                }
            }
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

package by.jonline.grow.programmingwithclass.exercise14;

import java.util.Arrays;

public class Bank {

    private int customerIndex;
    private int bankAccountIndex;

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


    public boolean createAccount(Customer customer) {

        if (customer == null) {
            System.out.println("нет пользователя");
            return false;
        }

        if (!existCustomer(customer)) {
            System.out.println("пользователя не существует");
            addCustomer(customer);
            System.out.println("пользователь добавлен");
        }

        if (bankAccountIndex == bankAccounts.length) {
            increaseBankAccounts();
        }

        bankAccounts[bankAccountIndex] = new BankAccount(name + customer.getId() + bankAccountIndex, customer.getId());

        bankAccountIndex++;

        return true;
    }

    public boolean activateAccount(Customer customer, String accountCode) {

        BankAccount account;

        if (!checkCustomer(customer)) {
            return false;
        }

        account = findAccount(accountCode, customer.getId());
        if (account == null) {
            System.out.println("у этого пользователя нет этого аккаунта");
            return false;
        }

        account.setActive(true);
        return true;
    }

    public boolean blockAccount(Customer customer, String accountCode) {

        BankAccount account;

        if (!checkCustomer(customer)) {
            return false;
        }

        account = findAccount(accountCode, customer.getId());
        if (account == null) {
            System.out.println("у этого пользователя нет этого аккаунта");
            return false;
        }

        account.setActive(false);

        return true;
    }

    public boolean addMoney(Customer customer, String accountCode, double money) {

        BankAccount account;

        if (!checkCustomer(customer)) {
            return false;
        }

        account = findAccount(accountCode, customer.getId());
        if (account == null) {
            System.out.println("у этого пользователя нет этого аккаунта");
            return false;
        }

        account.setMoney(account.getMoney() + money);

        return true;
    }

    public boolean getMoney(Customer customer, String accountCode, double money) {

        BankAccount account;

        if (!checkCustomer(customer)) {
            return false;
        }

        account = findAccount(accountCode, customer.getId());
        if (account == null) {
            System.out.println("у этого пользователя нет этого аккаунта");
            return false;
        }

        account.setMoney(account.getMoney() - money);

        return true;
    }


    public void sort() {

        BankAccount swap;

        boolean q = true;

        while (q) {

            q = false;

            for (int i = 0; i < bankAccountIndex - 1; i++) {

                if (bankAccounts[i].getCustomerId() > bankAccounts[i + 1].getCustomerId()) {
                    swap = bankAccounts[i];
                    bankAccounts[i] = bankAccounts[i + 1];
                    bankAccounts[i + 1] = swap;
                    q = true;
                }

            }

        }
    }

    public BankAccount findAccount(String accountCode, int customerId) {

        for (int i = 0; i < bankAccountIndex; i++) {
            if (accountCode.equals(bankAccounts[i].getAccountCode())) {
                if (customerId == bankAccounts[i].getCustomerId()) {
                    return bankAccounts[i];
                }
            }
        }
        return null;
    }

    public double allMoney(Customer customer) {

        double sum = 0;

        if (!checkCustomer(customer)) {
            return 1.0 / 0;
        }

        for (int i = 0; i < bankAccountIndex; i++) {
            if (bankAccounts[i].getCustomerId() == customer.getId()) {
                sum += bankAccounts[i].getMoney();
            }
        }
        return sum;
    }

    public double allPositiveMoney(Customer customer) {

        double sum = 0;

        if (!checkCustomer(customer)) {
            return 1.0 / 0;
        }

        for (int i = 0; i < bankAccountIndex; i++) {
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

        if (!checkCustomer(customer)) {
            return 1.0 / 0;
        }

        for (int i = 0; i < bankAccountIndex; i++) {
            if (bankAccounts[i].getCustomerId() == customer.getId()) {
                if (bankAccounts[i].getMoney() < 0) {
                    sum += bankAccounts[i].getMoney();
                }
            }
        }
        return sum;
    }



    public boolean checkCustomer(Customer customer) {

        if (customer == null) {
            System.out.println("пользователя нет");
            return false;
        }

        if (!existCustomer(customer)) {
            System.out.println("такого пользователя нет");
            return false;
        }

        return true;

    }

    private void addCustomer(Customer customer) {
        if (customerIndex == customers.length) {
            increaseCustomers();
        }
        customers[customerIndex] = customer;
        customerIndex++;
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

        for (int i = 0; i < customerIndex; i++) {
            if (customer.equals(customers[i])) {
                return true;
            }
        }

        return false;
    }


    public int getCustomerIndex() {
        return customerIndex;
    }

    public void setCustomerIndex(int customerIndex) {
        this.customerIndex = customerIndex;
    }

    public int getBankAccountIndex() {
        return bankAccountIndex;
    }

    public void setBankAccountIndex(int bankAccountIndex) {
        this.bankAccountIndex = bankAccountIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}

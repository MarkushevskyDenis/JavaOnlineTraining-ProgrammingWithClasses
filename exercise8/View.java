package by.jonline.grow.programmingwithclass.exercise8;

public class View {

    public void outCard(Bank bank, String min, String max) {

        Customer[] customers;

        customers = bank.getCustomers();

        for (int i = 0; i < customers.length; i++) {

            if (Customer.greaterBankCard(customers[i].getBankCard(), min) && Customer.greaterBankCard(max, customers[i].getBankCard())) {

                System.out.println(customers[i].toString());

            }

        }
    }


    public void out(Bank bank) {

        Customer[] customers;

        customers = bank.getCustomers();

        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i].toString());
        }
    }

}

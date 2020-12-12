package by.jonline.grow.programmingwithclass.exercise8;

public class Bank {

    private Customer[] customer;

    public Bank() {

    }

    public Bank(Customer[] customer) {
        this.customer = customer;
    }

    public void sortABC() {

        Customer swap;

        for (int i = 0; i < customer.length - 1; i++) {
            if (customer[i].getFullName().compareTo(customer[i + 1].getFullName()) > 0) {

                swap = customer[i];
                customer[i] = customer[i + 1];
                customer[i + 1] = swap;

                i = -1;

            }
        }

        out();

    }

    public void outCard(String min, String max) {
        for (int i = 0; i < customer.length; i++) {

            if (BankLogic.greater(customer[i].getBankCard(), min) && BankLogic.greater(max, customer[i].getBankCard())) {

                System.out.println(customer[i].toString());

            }

        }
    }


    public void out() {
        for (int i = 0; i < customer.length; i++) {
            System.out.println(customer[i].toString());
        }
    }

}

package by.jonline.grow.programmingwithclass.exercise8;

public class Logic {

    public void sortByName(Bank bank) {

        Customer swap;
        Customer[] customers;

        customers = bank.getCustomers();

        for (int i = 0; i < customers.length - 1; i++) {
            if (customers[i].getFullName().compareTo(customers[i + 1].getFullName()) > 0) {

                swap = customers[i];
                customers[i] = customers[i+1];
                customers[i+1] = swap;

                i = -1;

            }
        }

    }


}

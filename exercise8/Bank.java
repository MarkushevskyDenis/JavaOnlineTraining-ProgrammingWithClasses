package by.jonline.grow.programmingwithclass.exercise8;

public class Bank {

    private Customer[] customers;

    public Bank() {

    }

    public Bank(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
}

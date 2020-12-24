package by.jonline.grow.programmingwithclass.exercise14;

public class BankAccount {

    private String accountCode;
    private double money;
    private boolean active;
    private int customerId;

    {
        money = 0;
        active = false;
    }

    public BankAccount(String accountCode, int customerId) {
        this.accountCode = accountCode;
        this.customerId = customerId;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public double getMoney() {
        return money;
    }

    public boolean isActive() {
        return active;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {accountCode='" + accountCode + '\'' +
                ", money=" + money +
                ", active=" + active +
                ", customerId=" + customerId +
                '}';
    }
}

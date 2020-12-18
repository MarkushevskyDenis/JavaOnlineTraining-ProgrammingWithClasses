package by.jonline.grow.programmingwithclass.exercise14;

public class BankAccount {

	private String accountCode;
	private double money;
	private boolean active;
	private int customerId;

	{
		active = false;
	}

	public BankAccount(String accountCode, int customerId) {
		this.accountCode = accountCode;
		this.customerId = customerId;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}

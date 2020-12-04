package by.jonline.grow.programmingwithclass.exercise14;

public class BankAccount {

	private String accountCode;
	private double money;
	private boolean active;

	{
		active = false;
	}

	public BankAccount(String accountCode, double money, boolean active) {
		this.accountCode = accountCode;
		this.money = money;
		this.active = active;
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


	
}

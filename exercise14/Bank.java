package by.jonline.grow.programmingwithclass.exercise14;

public class Bank {

	private int customerAccountId;
	private int bankAccountId;
	private String name;

	{
		customerAccountId = 0;
		bankAccountId = 0;
	}

	public Bank(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount createAccount() {

		String accountCode = name + customerAccountId;
		BankAccount account = new BankAccount(accountCode, 0, false);
		customerAccountId++;
		return account;

	}

	public void activateAccount(BankAccount account) {
		if (account == null) {
			System.out.println("this account is not exist");
			return;
		}

		if (account.isActive() == true) {
			System.out.println("account is already activated");
			return;
		}
		account.setActive(true);
	}

	public void blockAccount(BankAccount account) {
		
		if (account == null) {
			System.out.println("this account is not exist");
			return;
		}

		
		if (account.isActive() == false) {
			System.out.println("account is already blocked");
			return;
		}
		account.setActive(false);
	}

	public void addMoney(BankAccount account, double money) {
		
		if (account == null) {
			System.out.println("this account is not exist");
			return;
		}

		
		if (account.isActive() == false) {
			System.out.println("account is blocked");
			return;
		}
		account.setMoney(account.getMoney() + money);
	}

	public void getMoney(BankAccount account, double money) {
		
		if (account == null) {
			System.out.println("this account is not exist");
			return;
		}

		
		if (account.isActive() == false) {
			System.out.println("account is blocked");
			return;
		}
		account.setMoney(account.getMoney() - money);
	}

}

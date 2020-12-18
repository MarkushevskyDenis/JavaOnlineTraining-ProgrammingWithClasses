package by.jonline.grow.programmingwithclass.exercise14;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {

	private static int i;
	private int id;
	private String lastName;
	private String firstName;
	private String patronymic;

	public Customer(String lastName, String firstName, String patronymic) {
		this.id = i;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		i++;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Customer customer = (Customer) o;
		return id == customer.id;
	}

/*
	{
		id = 0;
		bankAccountId = 0;
		bankAccount = new BankAccount[5];
	}

	public Customer(String lastName, String firstName, String patronymic) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
	}

	public void createAccount(Bank bank) {
		if (bankAccountId == bankAccount.length) {
			encrease();
		}
		bankAccount[bankAccountId] = bank.createAccount();
		bankAccountId++;
	}

	private void encrease() {

		BankAccount[] copy = bankAccount;

		bankAccount = new BankAccount[copy.length * 2];

		for (int i = 0; i < copy.length; i++) {
			bankAccount[i] = copy[i];
		}

		sortAccount();
	}

	public void sortAccount() {

		if (bankAccount[0] == null) {
			System.out.println("nothing");
			return;
		}

		BankAccount swap;

		for (int i = 0; i < bankAccount.length - 1 && bankAccount[i + 1] != null; i++) {

			if (getBankName(bankAccount[i].getAccountCode())
					.compareTo(getBankName(bankAccount[i + 1].getAccountCode())) > 0) {

				swap = bankAccount[i];
				bankAccount[i] = bankAccount[i + 1];
				bankAccount[i + 1] = swap;
				i = -1;

			}

		}

	}

	public void searchAccount() {
		String account = getString("enter account code");
		for (int i = 0; i < bankAccount.length && bankAccount[i] != null; i++) {
			if (bankAccount[i].getAccountCode().equals(account)) {
				System.out.println(bankAccount[i].getAccountCode() + "\n" + bankAccount[i].getMoney() + "\n"
						+ bankAccount[i].isActive());
				return;
			}
		}
		System.out.println("this account is not exist");
	}

	public void viewMyAcounts() {
		for (int i = 0; i < bankAccount.length && bankAccount[i] != null; i++) {
			System.out.println(bankAccount[i].getAccountCode());
		}
	}

	private String getString(String str) {
		Scanner read = new Scanner(System.in);

		System.out.println(str);

		return read.nextLine();

	}

	private String getBankName(String code) {
		Pattern pattern = Pattern.compile("[A-Za-z]+");
		Matcher matcher = pattern.matcher(code);

		matcher.find();
		return matcher.group();
	}



	public void activateAccount(String accountCode, Bank bank) {
		bank.activateAccount(findAccount(accountCode));
	}

	public void blockAccount(String accountCode, Bank bank) {
		bank.blockAccount(findAccount(accountCode));
	}

	public void addMoney(String accountCode, Bank bank, double money) {
		bank.addMoney(findAccount(accountCode), money);
	}

	public void getMoney(String accountCode, Bank bank, double money) {
		bank.getMoney(findAccount(accountCode), money);
	}

	private BankAccount findAccount(String account) {
		for (int i = 0; i < bankAccount.length && bankAccount[i] != null; i++) {
			if (bankAccount[i].getAccountCode().equals(account)) {
				return bankAccount[i];
			}
		}
		return null;
	}
	*/
}

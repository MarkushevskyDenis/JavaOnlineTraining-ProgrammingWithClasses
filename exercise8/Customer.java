package by.jonline.grow.programmingwithclass.exercise8;

public class Customer {
	
	private int id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private String adress;
	private String bankCard;
	private String bankAccount;

	public Customer(int id, String lastName, String firstName, String patronymic, String adress, String bankCard,
			String bankAccount) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.adress = adress;
		this.bankCard = bankCard;
		this.bankAccount = bankAccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {

		if (bankCard.matches("(\\d{4} ){3}\\d{4}")) {
			this.bankCard = bankCard;
		} else {
			System.out.println("error");
		}
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {

		if (bankAccount.matches("BY \\d{2} \\w{4} \\d{4} (\\d{4} ){3}\\d{4}")) {
			this.bankAccount = bankAccount;
		} else {
			System.out.println("error");
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", patronymic=" + patronymic + ", adress=" + adress + ", bankCard=" + bankCard + ", bankAccount="
				+ bankAccount + "]";
	}

	public String getFullName() {
		return lastName + " " + firstName + " " + patronymic;
	}

}

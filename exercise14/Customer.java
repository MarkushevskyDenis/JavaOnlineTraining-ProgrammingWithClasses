package by.jonline.grow.programmingwithclass.exercise14;

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

}

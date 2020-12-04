package by.jonline.grow.programmingwithclass.exercise8;

public class Bank {

	Customer[] customer;

	public Bank(Customer[] customer) {
		this.customer = customer;
	}

	void sortABC() {

		for (int i = 0; i < customer.length - 1; i++) {
			if (customer[i].getFullName().compareTo(customer[i + 1].getFullName()) > 0) {
				swap(i);
				i = -1;
			}
		}

	}

	void sortCard(String min, String max) {
		for (int i = 0; i < customer.length - 1; i++) {

			if (greater(customer[i].getBankCard(), min) && greater(max, customer[i].getBankCard())) {

				System.out.println(customer[i].toString());

			}

		}
	}

	boolean greater(String first, String second) {

		int one;
		int two;

		first = first.replaceAll(" ", "");
		second = second.replaceAll(" ", "");

		one = Integer.parseInt(first);
		two = Integer.parseInt(second);

		if (one >= two) {
			return true;
		} else {
			return false;
		}

	}

	void swap(int i) {
		Customer swap;

		swap = customer[i];
		customer[i] = customer[i + 1];
		customer[i + 1] = swap;

	}

	void out() {
		for (int i = 0; i < customer.length; i++) {
			System.out.println(customer[i].toString());
		}
	}

}

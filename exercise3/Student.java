package by.jonline.grow.programmingwithclass.exercise3;

public class Student {
	String lastName;
	String initial;
	String group;
	int[] rating;

	private Student() {

	}

	public Student(String lastName, String initial, String group, int[] rating) {
		this.lastName = lastName;
		this.initial = initial;
		this.group = group;
		this.rating = rating;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGroup() {
		return group;
	}

	public boolean excellentStudent() {

		for (int i = 0; i < rating.length; i++) {
			if (rating[i] != 9) {
				if (rating[i] != 10) {
					return false;
				}
			}
		}

		return true;

	}

}

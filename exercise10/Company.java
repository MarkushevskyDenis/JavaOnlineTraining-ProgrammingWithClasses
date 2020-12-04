package by.jonline.grow.programmingwithclass.exercise10;

import by.jonline.grow.programmingwithclass.exercise6.Time;

public class Company {
	Airline[] airline;

	public Company(Airline[] airline) {
		this.airline = airline;
	}

	public void sortByDestination(String destination) {
		for (int i = 0; i < airline.length; i++) {

			if (airline[i].getDestination().equals(destination)) {
				System.out.println(airline[i].toString());
			}

		}
	}

	public void sortByDayOfWeek(String dayOfWeek) {
		String[] str;

		for (int i = 0; i < airline.length; i++) {
			str = airline[i].getDayOfWeek().split("/");

			for (int j = 0; j < str.length; j++) {

				if (str[j].equals(dayOfWeek)) {
					System.out.println(airline[i].toString());
					break;
				}

			}

		}

	}

	public void sortByDayOfWeek(String dayOfWeek, Airline airline) {
		String[] str;

		str = airline.getDayOfWeek().split("/");

		for (int i = 0; i < str.length; i++) {

			if (str[i].equals(dayOfWeek)) {
				System.out.println(airline.toString());
				break;
			}

		}

	}

	public void sortByTimeAndDayOfweek(String dayOfWeek, Time time) {

		for (int i = 0; i < airline.length; i++) {

			if (Time.greater(airline[i].getTime(), time)) {
				sortByDayOfWeek(dayOfWeek, airline[i]);
			}

		}

	}

	public void out() {
		for (int i = 0; i < airline.length; i++) {
			System.out.println(airline[i].toString());
		}
	}
	
}

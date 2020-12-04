package by.jonline.grow.programmingwithclass.exercise15;

import java.util.Arrays;

public class Company {
	Tour[] tour;

	public Company(Tour[] tour) {
		this.tour = tour;
	}

	public void getTour(String type, String vehicle, String food, int day, double cost) {

		if (tour == null) {
			System.out.println("nothing");
			return;
		}

		Tour[] consilience = new Tour[tour.length];
		consilience = Arrays.copyOf(tour, tour.length);

		getByType(type, consilience);
		getByVehicle(vehicle, consilience);
		getByFood(food, consilience);
		getByDay(day, consilience);
		getByCost(cost, consilience);

		for (int i = 0; i < consilience.length; i++) {
			if (consilience[i] != null) {
				System.out.println(consilience[i].toString());
			}
		}

	}

	private void getByType(String type, Tour[] consilience) {

		for (int i = 0; i < tour.length; i++) {
			if (type.equals("")) {
				return;
			}

			if (!tour[i].getType().equals(type)) {
				consilience[i] = null;
			}
		}

	}

	private void getByVehicle(String vehicle, Tour[] consilience) {

		for (int i = 0; i < tour.length; i++) {
			if (vehicle.equals("")) {
				return;
			}

			if (!tour[i].getVehicle().equals(vehicle)) {
				consilience[i] = null;
			}
		}

	}

	private void getByFood(String food, Tour[] consilience) {

		for (int i = 0; i < tour.length; i++) {
			if (food.equals("")) {
				return;
			}

			if (!tour[i].getFood().equals(food)) {
				consilience[i] = null;
			}
		}

	}

	private void getByDay(int day, Tour[] consilience) {

		for (int i = 0; i < tour.length; i++) {
			if (day <= 0) {
				return;
			}

			if (!(tour[i].getDay() <= day)) {
				consilience[i] = null;
			}
		}

	}

	private void getByCost(double cost, Tour[] consilience) {

		for (int i = 0; i < tour.length; i++) {
			if (cost < 0) {
				return;
			}

			if (!(tour[i].getCost() <= cost)) {
				consilience[i] = null;
			}
		}

	}

	public void sortByType() {

		for (int i = 0; i < tour.length - 1; i++) {
			if (tour[i].getType().compareTo(tour[i + 1].getType()) > 0) {
				swap(i, i + 1);
				i = -1;
			}
		}

	}

	public void sortByVehicle() {

		for (int i = 0; i < tour.length - 1; i++) {
			if (tour[i].getVehicle().compareTo(tour[i + 1].getVehicle()) > 0) {
				swap(i, i + 1);
				i = -1;
			}
		}

	}

	public void sortByFood() {

		for (int i = 0; i < tour.length - 1; i++) {
			if (tour[i].getFood().compareTo(tour[i + 1].getFood()) > 0) {
				swap(i, i + 1);
				i = -1;
			}
		}

	}

	public void sortByDay() {

		for (int i = 0; i < tour.length - 1; i++) {
			if (tour[i].getDay() > tour[i + 1].getDay()) {
				swap(i, i + 1);
				i = -1;
			}
		}

	}

	public void sortByCost() {

		for (int i = 0; i < tour.length - 1; i++) {
			if (tour[i].getCost() > tour[i + 1].getCost()) {
				swap(i, i + 1);
				i = -1;
			}
		}

	}

	private void swap(int ind1, int ind2) {
		Tour swap;

		swap = tour[ind1];
		tour[ind1] = tour[ind2];
		tour[ind2] = swap;

	}

}

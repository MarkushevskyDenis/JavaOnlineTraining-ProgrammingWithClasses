package by.jonline.grow.programmingwithclass.exercise15;

import java.util.Arrays;

public class Company {
    Tour[] tour;

    public Company(Tour[] tour) {
        this.tour = tour;
    }

    public Tour[] getOffer(String type, String vehicle, String food, int day, double cost) {

        if (tour == null) {
            System.out.println("nothing");
            return null;
        }

        Tour[] offer;
        offer = Arrays.copyOf(tour, tour.length);

        removeByType(type, offer);
        removeByVehicle(vehicle, offer);
        removeByFood(food, offer);
        removeByDay(day, offer);
        removeByCost(cost, offer);

        return offer;

    }

    private void removeByType(String type, Tour[] offer) {

        for (int i = 0; offer[i] != null && i < offer.length; i++) {
            if (type.equals("")) {
                return;
            }

            if (!offer[i].getType().equals(type)) {
                remove(offer, i);
                i -= 1;
            }
        }

    }

    private void removeByVehicle(String vehicle, Tour[] offer) {

        for (int i = 0; offer[i] != null && i < offer.length; i++) {
            if (vehicle.equals("")) {
                return;
            }

            if (!offer[i].getVehicle().equals(vehicle)) {
                remove(offer, i);
                i -= 1;
            }
        }

    }

    private void removeByFood(String food, Tour[] offer) {

        for (int i = 0; offer[i] != null && i < offer.length; i++) {
            if (food.equals("")) {
                return;
            }

            if (!offer[i].getFood().equals(food)) {
                remove(offer, i);
                i -= 1;
            }
        }

    }

    private void removeByDay(int day, Tour[] offer) {

        for (int i = 0; offer[i] != null && i < offer.length; i++) {
            if (day <= 0) {
                return;
            }

            if (!(offer[i].getDay() <= day)) {
                remove(offer, i);
                i -= 1;
            }
        }

    }

    private void removeByCost(double cost, Tour[] offer) {

        for (int i = 0; offer[i] != null && i < offer.length; i++) {
            if (cost < 0) {
                return;
            }

            if (!(offer[i].getCost() <= cost)) {
                remove(offer, i);
                i -= 1;
            }
        }

    }

    private void remove(Tour[] offer, int ind) {

        for (int i = ind; i < offer.length - 1; i++) {
            offer[i] = offer[i + 1];
        }

        offer[offer.length - 1] = null;

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

    public Tour[] getTour() {
        return tour;
    }

    public void setTour(Tour[] tour) {
        this.tour = tour;
    }
}

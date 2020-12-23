package by.jonline.grow.programmingwithclass.exercise10;


public class Company {
    Airline[] airlines;

    public Company(Airline[] airline) {
        this.airlines = airline;
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }
}

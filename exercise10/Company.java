package by.jonline.grow.programmingwithclass.exercise10;


public class Company {
    Airline[] airline;

    public Company(Airline[] airline) {
        this.airline = airline;
    }

    public void outByDestination(String destination) {

        boolean q = true;

        for (int i = 0; i < airline.length; i++) {

            if (airline[i].getDestination().equals(destination)) {
                System.out.println(airline[i].toString());
                q = false;
            }

        }

        if (q) {
            System.out.println("ничего");
        }

    }

    public void outByDayOfWeek(String dayOfWeek) {
        String[] str;
        boolean q = true;
        for (int i = 0; i < airline.length; i++) {
            str = airline[i].getDaysOfWeek().split("/");

            for (int j = 0; j < str.length; j++) {

                if (str[j].equals(dayOfWeek)) {
                    System.out.println(airline[i].toString());
                    q = false;
                    break;
                }

            }

        }

        if (q) {
            System.out.println("ничего");
        }

    }

    public void outByDayOfWeek(String dayOfWeek, Airline airline) {
        String[] str;
        boolean q = true;

        str = airline.getDaysOfWeek().split("/");

        for (int i = 0; i < str.length; i++) {

            if (str[i].equals(dayOfWeek)) {
                System.out.println(airline.toString());
                q = false;
                break;
            }

        }

        if (q){
            System.out.println("ничего");
        }

    }

    public void outByTimeAndDayOfWeek(String dayOfWeek, Time time) {
        boolean q = true;

        for (int i = 0; i < airline.length; i++) {

            if (Time.greater(airline[i].getTime(), time)) {
                outByDayOfWeek(dayOfWeek, airline[i]);
                q = false;
            }

        }

        if (q){
            System.out.println("ничего");
        }

    }

    public void out() {

        boolean q = true;

        for (int i = 0; i < airline.length; i++) {
            System.out.println(airline[i].toString());
            q = false;
        }

        if (q){
            System.out.println("ничего");
        }

    }

}

package by.jonline.grow.programmingwithclass.exercise10;

public class View {

    public void outByDestination(Company company, String destination) {

        boolean q = true;
        Airline[] airlines;

        airlines = company.getAirlines();

        for (int i = 0; i < airlines.length; i++) {

            if (airlines[i].getDestination().equals(destination)) {
                System.out.println(airlines[i].toString());
                q = false;
            }

        }

        if (q) {
            System.out.println("ничего");
        }

    }

    public void outByDayOfWeek(Company company, String dayOfWeek) {

        String[] str;
        boolean q = true;
        Airline[] airlines;

        airlines = company.getAirlines();

        for (int i = 0; i < airlines.length; i++) {
            str = airlines[i].getDaysOfWeek().split("/");

            for (int j = 0; j < str.length; j++) {

                if (str[j].equals(dayOfWeek)) {
                    System.out.println(airlines[i].toString());
                    q = false;
                    break;
                }

            }

        }

        if (q) {
            System.out.println("ничего");
        }

    }

    public boolean outByDayOfWeek(Airline airline, String dayOfWeek) {

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

        return q;

    }

    public void outByTimeAndDayOfWeek(Company company, String dayOfWeek, Time time) {

        boolean q = true;
        Airline[] airlines;

        airlines = company.getAirlines();

        for (int i = 0; i < airlines.length; i++) {

            if (Time.greater(airlines[i].getTime(), time)) {

                if (outByDayOfWeek(airlines[i], dayOfWeek) == false) {
                    q = false;
                }

            }

        }

        if (q) {
            System.out.println("ничего");
        }

    }

    public void out(Company company) {

        boolean q = true;
        Airline[] airlines;

        airlines = company.getAirlines();

        for (int i = 0; i < airlines.length; i++) {
            System.out.println(airlines[i].toString());
            q = false;
        }

        if (q) {
            System.out.println("ничего");
        }

    }


}

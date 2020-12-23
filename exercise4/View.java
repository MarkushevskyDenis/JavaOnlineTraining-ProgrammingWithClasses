package by.jonline.grow.programmingwithclass.exercise4;

public class View {

    public void out(Depo depo, int name) {

        boolean q = true;
        Train[] trains = depo.getTrains();

        for (int i = 0; i < trains.length; i++) {

            if (trains[i].getName() == name) {
                System.out.println(trains[i].toString());
                q = false;
            }

        }

        if (q) {
            System.out.println("такого поезда нет");
        }

    }

    public void out(Depo depo) {

        boolean q = true;
        Train[] trains = depo.getTrains();

        for (int i = 0; i < trains.length; i++) {

            System.out.println(trains[i].toString());
            q = false;

        }

        if (q) {
            System.out.println("ничего нет");
        }

    }


}

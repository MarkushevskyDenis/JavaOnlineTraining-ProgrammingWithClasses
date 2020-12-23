package by.jonline.grow.programmingwithclass.exercise4;

public class Logic {
    public void sortByName(Depo depo) {

        Train swap;
        Train[] trains;

        trains = depo.getTrains();

        for (int i = 0; i < trains.length - 1; i++) {
            if (trains[i].getName() > trains[i + 1].getName()) {
                swap = trains[i];
                trains[i] = trains[i + 1];
                trains[i + 1] = swap;
                i = -1;
            }
        }

    }

    private void sortByTime(Depo depo) {                 //сортировка по времени одинаковых конечных пунтов

        int i = 0;
        Train swap;
        Train[] trains;

        trains = depo.getTrains();

        while (i != trains.length) {

            while (i != trains.length - 1 && trains[i].getDestination().equals(trains[i + 1].getDestination())) {

                if (trains[i].getTime().compareTo(trains[i + 1].getTime()) > 0) {
                    swap = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = swap;
                    i = -1;
                }
                i++;

            }
            i++;

        }

    }

    public void sortByDestination(Depo depo) {           //сортировка по месту назначения

        Train swap;
        Train[] trains;

        trains = depo.getTrains();

        for (int i = 0; i < trains.length - 1; i++) {

            if (trains[i].getDestination().compareTo(trains[i + 1].getDestination()) > 0) {
                swap = trains[i];
                trains[i] = trains[i + 1];
                trains[i + 1] = swap;
                i = -1;
            }

        }

    }

    public void sort(Depo depo) {

        sortByDestination(depo);
        sortByTime(depo);

    }
}

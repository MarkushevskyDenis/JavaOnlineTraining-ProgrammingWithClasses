package by.jonline.grow.programmingwithclass.exercise4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Train {

    private String destination;
    private int name;
    private Date time;

    private static DateFormat dateFormat = new SimpleDateFormat("HH:mm");

    public Train(String destination, int name, String time) throws ParseException {
        this.destination = destination;
        this.name = name;
        this.time = dateFormat.parse(time);
    }

    public static void sortByName(Train[] train) {

        Train swap;

        for (int i = 0; i < train.length - 1; i++) {
            if (train[i].name > train[i + 1].name) {
                swap = train[i];
                train[i] = train[i + 1];
                train[i + 1] = swap;
                i = -1;
            }
        }

    }

    public static void sortByTime(Train[] train) {                 //сортировка по времени одинаковых конечных пунтов

        int i = 0;
        Train swap;

        while (i != train.length) {

            while (i != train.length - 1 && train[i].destination.equals(train[i + 1].destination)) {

                if (train[i].time.compareTo(train[i + 1].time) > 0) {
                    swap = train[i];
                    train[i] = train[i + 1];
                    train[i + 1] = swap;
                    i = -1;
                }
                i++;

            }
            i++;

        }

    }

    public static void sortByEnd(Train[] train) {           //сортировка по месту назначения

        Train swap;

        for (int i = 0; i < train.length - 1; i++) {

            if (train[i].destination.compareTo(train[i + 1].destination) > 0) {
                swap = train[i];
                train[i] = train[i + 1];
                train[i + 1] = swap;
                i = -1;
            }

        }

    }

    public static void out(Train[] train, int name) {

        boolean q = true;

        for (int i = 0; i < train.length; i++) {

            if (train[i].name == name) {
                System.out.println("номер поезда " + train[i].name + "; конечный пункт " + train[i].destination + "; время "
                        + dateFormat.format(train[i].time));
                q = false;
            }

        }

        if (q) {
            System.out.println("такого поезда нет");
        }

    }

    public static void sort(Train[] train) {

        sortByEnd(train);
        sortByTime(train);

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [end=" + destination + ", name=" + name + ", time=" + dateFormat.format(time) + "]";
    }

}

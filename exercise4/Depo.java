package by.jonline.grow.programmingwithclass.exercise4;

import java.util.Arrays;

public class Depo {

    private Train[] trains;

    public Depo(Train[] trains) {
        this.trains = trains;
    }

    public void setTrains(Train[] trains) {
        this.trains = trains;
    }

    public Train[] getTrains() {
        return trains;
    }

}

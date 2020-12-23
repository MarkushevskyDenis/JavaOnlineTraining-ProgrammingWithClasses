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

    public String getDestination() {
        return destination;
    }

    public int getName() {
        return name;
    }

    public Date getTime() {
        return time;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public static DateFormat getDateFormat() {
        return dateFormat;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [destination=" + destination + ", name=" + name + ", time=" + dateFormat.format(time) + "]";
    }

}

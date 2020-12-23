package by.jonline.grow.programmingwithclass.exercise10;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0) {
            System.out.println("ошибка ввода часа");
            this.hour = 0;
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {

        if (minute > 59 || minute < 0) {
            System.out.println("ошибка ввода минут");
            this.minute = 0;
            return;
        }

        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {

        if (second > 59 || second < 0) {
            System.out.println("ошибка ввода секунд");
            this.second = 0;
            return;
        }

        this.second = second;
    }

    public void out() {
        System.out.print(hour / 10 + "" + (hour - (hour / 10) * 10) + "ч: ");
        System.out.print(minute / 10 + "" + (minute - (minute / 10) * 10) + "м: ");
        System.out.println(second / 10 + "" + (second - (second / 10) * 10) + "с");
    }

    @Override
    public String toString() {
        return "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second;
    }

    public static boolean greater(Time first, Time second) {

        if (first.getHour() > second.getHour()) {
            return true;
        } else if (first.getHour() < second.getHour()) {
            return false;
        } else {

            if (first.getMinute() > second.getMinute()) {
                return true;
            } else if (first.getMinute() < second.getMinute()) {
                return false;
            } else {

                if (first.getSecond() > second.getSecond()) {
                    return true;
                } else if (first.getSecond() < second.getSecond()) {
                    return false;
                } else {
                    return false;
                }

            }

        }

    }

}

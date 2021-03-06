package by.jonline.grow.programmingwithclass.exercise6;

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

    public void increaseHour(int i) {
        int k;

        hour += i;
        if (hour > 23) {
            k = hour / 24;
            hour -= 24 * k;
        }

    }

    public void reduceHour(int i) {
        int k;

        hour -= i;
        if (hour < 0) {
            k = Math.abs(hour / 24) + 1;
            hour += 24 * k;
        }

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

    public void increaseMinute(int i) {
        int k;

        minute += i;
        if (minute > 59) {
            k = minute / 60;
            minute -= 60 * k;

            increaseHour(k);

        }

    }

    public void reduceMinute(int i) {
        int k;

        minute -= i;
        if (minute < 0) {
            k = Math.abs(minute / 60) + 1;
            minute += 60 * k;

            reduceHour(k);
        }

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

    public void increaseSecond(int i) {
        int k;

        second += i;
        if (second > 59) {

            k = second / 60;
            second -= 60 * k;

            increaseMinute(k);

        }


    }

    public void reduceSecond(int i) {
        int k;

        second -= i;
        if (second < 0) {
            k = Math.abs(second / 60) + 1;
            second += 60 * k;

            reduceMinute(k);
        }



    }

    public void out() {
        System.out.print(hour / 10 + "" + (hour - (hour / 10) * 10) + "ч: ");
        System.out.print(minute / 10 + "" + (minute - (minute / 10) * 10) + "м: ");
        System.out.println(second / 10 + "" + (second - (second / 10) * 10) + "с");
    }

}

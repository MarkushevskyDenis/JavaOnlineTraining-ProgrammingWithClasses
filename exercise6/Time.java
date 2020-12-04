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

	public void encreaseHour(int i) {
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

	public void encreaseMinute(int i) {
		int k;

		minute += i;
		if (minute > 59) {
			k = minute / 60;
			minute -= 60 * k;
		}

	}

	public void reduceMinute(int i) {
		int k;

		minute -= i;
		if (minute < 0) {
			k = Math.abs(minute / 60) + 1;
			minute += 60 * k;
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

	public void encreaseSecond(int i) {
		int k;

		second += i;
		if (second > 59) {
			k = second / 60;
			second -= 60 * k;
		}

	}

	public void reduceSecond(int i) {
		int k;

		second -= i;
		if (second < 0) {
			k = Math.abs(second / 60) + 1;

			second += 60 * k;
		}

	}

	public void out() {
		System.out.print(hour / 10 + "" + (hour - (hour / 10) * 10) + "ч: ");
		System.out.print(minute / 10 + "" + (minute - (minute / 10) * 10) + "м: ");
		System.out.println(second / 10 + "" + (second - (second / 10) * 10) + "с");
	}

	public String out(String str) {
		return hour / 10 + "" + (hour - (hour / 10) * 10) + "ч: " + minute / 10 + "" + (minute - (minute / 10) * 10)
				+ "м: " + second / 10 + "" + (second - (second / 10) * 10) + "с";
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

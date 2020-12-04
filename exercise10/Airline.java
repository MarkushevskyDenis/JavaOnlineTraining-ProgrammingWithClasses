package by.jonline.grow.programmingwithclass.exercise10;

import by.jonline.grow.programmingwithclass.exercise6.Time;

public class Airline {
	private String destination;
	private String flightNum;
	private String type;
	private Time time;
	private String dayOfWeek;

	public Airline(String destination, String flightNum, String type, Time time, String dayOfWeek) {
		this.destination = destination;
		this.flightNum = flightNum;
		this.type = type;
		this.time = time;
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {

		if (dayOfWeek.matches("(\\w+/)+")) {
			this.dayOfWeek = dayOfWeek;
		} else {
			System.out.println("error");
		}

	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNum=" + flightNum + ", type=" + type + ", time="
				+ time.out("asd")+ ", dayOfWeek=" + dayOfWeek + "]";
	}
}

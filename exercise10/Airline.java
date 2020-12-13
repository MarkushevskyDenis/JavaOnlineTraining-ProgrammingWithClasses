package by.jonline.grow.programmingwithclass.exercise10;


public class Airline {
	private String destination;
	private String flightNum;
	private String airplaneType;
	private Time time;
	private String daysOfWeek;

	public Airline(String destination, String flightNum, String type, Time time, String dayOfWeek) {
		this.destination = destination;
		this.flightNum = flightNum;
		this.airplaneType = type;
		this.time = time;
		this.daysOfWeek = dayOfWeek;
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

	public String getAirplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(String daysOfWeek) {

		if (daysOfWeek.matches("^(\\w+/?)+?$")) {
			this.daysOfWeek = daysOfWeek;
		} else {
			System.out.println("error");
		}

	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNum=" + flightNum + ", type=" + airplaneType + ", time="
				+ time.toString()+ ", dayOfWeek=" + daysOfWeek + "]";
	}
}

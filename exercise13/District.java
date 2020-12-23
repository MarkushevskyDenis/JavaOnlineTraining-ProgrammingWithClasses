package by.jonline.grow.programmingwithclass.exercise13;

public class District {

	private String name;
	private City[] cities;

	public District(String name, City... city) {
		this.name = name;
		this.cities = city;
	}

	public String getName() {
		return name;
	}

	public City[] getCities() {
		return cities;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}
}

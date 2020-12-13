package by.jonline.grow.programmingwithclass.exercise13;

public class District {

	private String name;
	private City[] city;

	public District(String name, City... city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public City[] getCity() {
		return city;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(City[] city) {
		this.city = city;
	}
}

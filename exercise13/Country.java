package by.jonline.grow.programmingwithclass.exercise13;

public class Country {

	private String name;
	private String capital;
	private double totalArea;
	private Region[] region;

	public Country(String name, String capital, double totalArea, Region... region) {
		this.name = name;
		this.capital = capital;
		this.totalArea = totalArea;
		this.region = region;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public double getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(double totalArea) {
		this.totalArea = totalArea;
	}

	public Region[] getRegion() {
		return region;
	}

	public void setRegion(Region[] region) {
		this.region = region;
	}

	public int getCountOfRegion() {
		return region.length;
	}

}

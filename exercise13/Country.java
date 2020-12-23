package by.jonline.grow.programmingwithclass.exercise13;

public class Country {

	private String name;
	private String capital;
	private double totalArea;
	private Region[] regions;

	public Country(String name, String capital, double totalArea, Region... region) {
		this.name = name;
		this.capital = capital;
		this.totalArea = totalArea;
		this.regions = region;
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

	public Region[] getRegions() {
		return regions;
	}

	public void setRegions(Region[] regions) {
		this.regions = regions;
	}

	public int getCountOfRegions() {

		if (regions == null){
			return 0;
		}

		return regions.length;
	}

}

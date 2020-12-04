package by.jonline.grow.programmingwithclass.exercise13;

public class Region {

	private String name;
	private String regionalCenter;
	private District[] district;

	public Region(String name, String regionalCenter, District... district) {
		this.name = name;
		this.regionalCenter = regionalCenter;
		this.district = district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegionalCenter() {
		return regionalCenter;
	}

	public void setRegionalCenter(String regionalCenter) {
		this.regionalCenter = regionalCenter;
	}

	public District[] getDistrict() {
		return district;
	}

	public void setDistrict(District[] district) {
		this.district = district;
	}



}

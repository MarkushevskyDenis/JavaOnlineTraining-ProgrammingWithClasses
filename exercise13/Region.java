package by.jonline.grow.programmingwithclass.exercise13;

public class Region {

	private String name;
	private String regionalCenter;
	private District[] districts;

	public Region(String name, String regionalCenter, District... district) {
		this.name = name;
		this.regionalCenter = regionalCenter;
		this.districts = district;
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

	public District[] getDistricts() {
		return districts;
	}

	public void setDistricts(District[] districts) {
		this.districts = districts;
	}



}

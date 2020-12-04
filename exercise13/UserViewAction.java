package by.jonline.grow.programmingwithclass.exercise13;

public class UserViewAction {

	public void outCapital(Country country) {
		System.out.println(country.getCapital() + " is the capital of " + country.getName());
	}

	public void outCountOfRegion(Country country) {
		System.out.println("In " + country.getName() + " " + country.getCountOfRegion() + " region(s)");
	}

	public void outTotalArea(Country country) {
		System.out.println("Total area of " + country.getName() + " is " + country.getTotalArea());
	}

	public void outRegionalCenter(Country country) {
		Region[] region = country.getRegion();

		for (int i = 0; i < region.length; i++) {
			System.out.println(region[i].getRegionalCenter() + " is the region center of " + region[i].getName());
		}

	}

}

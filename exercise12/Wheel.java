package by.jonline.grow.programmingwithclass.exercise12;

public class Wheel {

	private String name;
	private boolean puncture;

	public Wheel(String name) {
		this.name = name;
		puncture = false;
	}

	public boolean getPuncture() {
		return puncture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPuncture(boolean puncture) {
		this.puncture = puncture;
	}

}

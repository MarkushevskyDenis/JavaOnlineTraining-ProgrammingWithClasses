package by.jonline.grow.programmingwithclass.exercise12;

public class Wheel {

	private String name;
	private boolean puncture;

	public Wheel(String name) {
		this.name = name;
		puncture = false;
	}

	public void fixWheel() {
		puncture = false;
	}

	public void changeWheel(Wheel wheel) {
		
		boolean copyPunc;

		copyPunc = wheel.puncture;
		wheel.puncture = this.puncture;
		this.puncture = copyPunc;

	}

	public void punctureWheel() {
		this.puncture = true;
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

}

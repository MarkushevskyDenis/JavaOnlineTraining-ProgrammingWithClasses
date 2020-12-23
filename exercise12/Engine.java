package by.jonline.grow.programmingwithclass.exercise12;

public class Engine {

	private String model;
	private double engineCapacity;
	private String fuelType;
	private boolean start;

	public Engine(String model, double engineCapacity, String fuelType) {
		this.model = model;
		this.engineCapacity = engineCapacity;
		this.fuelType = fuelType;
		this.start = false;
	}
/*
public boolean startEngine() {
		if (start == true) {
			return false;
		}
		start = true;
		return true;
	}

	public boolean stopEngine() {
		if (start == false) {
			return false;
		}
		start = false;
		return true;
	}
 */
	public void setModel(String model) {
		this.model = model;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	public String getModel() {
		return model;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public String getFuelType() {
		return fuelType;
	}

	public boolean isStart() {
		return start;
	}
}

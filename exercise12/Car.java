package by.jonline.grow.programmingwithclass.exercise12;

public class Car {

	private Engine engine;
	private Wheel[] wheels;
	private String model;
	private double fuelVolume;      //количество топлива в данный момент времени
	private double fuelConsumption;	//расход топлива
	private double tankVolume;		//объем бензобака

	{
		wheels = new Wheel[5];
		wheels[0] = new Wheel("front left");
		wheels[1] = new Wheel("front right");
		wheels[2] = new Wheel("rear left");
		wheels[3] = new Wheel("rear right");
	}

	public Car(Engine engine, Wheel wheel, String model, double fuelVolume, double fuelConsumption, double tankVolume) {

		this.engine = engine;
		this.wheels[4] = wheel;
		this.model = model;
		this.fuelConsumption = fuelConsumption;
		this.tankVolume = tankVolume;
		setFuelVolume(fuelVolume);
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setFuelVolume(double fuelVolume) {

		if (fuelVolume > tankVolume) {
			this.fuelVolume = tankVolume;
			System.out.println("fuel tank is full");
			return;
		}

		this.fuelVolume = fuelVolume;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public void setTankVolume(double tankVolume) {
		this.tankVolume = tankVolume;
	}

	public Engine getEngine() {
		return engine;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public String getModel() {
		return model;
	}

	public double getFuelVolume() {
		return fuelVolume;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public double getTankVolume() {
		return tankVolume;
	}
}

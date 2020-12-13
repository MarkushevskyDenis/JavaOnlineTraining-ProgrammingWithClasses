package by.jonline.grow.programmingwithclass.exercise12;

public class Car {

	private Engine engine;
	private Wheel[] wheel;
	private String model;
	private double fuelVolume;      //количество топлива в данный момент времени
	private double fuelConsumption;	//расход топлива
	private double tankVolume;		//объем бензобака

	{
		wheel = new Wheel[5];
		wheel[0] = new Wheel("front left");
		wheel[1] = new Wheel("front right");
		wheel[2] = new Wheel("rear left");
		wheel[3] = new Wheel("rear right");
	}

	public Car(Engine engine, Wheel wheel, String model, double fuelVolume, double fuelConsumption, double tankVolume) {

		if (fuelVolume > tankVolume) {
			fuelVolume = tankVolume;
		}

		this.engine = engine;
		this.wheel[4] = wheel;
		this.model = model;
		this.fuelVolume = fuelVolume;
		this.fuelConsumption = fuelConsumption;
		this.tankVolume = tankVolume;
	}

	public double drive(double distance) {

		double maxDistance;

		if (!engine.isStart()) {
			System.out.println("Error\nengine stopped");
			return 0.0;
		}

		maxDistance = 100 * fuelVolume / (fuelConsumption + fuelConsumptionFine()); //расчет макмимальной дистанции с учетом штрафа
		punctureWheel();

		if (maxDistance > distance) {
			fuelVolume -= distance * (fuelConsumption + fuelConsumptionFine()) / 100;
			stopEngine();
			return distance;
		} else {
			fuelVolume = 0;
			System.out.println("fuel ran out");
			stopEngine();
			return maxDistance;
		}

	}

	public void fillUp(String fuelType, double fuelVolume) {

		if (!fuelType.equals(engine.getFuelType())) {
			System.out.println("fuel type is incorrect");
			return;
		}

		if (fuelVolume + this.fuelVolume >= tankVolume) {
			this.fuelVolume = tankVolume;
		} else {
			this.fuelVolume += fuelVolume;
		}

	}

	public double fuelConsumptionFine() {						//штраф за пробитое колесо

		double fuelConsumptionFine = 0;

		for (int i = 0; i < 4; i++) {
			if (wheel[i].getPuncture() == true) {
				fuelConsumptionFine += 0.1 * fuelConsumption;
			}
		}

		return fuelConsumptionFine;

	}

	public void changeWheel(String wheelName) {

		Wheel wheel;

		wheel = CarLogic.findWheelByName(this.wheel, wheelName);

		if (wheel == null) {
			System.out.println("nothing");
			return;
		}

		if (wheel.getPuncture() == false) {
			System.out.println("changeWheel is not necessary");
			return;
		}

		if (this.wheel[4].getPuncture() == true) {
			System.out.println("spare wheel is punctured");
			return;
		}

		wheel.changeWheel(this.wheel[4]);

	}

	public void fixWheel(Wheel wheel) {

		if (wheel == null){
			System.out.println("nothing");
			return;
		}

		if (wheel.getPuncture() == true) {
			wheel.fixWheel();
			System.out.println("wheel repaired");
		} else {
			System.out.println("fixWheel is not necessary");
		}
	}

	public void punctureWheel() {					//случайно пробить колесо
		for (int i = 0; i < 4; i++) {
			if (CarLogic.rand()) {
				wheel[i].punctureWheel();
			}
		}
	}

	public void startEngine() {
		if (engine.startEngine() == false) {
			System.out.println("startEngine is not necessary");
		} else {
			System.out.println("car started up");
		}
	}

	public void stopEngine() {
		if (engine.stopEngine() == false) {
			System.out.println("stopEngine is not necessary");
		} else {
			System.out.println("car stopped");
		}
	}

	public Wheel[] getWheel() {
		return wheel;
	}
	
	public String getModel() {
		return model;
	}

}

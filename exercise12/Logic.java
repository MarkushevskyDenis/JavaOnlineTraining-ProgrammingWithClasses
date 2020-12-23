package by.jonline.grow.programmingwithclass.exercise12;

public class Logic {

    public static boolean rand() {
        int number;

        number = (int) (Math.random() * 40);

        if (number == 0) {
            return true;
        }
        return false;
    }

    //wheel
    public void changeWheel(Car car, Wheel wheel) {

        Wheel spareWheel = car.getWheels()[4];

        if (wheel == null) {
            System.out.println("nothing");
            return;
        }

        if (spareWheel == null) {
            System.out.println("spare wheel is not exist");
            return;
        }

        if (wheel.getPuncture() == false) {
            System.out.println("changeWheel is not necessary");
            return;
        }

        if (spareWheel.getPuncture() == true) {
            System.out.println("spare wheel is punctured");
            return;
        }

        wheel.setPuncture(false);
        spareWheel.setPuncture(true);

    }

    public void fixWheel(Wheel wheel) {

        if (wheel == null) {
            System.out.println("nothing");
            return;
        }

        if (wheel.getPuncture() == true) {
            wheel.setPuncture(false);
            System.out.println("wheel repaired");
        } else {
            System.out.println("fixWheel is not necessary");
        }
    }

    public void punctureWheel(Car car) {                    //случайно пробить колесо

        Wheel[] wheels = car.getWheels();

        for (int i = 0; i < 4; i++) {
            if (Logic.rand()) {
                wheels[i].setPuncture(true);
            }
        }
    }

    //engine
    public void startEngine(Car car) {

        Engine engine = car.getEngine();

        if (engine.isStart()) {
            System.out.println("startEngine is not necessary");
        } else {
            engine.setStart(true);
            System.out.println("car started up");
        }
    }

    public void stopEngine(Car car) {

        Engine engine = car.getEngine();

        if (!engine.isStart()) {
            System.out.println("stopEngine is not necessary");
        } else {
            engine.setStart(false);
            System.out.println("car stopped");
        }
    }

    //car
    public double drive(Car car, double distance) {

        double maxDistance;
        Engine engine = car.getEngine();
        double fuelVolume = car.getFuelVolume();
        double fuelConsumption = car.getFuelConsumption();

        if (!engine.isStart()) {
            System.out.println("Error\nengine stopped");
            return 0.0;
        }

        maxDistance = fuelVolume / (fuelConsumption + fuelConsumptionFine(car)); //расчет макмимальной дистанции с учетом штрафа
        punctureWheel(car);

        if (maxDistance > distance) {
            car.setFuelVolume(fuelVolume - distance * (fuelConsumption + fuelConsumptionFine(car)));
            stopEngine(car);
            return distance;
        } else {
            car.setFuelVolume(0);
            System.out.println("fuel ran out");
            stopEngine(car);
            return maxDistance;
        }

    }

    public void fillUp(Car car, String fuelType, double fuelVolume) {

        Engine engine = car.getEngine();

        if (!fuelType.equals(engine.getFuelType())) {
            System.out.println("fuel type is incorrect");
            return;
        }

        car.setFuelVolume(fuelVolume + car.getFuelVolume());

    }

    public double fuelConsumptionFine(Car car) {                        //штраф за пробитое колесо

        double fuelConsumptionFine = 0;
        Wheel[] wheel;

        wheel = car.getWheels();

        for (int i = 0; i < 4; i++) {
            if (wheel[i].getPuncture() == true) {
                fuelConsumptionFine += 0.1 * car.getFuelConsumption();
            }
        }

        return fuelConsumptionFine;

    }

}

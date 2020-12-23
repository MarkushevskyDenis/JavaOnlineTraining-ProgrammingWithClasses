package by.jonline.grow.programmingwithclass.exercise12;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы:
 * ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class AggregationAndComposition {
    public static void main(String[] args) {

        Car car = new Car(new Engine("V6", 0.6, "petrol"), new Wheel("spare wheel"), "BMW", 100, 9, 100);
        Logic logic = new Logic();
        UserViewAction viewAction = new UserViewAction();

        viewAction.outModel(car);

        viewAction.checkWheels(car);
        logic.startEngine(car);
        System.out.println(logic.drive(car, 1));
        logic.startEngine(car);
        System.out.println(logic.drive(car, 1));
        logic.startEngine(car);
        System.out.println(logic.drive(car, 1));
        logic.startEngine(car);
        System.out.println(logic.drive(car, 1));
        logic.startEngine(car);
        System.out.println(logic.drive(car, 1));
        logic.startEngine(car);
        System.out.println(logic.drive(car, 1));
        logic.startEngine(car);
        System.out.println(logic.drive(car, 1));
        logic.startEngine(car);
        System.out.println(logic.drive(car, 1));
        logic.startEngine(car);
        System.out.println(logic.drive(car, 1));
        logic.startEngine(car);
        System.out.println(logic.drive(car, 1));
        logic.startEngine(car);
        System.out.println(logic.drive(car, 1));
        viewAction.checkWheels(car);


        logic.changeWheel(car, car.getWheels()[0]);
        logic.changeWheel(car, car.getWheels()[1]);
        logic.changeWheel(car, car.getWheels()[2]);
        logic.changeWheel(car, car.getWheels()[3]);

        logic.stopEngine(car);

    }
}

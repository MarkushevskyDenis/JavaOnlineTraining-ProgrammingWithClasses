package by.jonline.grow.programmingwithclass.exercise12;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы:
 * ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class AggregationAndComposition {
	public static void main(String[] args) {

		Car car = new Car(new Engine("V6", 0.6, "petrol"), new Wheel("spare wheel"), "BMW", 100, 9, 100);
		
		car.startEngine();
		car.drive(300);
		car.checkWheel();
		car.startEngine();
		car.drive(300);
		car.checkWheel();
		car.startEngine();
		car.drive(300);
		car.checkWheel();
		car.startEngine();
		car.drive(300);
		car.checkWheel();
		car.fillUp("petrol", 100);
		car.startEngine();
		car.drive(300);
		car.checkWheel();
	}
}

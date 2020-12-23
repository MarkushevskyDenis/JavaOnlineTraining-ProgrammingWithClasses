package by.jonline.grow.programmingwithclass.exercise10;

/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class SimpleClassAndObject10 {
	public static void main(String[] arg) {

		Airline[] airlines = new Airline[10];
		for (int i = 0; i < airlines.length; i++) {
			if (i > 5) {
				airlines[i] = new Airline("Minsk" + i, "№" + i, "air" + i, new Time(12, 52, 0 + i), "sun/tue");
				continue;
			}
			airlines[i] = new Airline("Minsk" + i, "№" + i, "air" + i, new Time(12, 52, 0 + i), "mon");
		}
		Company company = new Company(airlines);
		View view = new View();

		view.out(company);
		System.out.println("-------------------");
		view.outByDayOfWeek(company,"mon");
		System.out.println("-------------------");
		view.outByDayOfWeek(company,"tue");
		System.out.println("-------------------");
		view.outByDestination(company,"Minsk2");
		System.out.println("-------------------");
		view.outByTimeAndDayOfWeek(company,"tue", new Time(1, 52, 7));

	}
}

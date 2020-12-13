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

		Airline[] airline1 = new Airline[10];
		for (int i = 0; i < airline1.length; i++) {
			if (i > 5) {
				airline1[i] = new Airline("Minsk" + i, "№" + i, "air" + i, new Time(12, 52, 0 + i), "sun/tue");
				continue;
			}
			airline1[i] = new Airline("Minsk" + i, "№" + i, "air" + i, new Time(12, 52, 0 + i), "mon");
		}
		Company company1 = new Company(airline1);
		company1.out();
		System.out.println("-------------------");
		company1.outByDayOfWeek("mon");
		System.out.println("-------------------");
		company1.outByDayOfWeek("tue");
		System.out.println("-------------------");
		company1.outByDestination("Minsk2");
		System.out.println("-------------------");
		company1.outByTimeAndDayOfWeek("tue", new Time(12, 52, 7));

	}
}

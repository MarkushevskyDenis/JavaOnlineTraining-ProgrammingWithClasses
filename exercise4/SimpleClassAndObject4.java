package by.jonline.grow.programmingwithclass.exercise4;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 */

public class SimpleClassAndObject4 {
	public static void main(String[] args) {

		Train[] train = new Train[10];

		train[0] = new Train("Минск", 1, "12:01");
		train[1] = new Train("Минск", 2, "01:00");
		train[2] = new Train("Минск", 3, "12:31");
		train[3] = new Train("Минск1", 4, "12:00");
		train[4] = new Train("Минск1", 5, "12:03");
		train[5] = new Train("Минск", 1, "12:01");
		train[6] = new Train("Минск", 2, "12:00");
		train[7] = new Train("Минск", 3, "12:01");
		train[8] = new Train("Минск1", 4, "12:00");
		train[9] = new Train("Минск1", 5, "12:03");
		
		for (int i = 0; i < train.length; i++) {
			System.out.println(train[i].toString());
		}
		System.out.println("--------------------------");

		Train.sort(train);
		for (int i = 0; i < train.length; i++) {
			System.out.println(train[i].toString());
		}
		
		System.out.println("--------------------------");

		Train.sortName(train);
		for (int i = 0; i < train.length; i++) {
			System.out.println(train[i].toString());
		}
		
		System.out.println("--------------------------");

		Train.out(train, 5);
		
		
	}

}

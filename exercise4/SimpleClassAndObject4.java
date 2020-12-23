package by.jonline.grow.programmingwithclass.exercise4;

import java.text.ParseException;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 */

public class SimpleClassAndObject4 {
	public static void main(String[] args) throws ParseException {



		Train[] trains = new Train[10];

		trains[0] = new Train("Минск", 1, "12:01");
		trains[1] = new Train("Минск", 2, "12:31");
		trains[2] = new Train("Минск", 3, "11:01");
		trains[3] = new Train("Минск1", 4, "1:31");
		trains[4] = new Train("Минск1", 5, "2:01");
		trains[5] = new Train("Минск", 1, "01:01");
		trains[6] = new Train("Минск", 2, "14:01");
		trains[7] = new Train("Минск", 3, "10:01");
		trains[8] = new Train("Минск1", 4, "12:35");
		trains[9] = new Train("Минск1", 5, "12:11");

		Depo depo = new Depo(trains);
		Logic logic = new Logic();
		View view = new View();

		view.out(depo);
		System.out.println("-----------");
		logic.sort(depo);
		view.out(depo);
		
	}

}

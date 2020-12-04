package by.jonline.grow.programmingwithclass.exercise5;

/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
 * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
 * позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class SimpleClassAndObject5 {
	public static void main(String[] args) {

		Counter counter = new Counter(0, 100, 0);

		while (counter.encrease()) {
			System.out.println(counter.getCount());
		}

	}
}

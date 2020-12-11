package by.jonline.grow.programmingwithclass.exercise6;

/**
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
 * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
 * заданное количество часов, минут и секунд.
 */

public class SimpleClassAndObject6 {
	public static void main(String[] args) {
		Time time = new Time();

		for (int i = 0; i < 100; i++) {
			time.reduceHour(i);
			time.reduceMinute(i);
			time.reduceSecond(i);
			System.out.print("-" + i + "|||||");
			time.out();
		}
		//часы
		System.out.print("------------------------");

		while (time.getHour() != 1) {
			while (time.getMinute() != 59) {

				while (time.getSecond() != 59) {
					time.increaseSecond(1);
					time.out();
				}
				time.increaseSecond(1);
				
				time.increaseMinute(1);
				time.out();
			}

			while (time.getSecond() != 59) {
				time.increaseSecond(1);
				time.out();
			}
			time.increaseSecond(1);

			time.increaseMinute(1);
			time.increaseHour(1);
			time.out();
		}

	}
}

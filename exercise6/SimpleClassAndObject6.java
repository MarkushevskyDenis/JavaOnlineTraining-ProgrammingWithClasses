package by.jonline.grow.programmingwithclass.exercise6;

/**
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
 * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
 * заданное количество часов, минут и секунд.
 */

public class SimpleClassAndObject6 {
    public static void main(String[] args) {

        Time time = new Time(1, 1, 0);

		/*time.increaseHour(0);
		time.increaseMinute(58);
		time.increaseSecond(0);*/


        time.reduceHour(0);
        time.reduceMinute(2);
        time.reduceSecond(2);

        for (int i = 0; i<3600; i++) {
            time.reduceSecond(1);
            time.out();
        }

        time.out();
    }
}

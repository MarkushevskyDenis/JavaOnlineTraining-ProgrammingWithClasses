package by.jonline.grow.programmingwithclass.exercise8;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class SimpleClassAndObject8 {
	public static void main(String[] args) {

		Customer[] s = new Customer[21];
		for (int i = 0; i < s.length; i++) {

			if (i >= 0 && i <= 6) {
				s[i] = new Customer(i, "Markushevsky", "Denis", "Andreevich", "Gikalo 9" + i, "0000 0000 0000 000" + i,
						"BY 25 MMBN 3012 0000 0000 0000 000" + i);
				continue;
			}

			if (i >= 7 && i <= 13) {
				s[i] = new Customer(i, "Markushevsky", "Denis", "Andreevich" + Math.pow(-1, i) * i, "Gikalo 9" + i,
						"0000 0000 0000 000" + i, "BY 25 MMBN 3012 0000 0000 0000 000" + i);
				continue;
			}

			s[i] = new Customer(i, "Markushevsky" + Math.pow(-1, i) * i, "Denis" + Math.pow(-1, i) * i,
					"Andreevich" + Math.pow(-1, i), "Gikalo 9" + i, "0000 0000 0000 000" + i,
					"BY 25 MMBN 3012 0000 0000 0000 000" + i);

		}

		Bank bank = new Bank(s);
		bank.out();
		System.out.println("--------------------");
		bank.sortCard("0000 0000 0000 0004", "0000 0000 0000 0014");

		System.out.println("--------------------");
		bank.sortABC();
		bank.out();
		System.out.println("--------------------");
		bank.sortCard("0000 0000 0000 0004", "0000 0000 0000 0014");
	}

}





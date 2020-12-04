package by.jonline.grow.programmingwithclass.exercise9;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class SimpleClassAndObject9 {
	public static void main(String[] args) {

		Book[] book = new Book[5];

		for (int i = 0; i < book.length; i++) {
			book[i] = new Book(i, "Война и мир" + i, "Толстой" + i, "ОАО книга" + i, 2000 + i, i, 200 + i,
					"книга" + i);
		}

		Library library = new Library(book);
		library.out();
		System.out.println("---------------------------");
		library.sortByAuthor("Толстой1");
		System.out.println("---------------------------");
		library.sortByPublishingHouse("ОАО книга2");
		System.out.println("---------------------------");
		library.sortByYear(2002);

	}
}


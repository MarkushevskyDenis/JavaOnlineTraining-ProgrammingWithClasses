package by.jonline.grow.programmingwithclass.exercise9;

public class Library {
	Book[] book;

	public Library(Book[] book) {
		this.book = book;
	}

	public void sortByAuthor(String author) {

		for (int i = 0; i < book.length; i++) {

			if (book[i].getAuthor().equals(author)) {
				System.out.println(book[i].toString());
			}

		}

	}

	public void sortByPublishingHouse(String publishingHouse) {
		for (int i = 0; i < book.length; i++) {

			if (book[i].getPublishingHouse().equals(publishingHouse)) {
				System.out.println(book[i].toString());
			}

		}
	}

	public void sortByYear(int year) {
		for (int i = 0; i < book.length; i++) {

			if (book[i].getYear() > year) {
				System.out.println(book[i].toString());
			}

		}
	}

	public void out() {

		for (int i = 0; i < book.length; i++) {
			System.out.println(book[i].toString());
		}

	}
}

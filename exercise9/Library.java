package by.jonline.grow.programmingwithclass.exercise9;

public class Library {
	private Book[] book;

	public Library(Book[] book) {
		this.book = book;
	}

	public Book[] getBook() {
		return book;
	}

	public void setBook(Book[] book) {
		this.book = book;
	}

	public void outByAuthor(String author) {

		for (int i = 0; i < book.length; i++) {

			if (book[i].getAuthor().equals(author)) {
				System.out.println(book[i].toString());
			}

		}

	}

	public void outByPublishingHouse(String publishingHouse) {
		for (int i = 0; i < book.length; i++) {

			if (book[i].getPublishingHouse().equals(publishingHouse)) {
				System.out.println(book[i].toString());
			}

		}
	}

	public void outByYear(int year) {
		for (int i = 0; i < book.length; i++) {

			if (book[i].getYear() >= year) {
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

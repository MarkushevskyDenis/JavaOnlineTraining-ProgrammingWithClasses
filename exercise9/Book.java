package by.jonline.grow.programmingwithclass.exercise9;

public class Book {
	private int id;
	private String bookName;
	private String author;
	private String publishingHouse;
	private int year;
	private int pages;
	private double price;
	private String type;

	public Book(int id, String bookName, String author, String publishingHouse, int year, int count, double price,
			String type) {
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.year = year;
		this.pages = count;
		this.price = price;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [id=" + id + ", bookName=" + bookName + ", author=" + author + ", publishingHouse="
				+ publishingHouse + ", year=" + year + ", count=" + pages + ", price=" + price + ", type=" + type + "]";
	}

}

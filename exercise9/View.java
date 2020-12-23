package by.jonline.grow.programmingwithclass.exercise9;

public class View {

    public void outByAuthor(Library library, String author) {

        boolean q = true;
        Book[] books;
        books = library.getBook();

        for (int i = 0; i < books.length; i++) {

            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i].toString());
                q = false;
            }

        }

        if (q){
            System.out.println("ничего");
        }

    }

    public void outByPublishingHouse(Library library, String publishingHouse) {

        boolean q = true;
        Book[] books;
        books = library.getBook();

        for (int i = 0; i < books.length; i++) {

            if (books[i].getPublishingHouse().equals(publishingHouse)) {
                System.out.println(books[i].toString());
                q = false;
            }

        }

        if (q){
            System.out.println("ничего");
        }

    }

    public void outByYear(Library library, int year) {

        boolean q = true;
        Book[] books;
        books = library.getBook();

        for (int i = 0; i < books.length; i++) {

            if (books[i].getYear() >= year) {
                System.out.println(books[i].toString());
                q = false;
            }

        }

        if (q){
            System.out.println("ничего");
        }

    }

    public void out(Library library) {

        boolean q = true;
        Book[] books;
        books = library.getBook();

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
            q = false;
        }

        if (q){
            System.out.println("ничего");
        }

    }

}

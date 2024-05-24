import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//      Tuščias konstruktorius
        Book book1 = new Book();
        book1.setTitle("Pride and Prejudice");
        book1.setPages(1000);
        book1.setReleaseYear(1813);

        Book book2 = new Book();
        book2.setTitle("The Lord of the Rings");
        book2.setPages(2000);
        book2.setReleaseYear(1949);

        Book book3 = new Book();
        book3.setTitle("The Great Gatsby");
        book3.setPages(3000);
        book3.setReleaseYear(1925);

//      metodas kuris isspausdina knygos aprasa (custom made, vietoj toString())
        book1.listBook();
        book2.listBook();
        book3.listBook();

//      Paprastas spausdinimas
        System.out.println("Book title: " + book1.getTitle() + "; " + "Book pages: " + book1.getPages() + "; " + "Book release year: " + book1.getReleaseYear());
        System.out.println("Book title: " + book2.getTitle() + "; " + "Book pages: " + book2.getPages() + "; " + "Book release year: " + book2.getReleaseYear());
        System.out.println("Book title: " + book3.getTitle() + "; " + "Book pages: " + book3.getPages() + "; " + "Book release year: " + book3.getReleaseYear());
        System.out.println("---------------------");


//      Pilnas konstruktorius
        Book book4 = new Book("To kill a Mockingbird", 1000, 1960);
        Book book5 = new Book("Jane Eyre", 2000, 1847);
        Book book6 = new Book("Moby-Dick", 3000, 1851);

//      Sutraukimas į masyvą
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

//      Naudojamas pilnam konstruktoriui
        for (Book book : books) {
            book.listBook();
//            System.out.println(book.getPages() + book.getTitle()); // Overwritas
//            System.out.println(book); // Overwritas
        }


    }
}
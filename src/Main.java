import java.util.ArrayList;

public class Main {
//    public static void main(String[] args) {
//
//
//        Book book1 = new Book(); //      Tuščias konstruktorius
//        book1.setTitle("Pride and Prejudice");
//        book1.setPages(1000);
//        book1.setReleaseYear(1813);
//
//        Book book2 = new Book();
//        book2.setTitle("The Lord of the Rings");
//        book2.setPages(2000);
//        book2.setReleaseYear(1949);
//
//        Book book3 = new Book();
//        book3.setTitle("The Great Gatsby");
//        book3.setPages(3000);
//        book3.setReleaseYear(1925);
//
//
//        book1.listBook(); //      metodas kuris isspausdina knygos aprasa (custom made, vietoj toString())
//        book2.listBook();
//        book3.listBook();
//
//
//        System.out.println("Book title: " + book1.getTitle() + "; " + "Book pages: " + book1.getPages() + "; " + "Book release year: " + book1.getReleaseYear());
//        System.out.println("Book title: " + book2.getTitle() + "; " + "Book pages: " + book2.getPages() + "; " + "Book release year: " + book2.getReleaseYear());
//        System.out.println("Book title: " + book3.getTitle() + "; " + "Book pages: " + book3.getPages() + "; " + "Book release year: " + book3.getReleaseYear());
//        System.out.println("---------------------"); //      Paprastas spausdinimas
//
//
//
//        Book book4 = new Book("To kill a Mockingbird", 1000, 1960);
//        Book book5 = new Book("Jane Eyre", 2000, 1847);
//        Book book6 = new Book("Moby-Dick", 3000, 1851); //      Pilnas konstruktorius
//
//
//        ArrayList<Book> books = new ArrayList<>();
//        books.add(book1);
//        books.add(book2);
//        books.add(book3); //      Sutraukimas į masyvą
//
//
//        for (Book book : books) { //      Naudojamas pilnam konstruktoriui
//            book.listBook();
////            System.out.println(book.getPages() + book.getTitle()); // Overwritas
////            System.out.println(book); // Overwritas
//        }
//
//
//    }

    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();

        Plant plant1 = new Plant();
        plant1.setName("Pomidoras");
        plant1.setNameLatin("La Tomato");
        plant1.setAnnual(true);
        plant1.setContinent("Europe");
        plant1.setHeight(2.5);
        plant1.setEdible(true);

        Plant plant2 = new Plant();
        plant2.setName("Agurkas");
        plant2.setNameLatin("La Agurkas");
        plant2.setAnnual(true);
        plant2.setContinent("Europe");
        plant2.setHeight(1.5);
        plant2.setEdible(true);

        plants.add(plant1);
        plants.add(plant2);

        plants.add(new Plant("White Giant", "Allium", false, "Africa", 2.0, false));
        plants.add(new Plant("Blue Crocus", "Tecophilaea cyanocrocus", true, "South America", 0.1, false));

        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }
}
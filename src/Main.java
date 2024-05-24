public class Main {
    public static void main(String[] args) {

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

        book1.listBook();
        book2.listBook();
        book3.listBook();


    }
}
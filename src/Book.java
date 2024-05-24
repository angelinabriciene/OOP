public class Book {
    private String title;
    private int pages;
    private int releaseYear;

    public Book() {
    }
    public void listBook() {
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Title: " + this.title);
        System.out.println("Pages: " + this.pages);
        System.out.println("Release year: " + this.releaseYear);
        System.out.println("---------------------");
    }

//    public Book(String title, int pages, int releaseYear) {
//        this.title = title;
//        this.pages = pages;
//        this.releaseYear = releaseYear;
//    }


    public void setTitle(String title) {
        this.title = title;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

//    public String getTitle() {
//        return this.title;
//    }
//    public int getPages() {
//        return this.pages;
//    }
//    public int getReleaseYear() {
//        return  this.releaseYear;
//    }



}

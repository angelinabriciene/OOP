public class Book {
    private String title;
    private int pages;
    private int releaseYear;

//  Tuščias konstruktorius
    public Book() {
    }

//  Pilnas konstruktorius
    public Book(String title, int pages, int releaseYear) {
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }

//  Naudojama For
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", releaseYear=" + releaseYear +
                '}';
    }

    public void listBook() {
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Title: " + this.title);
        System.out.println("Pages: " + this.pages);
        System.out.println("Release year: " + this.releaseYear);
        System.out.println("---------------------");
    }

//  Naudinga bet kokiam konstruktoriui
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


//  Naudinga bet kokiam konstruktoriui
    public String getTitle() {
        return this.title;
    }
    public int getPages() {
        return this.pages;
    }
    public int getReleaseYear() {
        return  this.releaseYear;
    }

}

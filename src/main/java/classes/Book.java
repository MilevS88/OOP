package classes;

public class Book {

    private String title;
    private String author;
    private int pages;

    public void displayInfo(String title, String authors, int pages) {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == "Gogol") {
            this.author = "Yanovskii";
        } else {
            this.author = author;
        }
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

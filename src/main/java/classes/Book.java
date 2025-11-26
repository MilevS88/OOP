package classes;

public class Book {
    // Поля класса
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.setAuthor(author); // используем сеттер для проверки
        this.pages = pages;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if ("Лев Толстой".equalsIgnoreCase(author)) {
            this.author = "Александр Пушкин"; // Меняем автора, если указали Толстого
        } else {
            this.author = author;
        }
    }

    public void displayInfo() {
        System.out.println("Название книги: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Количество страниц: " + pages);
    }
}
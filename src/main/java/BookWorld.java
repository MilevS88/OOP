import classes.Book;

public class BookWorld {
    public static void main(String[] args) {
        // Создаем первый объект книги
        Book book1 = new Book("Анна Каренина", "Лев Толстой", 864);

        // Создаем второй объект книги
        Book book2 = new Book("Идиот", "Фёдор Достоевский", 576);

        // Выводим информацию о книгах
        System.out.println("\nКнига №1:");
        book1.displayInfo();

        System.out.println("\nКнига №2:");
        book2.displayInfo();
    }
}
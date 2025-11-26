package classes;

public class MainPage {

    private String url;
    private String title;
    private int size;

    public MainPage() {}

    public MainPage(String url) {
        this.url = url;
    }

    public MainPage(String url, String title, int size) {
        this.url = url;
        this.title = title;
        this.size = size;
    }

    public void isSizeLessThan(int maxSize) {
        boolean result = this.size < maxSize;
        if (result) {
            System.out.println("Размер страницы '" + title + "' меньше заданного числа!");
        } else {
            System.out.println("Размер страницы '" + title + "' больше или равен заданному числу.");
        }
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        MainPage page1 = new MainPage(); // пустой объект
        page1.url = "https://page1.example.com";
        page1.title = "Страница #1";
        page1.size = 3000;

        MainPage page2 = new MainPage("https://page2.example.com"); // объект с URL
        page2.title = "Страница #2";
        page2.size = 4500;

        MainPage page3 = new MainPage("https://page3.example.com", "Страница #3", 5000); // объект с полным набором параметров

        page1.isSizeLessThan(3500);
        page2.isSizeLessThan(4000);
        page3.isSizeLessThan(6000);
    }
}

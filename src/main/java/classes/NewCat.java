//Файл /src/main/java/classes/NewCat.java
package classes;
// Создаем класс (чертеж)
public class NewCat {
    // Состояние (поля класса)
    private String name;
    private int age;
    private String color;
    // Конструктор
    public NewCat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("New cat created: name - " + this.name + ", age - "
                + this.age + ", color - " + this.color);
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        //В нашей стране чёрные кошки запрещены
        if (color == "black") {
            this.color = "grey";
        } else {
            this.color = color;
        }
    }
    public void meow() {
        System.out.println("Miau! My name is " + this.name + " I am "
                + this.age + " year old, my color is " + this.color);
    }
    public void eat() {
        System.out.println(this.name + " is eating.");
    }
}

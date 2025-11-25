//Файл /src/main/java/classes/Cat.java
package classes;
// Создаем класс (чертеж)
public class Cat {
    // Состояние (поля класса)
    public String name;
    public int age;
    public String color;
    // Поведение (методы класса)
    public void meow() {
        System.out.println("May " + name);
    }
    public void eat() {
        System.out.println(name + " eat");
    }
}

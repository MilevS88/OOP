//Файл: /src/main/java/CatWorld.java
import classes.Cat;
import classes.NewCat;
public class CatWorld {
    public static void main(String[] args) {
        // Создаем объект barsik по чертежу Cat
        Cat barsik = new Cat();
        // Задаем состояние объекта barsik
        barsik.name = "Барсик";
        barsik.age = 2;
        barsik.color = "Рыжий";
        // Вызываем поведение объекта barsik
        barsik.meow(); // Выведет: Мяу! Меня зовут Барсик
        barsik.eat();  // Выведет: Барсик кушает.

        NewCat murzik = new NewCat("Murzik", 3, "white");
        murzik.meow();
        murzik.setAge(5);
        System.out.println("Age of our cat is: " + murzik.getAge());
        murzik.setColor("black");

        murzik.meow();
    }
}

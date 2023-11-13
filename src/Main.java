import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Создайте класс Animal, где поле name - название животного.
        //Используя Comparable, задайте сортировку по полю name в алфавитном порядке.
        //Коллекцию использовать на свое усмотрение.
        TreeSet <Animal> animals = new TreeSet<>();
        animals.add(new Animal("Cat"));
        animals.add(new Animal("Dog"));
        animals.add(new Animal("Elk"));
        animals.add(new Animal("Frog"));
        animals.add(new Animal("Elephant"));
        animals.add(new Animal("Parrot"));
        animals.add(new Animal("Wolf"));
        animals.add(new Animal("Mouse"));

        for (Animal a:animals) {
            System.out.println(a);
        }

    }
}
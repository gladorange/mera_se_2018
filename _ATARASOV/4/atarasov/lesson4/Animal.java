package atarasov.lesson4;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Я " + name;
    }

    public void walk() {
        System.out.println("Я гуляю");
    }

    public static void main(String[] args) {
        Animal a = new Animal("Кошка Машка");
        Animal b = new Animal("Собка Бобик");
        System.out.println(a);
        System.out.println(b);
    }

    public static String getClassName() {
        return "Animal";
    }
}

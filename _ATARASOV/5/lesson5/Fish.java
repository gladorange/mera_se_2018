package lesson5;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Я -  рыбка" + name;
    }

    @Override
    public void walk() {
        System.out.println("Буль-буль-буль");
    }
}

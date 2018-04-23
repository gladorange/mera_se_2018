package atarasov.lesson4;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Я -  рыбка" + name;
    }
}

package lesson5;

public class Zebra extends Animal implements VeganAnimal {

    public Zebra(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public void walk() {
        System.out.println("Зебра бегает в зоопарке");
    }

    @Override
    public void eatGrass(String typeOfGrass) {
        System.out.println("Зебра съела травку:" + typeOfGrass);
    }
}



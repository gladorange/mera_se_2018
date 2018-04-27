package lesson5;

class Wolf extends Animal implements WildAnimal {

    public Wolf(String name) {
        super(name);
    }

    @Override
    public void eatSomebody(String somebody) {
        System.out.println("Волк съел " + somebody);
    }

    @Override
    public void walk() {
        System.out.println("Волк бегает в лесу");
    }
}

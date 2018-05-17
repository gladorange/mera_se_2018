package src;

public class Dog extends Animal {
    private String volume;

    public Dog(String name, String volume) {
        super(name);
        this.volume = volume;
    }

    @Override
    public void sayHello() {
        if (volume == "loud") {
            System.out.println("ГАВ");
        } else {
            System.out.println("гав");
        }
    }
}

package src;

public class Cat extends Animal {
    private int mustache;

    public Cat(String name, int mustache) {
        super(name);
        this.mustache = mustache;
    }

    @Override
    public void sayHello() {
        if (this.mustache > 5) {
            System.out.println("Мяу, я кошка с длинными усами");
        } else {
            System.out.println("Мяу, я кошка с усами");
        }
    }
}

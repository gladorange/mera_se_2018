package zudin.task8;

public class Zebra extends Animal {
    private int lineAmount;

    public Zebra(String name, int lineAmount) {
        super(name);
        this.lineAmount = lineAmount;
    }

    @Override
    public void sayHello() {
        System.out.println("Иго-го, я полосатая лошадь");
    }
}

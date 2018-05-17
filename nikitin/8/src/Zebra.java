package src;

public class Zebra extends  Animal{
    private int lines;

    public Zebra(String name, int lines) {
        super(name);
        this.lines = lines;
    }

    @Override
    public void sayHello() {
        System.out.println("ээээээ");
    }
}

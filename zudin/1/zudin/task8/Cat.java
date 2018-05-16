package zudin.task8;

public class Cat extends Animal {
private int mustacheLength;

    public Cat(String name, int mustacheLength) {
        super(name);
        this.mustacheLength = mustacheLength;
    }

    @Override
    public void sayHello() {
        if (mustacheLength > 5 ){
            System.out.println("Мяу, я кошка с длинными усами");
        } else {
            System.out.println("Мяу, я кошка");
        }
    }
}

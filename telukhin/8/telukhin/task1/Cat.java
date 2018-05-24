package telukhin.task1;

public class Cat extends Animal {
    private int mustacheLength;

    public Cat(String name, int mustacheLength) {
        super(name);
        this.mustacheLength = mustacheLength;
    }

    @Override
    void sayHello() {
        if (mustacheLength > 5) {
            System.out.println(String.format("Мяу, я кошка с длинными усами. Длина усов %s", mustacheLength));
        }
    }
}

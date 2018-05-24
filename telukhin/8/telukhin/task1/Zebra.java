package telukhin.task1;

public class Zebra extends Animal {
    private int countStripsInBody;

    public Zebra(String name, int countStripsInBody) {
        super(name);
        this.countStripsInBody = countStripsInBody;
    }

    @Override
    void sayHello() {
        if (countStripsInBody > 5) {
            System.out.println(String.format("А я - зебра с полосками. Количество полосок %s", countStripsInBody));
        }
    }
}

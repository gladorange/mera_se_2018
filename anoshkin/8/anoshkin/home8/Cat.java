package anoshkin.home8;

public class Cat extends Animal {
    private Integer length = 0;

    public Cat(String name, int length){
        super(name);
        this.length = length;
    }

    @Override
    public void sayHello() {
        if ((length > 5)) {
            System.out.println("Мяу, я кошка с длинными усами");
        } else {
            System.out.println("Мяу");
        }
    }
}

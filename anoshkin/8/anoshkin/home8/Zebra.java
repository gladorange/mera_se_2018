package anoshkin.home8;

public class Zebra extends Animal {
    private Integer stripes = 0;

    public Zebra(String name, int stripes){
        super(name);
        this.stripes = stripes;
    }

    @Override
    public void sayHello() {
        if ((stripes > 5)) {
            System.out.println("Тпрууу, я зебра и у меня много полосок");
        } else {
            System.out.println("Тпрууу");
        }
    }
}
package lesson5;

public class Dog extends Animal {

    public Dog() {
        super("Безымянный");
    }
    public Dog(String name) {
        super(name);
    }

  /*  @Override
    public String toString() {
        return "Я собака " + name;
    }*/

    @Override
    public void walk() {
        System.out.println("Я иду в парк");
    }

    public void waff() {
        System.out.println("Гав-гав!");
    }
    public static void main(String[] args) {
        String s = "s";
        Animal d = new Dog();
        d.walk();
        if (d instanceof Dog) {
            Dog sobaka = (Dog) d;
            sobaka.waff();
        }
        System.out.println(Animal.getClassName());
        System.out.println(Dog.getClassName());

    }

    public static String getClassName() {
        return "Dog";
    }


}

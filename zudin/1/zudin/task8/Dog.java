package zudin.task8;

public class Dog extends Animal {
    private String barkingVolume;

    public Dog(String name, String barkingVolume) {
        super(name);
        this.barkingVolume = barkingVolume;
    }

    @Override
    public void sayHello() {
        System.out.println("Гав-гав, я злая собака");
    }
}

package zudin.task9;

public class Dog extends Animal {
    private String barkingVolume;

    public String getBarkingVolume() {
        return barkingVolume;
    }

    public Dog(String name, String barkingVolume) {
        super(name);
        this.barkingVolume = barkingVolume;
    }

    @Override
    public String getParameter() {
        return String.format("громкостьЛая: \"" + getBarkingVolume());
    }
}

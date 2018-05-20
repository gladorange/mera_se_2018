package src;

public class Dog extends Animal {
    private String volume;

    public Dog(String name, String volume) {
        super(name);
        this.volume = volume;
    }

    @Override
    public String getParameter() {
        return String.format("\"Volume\" : \"%s\"", volume);
    }
}

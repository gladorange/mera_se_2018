package src;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract String getParameter();

}

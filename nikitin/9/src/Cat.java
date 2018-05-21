package src;

public class Cat extends Animal {
    private int mustache;

    public Cat(String name, int mustache) {
        super(name);
        this.mustache = mustache;
    }

    @Override
    public String getParameter() {
        return String.format("\"Mustache\" : \"%d\"", mustache);
    }
}

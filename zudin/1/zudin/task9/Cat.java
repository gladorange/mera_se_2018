package zudin.task9;

public class Cat extends Animal {

    private int mustacheLength;

    public int getMustacheLength() {
        return mustacheLength;
    }

    public Cat(String name, int mustacheLength) {
        super(name);
        this.mustacheLength = mustacheLength;
    }

    @Override
    public String getParameter() {
        return String.format("длинаУсов: \"" +  getMustacheLength());
    }
}

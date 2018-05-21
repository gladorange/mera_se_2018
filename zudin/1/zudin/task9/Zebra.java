package zudin.task9;

public class Zebra extends Animal {
    private int lineAmount;

    public int getLineAmount() {
        return lineAmount;
    }

    public Zebra(String name, int lineAmount) {
        super(name);
        this.lineAmount = lineAmount;
    }

    @Override
    public String getParameter() {
        return String.format("количествоПолосок: \"" + getLineAmount());
    }
}

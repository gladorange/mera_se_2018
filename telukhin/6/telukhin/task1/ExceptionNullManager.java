package telukhin.task1;

public class ExceptionNullManager extends Exception {
    public String info;

    public ExceptionNullManager(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

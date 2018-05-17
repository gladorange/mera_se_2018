package telukhin.task1;

public class ExceptionWrongSurname extends Exception {
    public String info;

    public ExceptionWrongSurname(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

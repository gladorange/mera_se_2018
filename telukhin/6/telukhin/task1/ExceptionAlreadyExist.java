package telukhin.task1;

public class ExceptionAlreadyExist extends Exception {
    public String info;

    public ExceptionAlreadyExist(String info) {
        this.info = info;
    }
}

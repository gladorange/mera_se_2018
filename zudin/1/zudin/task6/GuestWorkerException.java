package zudin.task6;

public class GuestWorkerException extends Exception {

    private String info;

    public GuestWorkerException(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

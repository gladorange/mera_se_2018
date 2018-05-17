package zudin.task6;


public class NonUniqueWorkerException extends Exception {
    private String info;

    public NonUniqueWorkerException(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

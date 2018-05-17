package zudin.task6;

public class AnarchistException extends Exception {
    private String info;

    public AnarchistException(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

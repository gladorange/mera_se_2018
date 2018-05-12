package zudin.task6;


public class NonUniqueWorker extends Exception {
    private String info;

    public NonUniqueWorker (String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

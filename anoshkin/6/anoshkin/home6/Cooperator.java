package anoshkin.home6;

public abstract class Cooperator {
    protected String FIO;
    private String pattern = "[А-Яа-я]+";

    public class Foreigner extends Exception{
        public Foreigner(String fio) {
            super(fio);
        }
    }

    public Cooperator (String FIO) throws Foreigner{
        if (FIO.matches(pattern)) {
            this.FIO = FIO;
        }
        else throw new Foreigner(FIO);
    }

    public String getFIO(){
        return FIO;
    }
}

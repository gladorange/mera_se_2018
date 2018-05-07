package anoshkin.home6;

public class Worker extends Cooperator {

    private Manager manager;

    public Worker(String FIO) throws Foreigner{
        super(FIO);
    }

    @Override
    public String getFIO() {
        return FIO;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        return this.hashCode() == ((Cooperator)obj).hashCode();
    }

    @Override
    public int hashCode() {
        return FIO.hashCode();
    }
}

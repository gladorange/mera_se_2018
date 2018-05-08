package anoshkin.home6;

public class Manager extends Cooperator{

    protected String department;

    public Manager(String FIO, String department) throws Foreigner{
        super(FIO);
        this.department = department;
    }

    @Override
    public String getFIO() {
        return FIO;
    }

    public String getDepartment(){
        return this.department;
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

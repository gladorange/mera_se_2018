package terletskiy.task1;

public class Worker extends Employee {

    private Manager manager;

    public Worker(String fam, String imya, String otche, Manager manager) {

        super(fam, imya, otche);
        this.manager = manager;
    }

    public Manager getManager(){
        return manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fam='" + fam + '\'' +
                ", imya='" + imya + '\'' +
                ", otche='" + otche + '\'' +
                ", manager=" + manager +
                '}';
    }
}

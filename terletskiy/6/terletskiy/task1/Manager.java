package terletskiy.task1;

public class Manager extends Employee{

    private final String otdel;

    public Manager(String fam, String imya, String otche, String otdel) {
        super(fam, imya, otche);
        this.otdel = otdel;
    }
}

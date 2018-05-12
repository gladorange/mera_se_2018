package terletskiy.task1;
import java.util.regex.Pattern;


public class Employee {
    private final String fam;
    private final String imya;
    private final String otche;
    private Manager manager;

    @Override
    public String toString() {
        return "Employee{" +
                "fam='" + fam + '\'' +
                ", imya='" + imya + '\'' +
                ", otche='" + otche + '\'' +
                ", manager=" + manager +
                '}';
    }

    public Employee(String fam, String imya, String otche) {
        valiodateCyrillic(fam);
        this.fam = fam;
        this.imya = imya;
        this.otche = otche;
        this.manager = null;
    }

    // символы, отличные от кириллицы - должно выкинуться исключение.
    private void valiodateCyrillic(String fam) {
        String cyrillicOnly = "^[А-Яa-я]*";
        if(!Pattern.matches(cyrillicOnly, fam))
        {
            throw new RuntimeException("символы, отличные от кириллицы - должно выкинуться исключение. fam: " + fam);
        }
    }

    public Employee(String fam, String imya, String otche, Manager manager) {
        this(fam,imya, otche);
        this.manager = manager;
    }
    public Manager getManager(){
        return manager;
    }
}

package terletskiy.task1;
import java.util.regex.Pattern;


public class Employee {
    protected final String fam;
    protected final String imya;
    protected final String otche;

    @Override
    public String toString() {
        return "Employee{" +
                "fam='" + fam + '\'' +
                ", imya='" + imya + '\'' +
                ", otche='" + otche + '\'';
    }

    public Employee(String fam, String imya, String otche) {
        valiodateCyrillic(fam);
        this.fam = fam;
        this.imya = imya;
        this.otche = otche;
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
    }
}

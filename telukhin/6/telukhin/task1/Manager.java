package telukhin.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager extends Emploee {
    private String department;

    public Manager(String name, String surname, String department) throws ExceptionWrongSurname {
        super(name, surname);
        this.department = department;
    }
}

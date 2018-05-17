package telukhin.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager extends Emploee {
    private String department;

    public Manager(String name, String surname, String department) throws ExceptionWrongSurname {
        super(name, surname);
        CharSequence source = surname;
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher matcher = pattern.matcher(source);
        if (matcher.matches()){
            throw new ExceptionWrongSurname("Только по РУССКИЕ буквы в фамили! \nНеверная фамилия у " + name);
        }
        this.department = department;
    }
}

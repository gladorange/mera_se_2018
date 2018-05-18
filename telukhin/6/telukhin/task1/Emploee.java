package telukhin.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emploee {
    private String name;
    private String surname;

    public Emploee(String name, String surname) throws ExceptionWrongSurname {
        this.name = name;
        this.surname = surname;
        CharSequence source = surname;
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher matcher = pattern.matcher(source);
        if (matcher.matches()){
            throw new ExceptionWrongSurname("Только по РУССКИЕ буквы в фамилии! \nНеверная фамилия у " + name);
        }
    }

    public String getName() {
        return name;
    }
}

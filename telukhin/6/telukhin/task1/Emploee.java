package telukhin.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emploee {
    private String name;
    private String surname;

    public Emploee(String name, String surname) throws ExceptionWrongSurname{
        CharSequence source = surname;
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher matcher = pattern.matcher(source);
        if (matcher.matches()){
            throw new ExceptionWrongSurname("Только по РУССКИЕ буквы в фамили! \nНеверная фамилия у " + name);
        }
        this.name = name;
        this.surname = surname;
    }
}

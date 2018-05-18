package telukhin.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emploee {
    private String name;
    private String surname;

    public Emploee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
}

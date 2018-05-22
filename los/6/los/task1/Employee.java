package los.task1;

import java.util.Objects;
import java.util.regex.*;

public abstract class Employee
{
    protected static final Pattern PATTERN_ONLY_CYRILLIC_SYMBOLS = Pattern.compile("[а-яёА-ЯЁ]+");

    private String name;
    private String surname;
    private String patronymic;

    public Employee(String name, String patronymic, String surname) throws OnlyCyrillicSymbols
    {
        checkSurname(surname);

        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object e)
    {
        return (e != null)
                && (e instanceof Employee)
                && (((Employee)e).name.equals(this.name))
                && (((Employee)e).patronymic.equals(this.patronymic))
                && (((Employee)e).surname.equals(this.surname));
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.surname);
        hash = 17 * hash + Objects.hashCode(this.patronymic);
        return hash;
    }

    private void checkSurname(String surname) throws OnlyCyrillicSymbols
    {
        Matcher mat = PATTERN_ONLY_CYRILLIC_SYMBOLS.matcher(surname);
        if(!mat.matches())
        {
            throw new OnlyCyrillicSymbols();
        }
    }
}

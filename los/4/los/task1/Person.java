package los.task1;

public class Person {
    private String name;
    private String surname;
    private int yearBirthday;
    private String country;
    protected static final String defaultSurname = "Not known surname";
    protected static final String defaultCountry = "Not known country";
    protected static final int defaultYearBirthday = 0;
    private static long counterObjectsClass = 0;

    public Person(String name, String surname, int yearBirthday, String country)
    {
        this.name = name;
        this.surname = surname;
        this.yearBirthday = yearBirthday;
        this.country = country;
        counterObjectsClass ++;
    }

    public Person(String name, String surname, int yearBirthday)
    {
        this.name = name;
        this.surname = surname;
        this.yearBirthday = yearBirthday;
        this.country = defaultCountry;
        counterObjectsClass ++;
    }

    public Person(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
        this.yearBirthday = defaultYearBirthday;
        this.country = defaultCountry;
        counterObjectsClass ++;
    }

    public Person(String name)
    {
        this.name = name;
        this.surname = defaultSurname;
        this.yearBirthday = defaultYearBirthday;
        this.country = defaultCountry;
        counterObjectsClass ++;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getSurname()
    {
        return this.surname;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public int getYearBirthday()
    {
        return this.yearBirthday;
    }
    public void setYearBirthday(int yearBirthday)
    {
        this.yearBirthday = yearBirthday;
    }
    public String getCountry()
    {
        return this.country;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public long getCounterObjectsClass()
    {
        return this.counterObjectsClass;
    }

    public void printInfo()
    {
        System.out.format("%s %s was born in %d \n", this.surname, this.name, this.yearBirthday);
    }
}

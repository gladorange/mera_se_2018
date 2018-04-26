package telukhin.task1;

public class Person {
    private String firstName;
    private String lastName;
    private int yearBirth;
    private String country;
    private static int personCount = 0;

    public Person(String firstName, String lastName, int yearBirth, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBirth = yearBirth;
        this.country = country;
        personCount++;
    }

    public Person(String firstName, String lastName, int yearBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBirth = yearBirth;
        personCount++;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        personCount++;
    }

    public Person(String firstName) {
        this.firstName = firstName;
        personCount++;
    }

    public void printInfo() {
        System.out.println(String.format("%s %s, родился в %d году",
                this.firstName,
                this.lastName,
                this.yearBirth));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static int getPersonCount() {
        return personCount;
    }
}

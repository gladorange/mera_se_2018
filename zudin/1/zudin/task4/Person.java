package zudin.task4;

public abstract class Person {

    protected String firstName;
    protected String lastName;
    protected String dateOfBirth;

    public Person(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;

    }

    public void printInfo() {
        System.out.printf("%s %s ", lastName, firstName);
        if (dateOfBirth != null) {
            System.out.println("родился в " + dateOfBirth);
        } else {
            System.out.println();
        }
    }
}

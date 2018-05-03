package terletskiy.task1;

public class Person
{
    private final String firstName;
    private final String lastName;
    private final int birthYear;

    private static int objectCounter = 0;

    public Person(String firstName, String lastName, int birthYear){

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        objectCounter++;
    }

    public Person(Person person){
        this(person.firstName, person.lastName, person.birthYear);
    }

    public static int getObjectCounter() {
        return objectCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    // выводит информацию о человека в формате (ФИ родился в таком-то году)
    public void printInfo(){
        System.out.println(String.format("%S %S родился в %d году", firstName, lastName, birthYear));
    }

    @Override
    public String toString() {
        return firstName + ' '  + lastName;
    }
}
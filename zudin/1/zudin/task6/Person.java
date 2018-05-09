package zudin.task6;

public abstract class Person {

    protected String firstName;
    protected String secondName;
    protected String lastName;
    protected String fio;


    Person(String lastName, String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.fio = this.firstName + " " + this.secondName + " " + this.lastName;
    }

}
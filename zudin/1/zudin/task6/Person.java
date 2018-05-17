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

     @Override
    public boolean equals(Object o) {

        Person otherPerson = (Person) o;
        return this.fio.equals(otherPerson.fio);
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = hash * 17 + fio.hashCode();
        return hash;
    }

}
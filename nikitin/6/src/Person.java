package src;



public abstract class Person {
    public class InvalidNameExeption extends CompanyException {
        public InvalidNameExeption(String info) {
            super(info);
        }
    }


    protected String name;
    protected String secondName;
    protected String fatherName;

    public Person(String name, String secondName, String fatherName) throws CompanyException {
        final String r = new String(".*[A-Za-z0-9].*");

        if (name.matches(r)) {
            throw new InvalidNameExeption("Name " + name + " contains invalid symbols");
        }

        if (secondName.matches(r)) {
            throw new InvalidNameExeption("Second name " + secondName + " contains invalid symbols");
        }

        if (fatherName.matches(r)) {
            throw new InvalidNameExeption("Father name " + fatherName + " contains invalid symbols");
        }

        this.name = name;
        this.secondName = secondName;
        this.fatherName = fatherName;
    }
}

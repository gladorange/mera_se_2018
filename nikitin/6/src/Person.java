package src;

public abstract class Person {
    protected String name;
    protected String secondName;
    protected String fatherName;

    public class InvalidNameException extends CompanyException {
        public InvalidNameException(String info) {
            super(info);
        }
    }

    public Person(String name, String secondName, String fatherName) throws CompanyException {
        final String r = ".*[A-Za-z0-9].*";

        if (name.matches(r)) {
            throw new InvalidNameException("Name " + name + " contains invalid symbols");
        }

        if (secondName.matches(r)) {
            throw new InvalidNameException("Second name " + secondName + " contains invalid symbols");
        }

        if (fatherName.matches(r)) {
            throw new InvalidNameException("Father name " + fatherName + " contains invalid symbols");
        }

        this.name = name;
        this.secondName = secondName;
        this.fatherName = fatherName;
    }
}

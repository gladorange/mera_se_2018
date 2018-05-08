package src;

public class Manager extends Person {
    private  String department;

    public Manager(String name, String secondName, String fatherName, String department) throws CompanyException {
        super(name, secondName, fatherName);
        this.department = department;
    }
}


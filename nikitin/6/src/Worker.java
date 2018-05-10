package src;

public class Worker extends Person {
    private Manager manager;

    public class NullManagerException extends CompanyException {
        public NullManagerException(String info) {
            super(info);
        }
    }

    public Worker(String name, String secondName, String fatherName, Manager manager) throws CompanyException {
        super(name, secondName, fatherName);

        if (manager == null) {
            throw new NullManagerException(
                    String.format("Cannot add an employee \"%s %s %s\" with empty manager",
                            secondName, name, fatherName));
        }
        this.manager = manager;
    }
}

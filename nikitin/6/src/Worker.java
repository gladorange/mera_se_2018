package src;

public class Worker extends Person {
    private Manager manager;

    public class NullManagerExeption extends CompanyException {
        public NullManagerExeption(String info) {
            super(info);
        }
    }

    public Worker(String name, String secondName, String fatherName, Manager manager) throws CompanyException {
        super(name, secondName, fatherName);

        if (manager == null) {
            throw new NullManagerExeption(
                    String.format("Cannot add an employee \"%s %s %s\" with empty manager",
                            secondName, name, fatherName));
        }
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}

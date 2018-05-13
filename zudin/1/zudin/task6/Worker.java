package zudin.task6;

public class Worker extends Person {

    private Manager manager;

    public Worker(String lastName, String firstName, String secondName, Manager manager) {
        super(lastName, firstName, secondName);
        this.setManager(manager);

    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}





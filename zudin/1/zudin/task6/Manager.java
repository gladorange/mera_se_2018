package zudin.task6;

public class Manager extends Person {

    private String department;

    public Manager(String lastName, String firstName, String secondName, String department) {
        super(lastName, firstName, secondName);
        this.setDepartment(department);
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

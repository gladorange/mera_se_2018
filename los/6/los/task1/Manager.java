package los.task1;

import java.util.Objects;

public class Manager extends Employee
{
    private String department;

    public Manager(String name, String patronymic, String surname, String department) throws OnlyCyrillicSymbols
    {
        super(name, patronymic, surname);
        this.department = department;
    }

    public boolean equals(Object m)
    {
        return (m != null)
                && (m instanceof Manager)
                && (super.equals((Employee)m))
                && (((Manager)m).department.equals(this.department));
    }

    public String getDepartment()
    {
        return this.department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.department);
        return hash;
    }
}

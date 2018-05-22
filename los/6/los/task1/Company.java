package los.task1;

import java.util.HashSet;

public class Company
{
    private HashSet<Employee> employees;
    private HashSet<String> departments;

    public Company()
    {
        employees = new HashSet<>();
        departments = new HashSet<>();
    }

    //@Override
    public void addEmployee(String name, String patronymic, String surname, Manager manager) throws OnlyCyrillicSymbols, DuplicateEmployee, AbsentManager
    {
        Worker w;
        w = new Worker(name, patronymic, surname, manager);
        addEmployee(w);
    }

    //@Override
    public void addEmployee(String name, String patronymic, String surname, String department) throws OnlyCyrillicSymbols, DuplicateEmployee
    {
        Manager m;
        m = new Manager(name, patronymic, surname, department);
        addEmployee(m);
    }

    public Manager getManager(String name, String patronymic, String surname, String department)
    {
        for(Employee emp:employees)
        {
            if((emp instanceof Manager)
                    && (((Manager)emp).getName().equals(name))
                    && (((Manager)emp).getPatronymic().equals(patronymic))
                    && (((Manager)emp).getSurname().equals(surname))
                    && (((Manager)emp).getDepartment().equals(department)))
            {
                return (Manager)emp;

            }
        }
        return null;
    }

    private void addEmployee(Employee emp) throws DuplicateEmployee
    {
        if (!employees.add(emp))
        {
            throw new DuplicateEmployee();
        }
    }
}

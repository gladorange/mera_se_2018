package terletskiy.task1;

import java.util.HashSet;

public class CompanyList {
    HashSet<Employee> employeeList = new HashSet<Employee>();

    public void add(Employee employee)
    {
        if (employeeList.contains(employee))
        {
            throw new RuntimeException("employee already exist: " + employee.toString());
        }
        employeeList.add(employee);
    }
    // При попытке добавления на предприятие сотрудника (Employee) с пустым менеджером - должно выкинуться исключение (используйте перегрузку функций) .
    // Предроложу что задании опечатка -     работника (Worker)
    public void add(Worker worker){
        if (worker.getManager() == null)
        {
            throw new RuntimeException("worker has no manager: " + worker.toString());
        }
        add((Employee) worker);
    }

    public void add(Manager manager){
        add((Employee) manager);
    }
}

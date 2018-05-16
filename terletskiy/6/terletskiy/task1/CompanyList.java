package terletskiy.task1;

import java.util.HashSet;

public class CompanyList {
    private HashSet<Employee> employeeList = new HashSet<Employee>();

    // При попытке добавления на предприятие сотрудника (Employee) с пустым менеджером - должно выкинуться исключение (используйте перегрузку функций) .
    // Предроложу что задании опечатка -     работника (Worker)
    public void add(Employee employee){

        if (employeeList.contains(employee))
        {
            throw new RuntimeException("employee already exist: " + employee.toString());
        }

        if (employee instanceof Worker && ((Worker)employee).getManager() == null)
        {
            throw new RuntimeException("worker has no manager: " + ((Worker)employee).toString());
        }
        employeeList.add(employee);
    }
}

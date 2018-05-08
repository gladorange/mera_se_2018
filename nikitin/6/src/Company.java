package src;

import java.util.LinkedHashSet;
import java.util.Set;

public class Company {
    private Set<Person> employees = new LinkedHashSet<>();

    public class EmployeeAlreadyExistsException extends CompanyException {
        public EmployeeAlreadyExistsException(String info) {
            super(info);
        }
    }

    public void addEmployee(Person person) throws CompanyException {
        if (employees.contains(person)) {
            throw new EmployeeAlreadyExistsException(String.format("Employee \"%s %s %s\" already exists",
                    person.secondName, person.name, person.fatherName));
        }

        employees.add(person);
        System.out.println(String.format("INFO: Employee \"%s %s %s\" is added",
                person.secondName, person.name, person.fatherName));
    }

    public static void main(String[] args) {
        Company company = new Company();

        try {
            //latin symbols
            company.addEmployee(new Manager("Vova", "Putin", "Vladimirovich", "Russia"));
        } catch (CompanyException e) {
            System.out.println(e.info);
        }

        try {
            Manager manager = new Manager("Вова", "вова", "вова", "вова");
            company.addEmployee(manager);
            company.addEmployee(new Worker("Вася", "Пупкин", "ААА", manager));

            //double addition
            company.addEmployee(manager);
        } catch (CompanyException e) {
            System.out.println(e.info);
        }

        try {
            //null Manager
            company.addEmployee(new Worker("Петя", "без", "манагера", null));
        } catch (CompanyException e) {
            System.out.println(e.info);
        }
    }
}
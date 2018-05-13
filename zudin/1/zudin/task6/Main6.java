package zudin.task6;

public class Main6 {

    public static void main(String[] args) {

        Company company = new Company();

        Manager manager1 =
                new Manager("Сергеев", "Сергей", "Сергеевич", "Снабжение" );
        company.addEmployee(manager1, company);
        company.addEmployee(new Worker("Иванов", "Иван", "Иванович", manager1),company);
        company.addEmployee(new Worker("Петров", "Петр", "Петрович", manager1), company);

        Manager manager2 =
                new Manager("Колобков", "Степан", "Валерьевич", "Отдел кадров");
        company.addEmployee(manager2, company);
        company.addEmployee(new Worker("Кузнецов", "Василий", "Игоревич", manager2), company);
        company.addEmployee(new Worker("Малинина", "Виктория", "Романовна", manager2), company);


        //add foreign newcomer
        company.addEmployee(new Worker("Bond", "Иван", "Иванович", manager1), company);

        //add already added worker
        company.addEmployee(new Worker("Петров", "Петр", "Петрович", manager1), company);

        //add already added manager
        Manager manager3 =
                new Manager("Колобков", "Степан", "Валерьевич", "Отдел кадров");
        company.addEmployee(manager3, company);

        //add newcomer without manager
        company.addEmployee(new Worker("Семенов", "Семен", "Семенович", null), company);

        }
    }

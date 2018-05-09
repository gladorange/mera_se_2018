package zudin.task6;

public class Main6 {

    public static void main(String[] args) {

        Company company = new Company();

        Manager manager1 =
                new Manager("Сергеев", "Сергей", "Сергеевич", "Снабжение" );
        company.employees.add(manager1);
        company.employees.add(
                new Worker("Иванов", "Иван", "Иванович", manager1));
        company.employees.add(
                new Worker("Петров", "Петр", "Петрович", manager1));

        Manager manager2 =
                new Manager("Колобков", "Степан", "Валерьевич", "Отдел кадров");
        company.employees.add(manager2);
        company.employees.add(
                new Worker("Кузнецов", "Василий", "Игоревич", manager2));
        company.employees.add(
                new Worker("Малинина", "Виктория", "Романовна", manager2));


        //add foreign newcomer
        company.employees.add(
                new Worker("Bond", "Иван", "Иванович", manager1));

        //add newcomer without manager
        company.employees.add(
                new Worker("Семенов", "Семен", "Семенович", null));

        //add already added employee
        company.employees.add(
                new Worker("Петров", "Петр", "Петрович", manager1));

    }

}

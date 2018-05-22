package los.task1;

public class Main {

    public static void main(String[] args)
    {
        Company company = new Company();

        Manager manager1;
        Manager manager2;
        Manager manager3 = null;

        try
        {
            company.addEmployee("Михаил", "Дмитриевич", "Прохоров", "Производство");
            company.addEmployee("Анатолий", "Борисович", "Чубайс", "Управление");
        }
        catch(Exception e)
        {
            System.out.println("Ошибка нанять руководителя: " + e);
            return;
        }

        try
        {
            manager1 = company.getManager("Михаил", "Дмитриевич", "Прохоров", "Производство");
            manager2 = company.getManager("Анатолий", "Борисович", "Чубайс", "Управление");

            company.addEmployee("Семён", "Семёнович", "Семенов", manager1);
            company.addEmployee("Максим", "Максимович", "Максимов", manager1);
            company.addEmployee("Дмитрий", "Дмитриевич", "Дмитриев", manager2);
        }
        catch(Exception e)
        {
            System.out.println("Ошибка при найме сотрудника: " + e);
            return;
        }

        try
        {
            company.addEmployee("Сергей", "Сергеевич", "Сергеев", manager3);
        }
        catch(Exception e)
        {
            System.out.println("Ошибка при найме сотрудника: " + e);
        }

        try
        {
            company.addEmployee("Donald", "John", "Trump", "Управление");
        }
        catch(Exception e)
        {
            System.out.println("Ошибка: не возможно нанять иностранца: " + e);
        }

        try
        {
            company.addEmployee("Максим", "Максимович", "Максимов", manager1);
        }
        catch(Exception e)
        {
            System.out.println("Ошибка: не возможно нанять уже работающего сотрудника: " + e);
        }

        try
        {
            company.addEmployee("Михаил", "Дмитриевич", "Прохоров", "Производство");
        }
        catch(Exception e)
        {
            System.out.println("Ошибка: не возможно нанять уже работающего сотрудника: " + e);
        }
    }
}

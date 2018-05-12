package terletskiy.task1;

import java.util.HashSet;

public class task1 {
    public static void main(String[] args) {
        try {
            //Создайте свое предприятияе,
            CompanyList company = new CompanyList();
            //несколько сотрудников с менеджерами,
            Manager m1 = new Manager("Иванов", "Иван", "Иваныч","otdel1");
            Manager m2 = new Manager("Петров", "Иван", "Иваныч","otdel2");
            Worker w1 = new Worker("Васечкин", "Иван", "Иваныч", m1);
            Worker w2 = new Worker("Васечкина", "Иван", "Иваныч", m2);
            Worker w3 = new Worker("Смирнов", "Иван", "Иваныч", m1);
            company.add(m1);
            company.add(m2);
            company.add(w1);
            company.add(w2);
            company.add(w3);

            //попробуйте добавить иностранца
            try{
                Worker w4 = new Worker("Smith", "Иван", "Иваныч", m1);
                //will not be added
                company.add(w4);
            }catch (Exception ex){
                System.out.println("Expected Exception1: " + ex.getMessage());
            }

            try{
                //и пару раз одного и того же сотрудника
                company.add(w3);
            }catch (Exception ex){
                System.out.println("Expected Exception2: " + ex.getMessage());
            }

            try{
                //и пару раз одного и того же сотрудника
                company.add(w3);
            }catch (Exception ex){
                System.out.println("Expected Exception2: " + ex.getMessage());
            }

            try{
                // Worker without manager
                Worker w5 = new Worker("Васечкин", "Иван", "Иваныч", null);
                company.add(w5);
            }catch (Exception ex){
                System.out.print("Expected Exception4: " + ex.getMessage());
            }

        } catch (Exception ex){
            System.out.println("Unexpected Exception " + ex.getMessage());
            throw ex;
        }

    }
}

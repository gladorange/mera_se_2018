/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

/**
 *
 * @author flyer
 */
public class EnterpriseExcersize
{
    public static void main(String[] args)
    {
        EnterpriseActions ent = new Enterprise();
        
        Manager m1;
        Manager m2;
        
        try
        {
            ent.hireEmployee("Иван Иванович Иванов", "Бухгалтерия");
        }
        catch(Exception e)
        {
            System.out.println("Failed to hire manager: " + e);
            return;
        }
        
        try
        {
            m1 = ent.getManager("Иван Иванович Иванов", "Бухгалтерия");
        
            ent.hireEmployee("Федор Федорович Фёдоров", "Производство");
            m2 = ent.getManager("Федор Федорович Фёдоров", "Производство");
        
            ent.hireEmployee("Пётр Петрович Петров", m1);
            ent.hireEmployee("Сидор Сидорович Сидоров", m1);
            ent.hireEmployee("Николай Денисович Тимофеев", m2);
            ent.hireEmployee("Артур Валерьевич Умов", m2);
            ent.hireEmployee("Александр Дмитриевич Терентьев", m2);
            ent.hireEmployee("Евгений Януарьевич Воронов", m2);
        }
        catch(Exception e)
        {
            System.out.println("Нанять сотрудника не удалось: " + e);
            return;
        }
        
        try
        {
            ent.hireEmployee("John Jones", m2);
        }
        catch(Exception e)
        {
            System.out.println("Попытка нанять иностранца: " + e);
        }
        
        try
        {
            ent.hireEmployee("Федор Федорович Фёдоров", "Производство");
        }
        catch(Exception e)
        {
            System.out.println("Попытка нанять уже существующего менеджера: " + e);
        }
        
        try
        {
            ent.hireEmployee("Сидор Сидорович Сидоров", m1);
        }
        catch(Exception e)
        {
            System.out.println("Попытка нанять уже существующего работника: " + e);
        }
    }
}

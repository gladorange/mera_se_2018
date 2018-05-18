package telukhin;

import telukhin.task1.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainTask6 {
    public static void main(String[] args) {


        ArrayList<Emploee> listForFactoryPersonal = new ArrayList<>();
        HashSet<Emploee> factoryPersonal = new HashSet<>();


        try {
            Manager mikhail = new Manager("Михаил", "Иванов", "Economics");
            Manager sergey = new Manager("Сергей", "Петров", "Economics");
//            Manager viktor = new Manager("Виктор", "Sidorov", "Economics");
            Manager viktor = new Manager("Виктор", "Сидоров", "Economics");

            Worker fedor = new Worker("Федор", "Двинятин", mikhail);
            Worker ivan = new Worker("Иван", "Фролов", sergey);
            Worker roman = new Worker("Роман","Гофман");
//            Worker roman = new Worker("Роман", "Гофман", viktor);

            listForFactoryPersonal.add(mikhail);
            listForFactoryPersonal.add(sergey);
            listForFactoryPersonal.add(viktor);
            listForFactoryPersonal.add(fedor);
//            listForFactoryPersonal.add(fedor);
            listForFactoryPersonal.add(ivan);
            listForFactoryPersonal.add(roman);

        } catch (ExceptionWrongSurname e) {
            System.out.println(e.getInfo());
        } catch (ExceptionNullManager e) {
            System.out.println(e.getInfo());
        }

        try {
            Factory factory = new Factory(listForFactoryPersonal, factoryPersonal);
            factory.printPersonal();
        } catch (ExceptionAlreadyExist exceptionAlreadyExist) {
            System.out.println(exceptionAlreadyExist.getInfo());
        }
    }


}

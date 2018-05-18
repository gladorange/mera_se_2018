package telukhin;

import telukhin.task1.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainTask6 {
    public static void main(String[] args) {

        Manager mikhail = null;
        Manager sergey = null;
        Worker fedor = null;
        Worker ivan = null;

        ArrayList<Emploee> listWorkers = new ArrayList<>();
        try {
            mikhail = new Manager("Михаил", "Иванов", "Economics");
            sergey = new Manager("Сергей", "Петров", "Economics");
//            Manager Viktor = new Manager("Виктор", "Sidorov", "Economics");

            fedor = new Worker("Федор", "Двинятин", mikhail);
            ivan = new Worker("Иван", "Фролов", sergey);
//            Worker Roman = new Worker("Роман","Гофман");

        } catch (ExceptionWrongSurname e) {
            System.out.println(e.getInfo());
        } catch (ExceptionNullManager e) {
            System.out.println(e.getInfo());
        }

        listWorkers.add(mikhail);
        listWorkers.add(sergey);
        listWorkers.add(fedor);
        listWorkers.add(ivan);


        Set workers = new HashSet<Emploee>();
        for (Emploee e : listWorkers) {
            workers.add(e);
            if(workers.contains(e)){
                throw new ExceptionAlreadyExist(String.format("Такой работник (%s) уже есть в компании", e.getName()));
            }
        }


        workers.add(mikhail);
        workers.add(sergey);
        workers.add(fedor);
        workers.add(ivan);

        Factory factory = new Factory(workers);


    }
}

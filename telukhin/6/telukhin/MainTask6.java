package telukhin;

import telukhin.task1.ExceptionNullManager;
import telukhin.task1.ExceptionWrongSurname;
import telukhin.task1.Manager;
import telukhin.task1.Worker;

public class MainTask6 {
    public static void main(String[] args) {
        try {
            Manager Mhail = new Manager("Михаил", "Иванов", "Economics");
            Manager Sergey = new Manager("Сергей", "Петров", "Economics");
//            Manager Viktor = new Manager("Виктор", "Sidorov", "Economics");

            Worker Fedor = new Worker("Федор","Двинятин", Mhail);
            Worker Ivan = new Worker("Иван","Фролов", Sergey);
            Worker Roman = new Worker("Роман","Гофман");
//            System.out.println(Roman.getHead());

        } catch (ExceptionWrongSurname | ExceptionNullManager e) {
            System.out.println(e.getInfo());
        }

    }
}

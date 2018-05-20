package telukhin.task1;

import java.util.ArrayList;
import java.util.HashSet;

public class Factory {

    private HashSet<Emploee> workingPeople;


    public Factory(ArrayList<Emploee> listPersonal, HashSet<Emploee> workingPeople) throws ExceptionAlreadyExist {
        this.workingPeople = workingPeople;
        chaeckAddEmploees(listPersonal, workingPeople);
    }

    private static void chaeckAddEmploees(ArrayList<Emploee> listPersonal, HashSet<Emploee> workers) throws ExceptionAlreadyExist {
        for (Emploee e : listPersonal) {
            if (workers.contains(e)) {
                throw new ExceptionAlreadyExist(String.format("Такой работник (%s) уже есть в компании", e.getName()));
            } else {
                workers.add(e);
            }
        }
    }

    public void printPersonal() {
        for (Emploee e : workingPeople) {
            System.out.println(e.getName());
        }
        System.out.println(String.format("Количество сотрудников фабрики %s", workingPeople.size()));
    }
}

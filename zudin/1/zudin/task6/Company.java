package zudin.task6;

import java.util.HashSet;

public class Company {

    public HashSet<Person> employees;

    public boolean addEmployee (Person p, Company c) {
        for (Person e : c.employees) {
            if (p.fio.equals(e.fio)) {
                try {
                    throw new NonUniqueWorkerException("Этот сотрудник уже добавлен " + p.fio);
                } catch (NonUniqueWorkerException e1) {
                    System.err.println(e1.getInfo());
                    e1.printStackTrace();
                    System.err.println();
                }
                return false;
            }
        }
        if (p instanceof Worker && ((Worker) p).getManager() == null) {
                try {
                    throw new AnarchistException("Этот человек никому не подчиняется " + p.fio);
                } catch (AnarchistException e) {
                    System.err.println(e.getInfo());
                    e.printStackTrace();
                    System.err.println();
                }
                return false;
        }
        if (p.lastName.matches("[a-zA-Z]+")) {
            try {
                throw new GuestWorkerException("Обнаружен иностранный шпион " + p.lastName);
            } catch (GuestWorkerException ge) {
                System.err.println(ge.getInfo());
                ge.printStackTrace();
                System.err.println();
            }
            return false;
        } else {
            c.employees.add(p);
            return true;
        }
    }
    public Company() {
        this.employees = new HashSet<>();

    }

}
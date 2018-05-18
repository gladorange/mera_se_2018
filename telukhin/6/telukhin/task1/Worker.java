package telukhin.task1;

public class Worker extends Emploee {
    private Manager head;

    public Worker(String name, String surname) throws ExceptionNullManager, ExceptionWrongSurname {
        super(name, surname);
        if(head == null){
            throw new ExceptionNullManager(String.format("У %s нет менеджера", name));
        }
    }

    public Worker(String name, String surname, Manager head) throws ExceptionNullManager, ExceptionWrongSurname {
        super(name, surname);
        this.head = head;
        if(head == null){
            throw new ExceptionNullManager(String.format("У %s нет менеджера", name));
        }
    }

    public Manager getHead() {
        return head;
    }
}

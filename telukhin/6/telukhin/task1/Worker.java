package telukhin.task1;

public class Worker /*extends Emploee*/ {
    private Manager head;

    public Worker(String name, String surname, Manager head) {
//        super(name, surname);
        this.head = head;
    }
}

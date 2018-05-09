package zudin.task6;

public class Worker extends Person {

    private Manager manager;

    public Worker(String lastName, String firstName, String secondName, Manager manager) {
        super(lastName, firstName, secondName);
        this.setManager(manager);
        if (lastName.matches("[a-zA-Z]+")) {

            try {
                throw new GuestWorkerException("Обнаружен иностранный шпион " + lastName);
            } catch (GuestWorkerException e) {
                System.err.println(e.getInfo());
                e.printStackTrace();
                System.err.println();
            }
        }
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public boolean equals(Object o) {

        Worker otherWorker = (Worker) o;

        if (this.fio.equals(otherWorker.fio)) {
            try {
                throw new NonUniqueWorker("Этот сотрудник уже добавлен " + fio);
            } catch (NonUniqueWorker ne) {
                System.err.println(ne.getInfo());
                ne.printStackTrace();
                 System.err.println();
            }
        }
        return this.fio.equals(otherWorker.fio);
    }

    @Override
    public int hashCode() {
        int hash = 31;
        if (getManager() != null) {
            hash = hash * 17 + fio.hashCode() + getManager().hashCode();
        } else {
            try {
                throw new AnarchistException("Этот человек никому не подчиняется " + fio);
            } catch (AnarchistException ae) {
                System.err.println(ae.getInfo());
                ae.printStackTrace();
                 System.err.println();
            } finally {
                hash = hash * 17 + fio.hashCode();
            }

        }
        return hash;
    }

}


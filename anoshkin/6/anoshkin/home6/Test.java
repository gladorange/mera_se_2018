package anoshkin.home6;

import java.util.HashSet;

public class Test {

    public static class Company{
        private HashSet<Cooperator> company = new HashSet<>();

        public class NoManager extends Exception{
            public NoManager(String msg){
                super(msg);
            }
        }

        public class Exists extends Exception{
            public Exists(String msg){
                super(msg);
            }
        }

        public void addCooperator(Manager manager) throws Exists{
            if (company.contains(manager)) throw new Exists(manager.getFIO());
            company.add(manager);
        }

        public void addCooperator(Worker worker) throws NoManager, Exists {
            if (worker.getManager() == null) throw new NoManager(worker.getFIO());
            if (company.contains(worker)) throw new Exists(worker.getFIO());
            company.add(worker);
        }
    }

    public static void main(String[] args) {
        Company company = new Company();
        try{
            Worker Vasia = new Worker("Вася");
            Worker Vasia2 = new Worker("Вася");
            Worker Kolya = new Worker("Коля");
            Manager Petr = new Manager("Петя", "Цех");
            Cooperator Ivan = new Manager("Ваня", "Столовая");
//            Worker Obama = new Worker("Obama");

            try{
                Vasia.setManager(Petr);
                company.addCooperator(Vasia);
//                company.addCooperator(Vasia2);
                company.addCooperator(Kolya);
                company.addCooperator((Manager) Ivan);
                company.addCooperator(Petr);

            } catch (Company.Exists | Company.NoManager nm){
                System.out.println("Can't add " + nm);
            }

        } catch (Cooperator.Foreigner e){
            System.out.println(e + " is Foreigner");
        }
    }
}

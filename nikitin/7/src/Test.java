package src;

import java.util.*;

public class Test {
    private TimeMeter t;
    private int size;

    private Test(int size) {
        this.size = size;
    }

    public void testContainer(Class<? extends Collection> container) {
        System.out.println("Container: " + container.getSimpleName());

        testInteger(container);
        testLong(container);
        testString(container);
        testPerson(container);
    }

    private void testInteger(Class<? extends Collection> container) {
        Integer first = 0;
        Integer last = this.size - 1;
        Integer inexistant = this.size + 1;

        Map m = new LinkedHashMap();

        t = new TimeMeter(Integer.class, container);
        m.put("Add", t.additionTest(this.size));
        m.put("First", t.searchTest(first));
        m.put("Last", t.searchTest(last));
        m.put("Unexistant", t.searchTest(inexistant));
        System.out.println("\t" + t.getTypeName() + ": " + m);
    }

    private void testLong(Class<? extends Collection> container) {
        Long first = 0L;
        Long last = new Long(this.size - 1);
        Long inexistant = new Long(this.size + 1);

        Map m = new LinkedHashMap();

        t = new TimeMeter(Long.class, container);
        m.put("Add", t.additionTest(this.size));
        m.put("First", t.searchTest(first));
        m.put("Last", t.searchTest(last));
        m.put("Unexistant", t.searchTest(inexistant));
        System.out.println("\t" + t.getTypeName() + ":    " + m);
    }

    private void testString(Class<? extends Collection> container) {
        String first = new String("0");
        String last = String.valueOf(this.size - 1);
        String unexistant = String.valueOf(this.size + 1);

        Map m = new LinkedHashMap();
        t = new TimeMeter(String.class, container);
        m.put("Add", t.additionTest(this.size));
        m.put("First", t.searchTest(first));
        m.put("Last", t.searchTest(last));
        m.put("Unexistant", t.searchTest(unexistant));
        System.out.println("\t" + t.getTypeName() + ":  " + m);
    }

    private void testPerson(Class<? extends Collection> container) {
        Person first = new Person("0");
        Person last = new Person(String.valueOf(this.size - 1));
        Person unexistant = new Person(String.valueOf(this.size + 1));

        Map m = new LinkedHashMap();
        t = new TimeMeter(Person.class, container);
        m.put("Add", t.additionTest(this.size));
        m.put("First", t.searchTest(first));
        m.put("Last", t.searchTest(last));
        m.put("Unexistant", t.searchTest(unexistant));
        System.out.println("\t" + t.getTypeName() + ":  " + m);
    }

    public static void main(String[] args) {
        try {
            int size = 100000;
            System.out.println("Run test for " + size + " elements");

            Test test = new Test(size);

            test.testContainer(LinkedHashSet.class);
            test.testContainer(ArrayList.class);
            test.testContainer(TreeSet.class);
            test.testContainer(LinkedList.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

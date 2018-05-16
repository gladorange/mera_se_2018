package zudin.task7;

import java.util.ArrayList;
import java.util.Collection;

public class CalculationFunctions {
    public static void addStrings(ArrayList<String> str) {
        System.out.println("#############################################");
        System.out.println("addStrings:");
        System.out.println("#############################################");
        long timeResult = 0;
        for (int a = 0; a < 10; a++) {

            long before = System.nanoTime();
            for (int i = 0; i < 100_000; i++) {
                str.add("string");
            }
            long time = System.nanoTime() - before;
            timeResult = timeResult + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("addStrings \n" + "Average is: " + timeResult / 10);
        System.out.println("#############################################");
        System.out.println();

    }

    public static void addLongs(ArrayList<Long> lng) {
        System.out.println("#############################################");
        System.out.println("addLongs:");
        System.out.println("#############################################");
        Long l = 8769876976L;
        long timeResult = 0;
        for (int a = 0; a < 10; a++) {

            long before = System.nanoTime();
            for (int i = 0; i < 100_000; i++) {
                lng.add(l);
            }
            long time = System.nanoTime() - before;
            timeResult = timeResult + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("addLongs: \n" + "Average is: " + timeResult / 10);
        System.out.println("#############################################");
        System.out.println();
    }

    public static void addInts(ArrayList<Integer> ints) {
        System.out.println("#############################################");
        System.out.println("addInts:");
        System.out.println("#############################################");
        Integer b = 1234567;
        long timeResult = 0;
        for (int a = 0; a < 10; a++) {

            long before = System.nanoTime();
            for (int i = 0; i < 100_000; i++) {
                ints.add(b);
            }
            long time = System.nanoTime() - before;
            timeResult = timeResult + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("addInts: \n" + "Average is: " + timeResult / 10);
        System.out.println("#############################################");
        System.out.println();
    }

    public static void addPersons(ArrayList<Person> persons) {
        System.out.println("#############################################");
        System.out.println("addPersons:");
        System.out.println("#############################################");
        Person p = new Person("Зудин", "Евгений", "1987");
        long timeResult = 0;
        for (int a = 0; a < 10; a++) {

            long before = System.nanoTime();
            for (Integer i = 0; i < 100_000; i++) {
                persons.add(p);
            }
            long time = System.nanoTime() - before;
            timeResult = timeResult + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("addPersons: \n" + "Average is: " + timeResult / 10);
        System.out.println("#############################################");
        System.out.println();

    }

    public static void findStrings(ArrayList<String> str) {
        System.out.println("#############################################");
        System.out.println("findStrings: ");
        System.out.println("#############################################");
        str.set(0, "first element");
        long timeResult = 0;
        for (int i = 0; i < 10; i++) {

            long before = System.nanoTime();
            str.contains("first element");
            long time = System.nanoTime() - before;
            timeResult = timeResult + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("findStrings:first element \n" + "Average is: " + timeResult / 10);
        System.out.println();

        long timeResult2 = 0;
        for (int i = 0; i < 10; i++) {

            long before = System.nanoTime();
            str.contains("string is absent");
            long time = System.nanoTime() - before;
            timeResult2 = timeResult2 + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("findStrings:absent element \n" + "Average is: " + timeResult2 / 10);
        System.out.println();

        str.set(99999, "last element");
        long timeResult3 = 0;
        for (int i = 0; i < 10; i++) {

            long before = System.nanoTime();
            str.contains("last element");
            long time = System.nanoTime() - before;
            timeResult3 = timeResult3 + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("findStrings:last element \n" + "Average is: " + timeResult3 / 10);
        System.out.println("#############################################");
        System.out.println();

    }

    public static void findLongs(ArrayList<Long> lng) {
        System.out.println("#############################################");
        System.out.println("findLongs: ");
        System.out.println("#############################################");
        lng.set(0, 111_111_111L);
        long timeResult = 0;
        for (int i = 0; i < 10; i++) {

            long before = System.nanoTime();
            lng.contains(111_111_111L);
            long time = System.nanoTime() - before;
            timeResult = timeResult + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("findLongs:first element \n" + "Average is: " + timeResult / 10);
        System.out.println();

        long timeResult2 = 0;
        for (int i = 0; i < 10; i++) {

            long before = System.nanoTime();
            lng.contains(888_888_888L);
            long time = System.nanoTime() - before;
            timeResult2 = timeResult2 + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("findStrings:absent element \n" + "Average is: " + timeResult2 / 10);
        System.out.println();

        lng.set(99999, 999_999_999L);
        long timeResult3 = 0;
        for (int i = 0; i < 10; i++) {

            long before = System.nanoTime();
            lng.contains(999_999_999L);
            long time = System.nanoTime() - before;
            timeResult3 = timeResult3 + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("findLongs:last element \n" + "Average is: " + timeResult3 / 10);
        System.out.println("#############################################");
        System.out.println();

    }

    public static void findInts(ArrayList<Integer> ints) {
        System.out.println("#############################################");
        System.out.println("findInts: ");
        System.out.println("#############################################");
        ints.set(0, 111_111_111);
        long timeResult = 0;
        for (int i = 0; i < 10; i++) {

            long before = System.nanoTime();
            ints.contains(111_111_111);
            long time = System.nanoTime() - before;
            timeResult = timeResult + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("findInts:first element \n" + "Average is: " + timeResult / 10);
        System.out.println();

        long timeResult2 = 0;
        for (int i = 0; i < 10; i++) {

            long before = System.nanoTime();
            ints.contains(888_888_888);
            long time = System.nanoTime() - before;
            timeResult2 = timeResult2 + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("findStrings:absent element \n" + "Average is: " + timeResult2 / 10);
        System.out.println();

        ints.set(99999, 999_999_999);
        long timeResult3 = 0;
        for (int i = 0; i < 10; i++) {

            long before = System.nanoTime();
            ints.contains(999_999_999L);
            long time = System.nanoTime() - before;
            timeResult3 = timeResult3 + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("findLongs:last element \n" + "Average is: " + timeResult3 / 10);
        System.out.println("#############################################");
        System.out.println();

    }

    public static void findPersons(ArrayList<Person> persons) {

        System.out.println("#############################################");
        System.out.println("findPersons: ");
        System.out.println("#############################################");
        Person first = new Person("First", "First", "1111");
        Person last = new Person("Last", "Last", "9999");
        Person somebody = new Person("Somebody", "Somebody", "0000");
        persons.set(0, first);
        long timeResult = 0;
        for (int i = 0; i < 10; i++) {

            long before = System.nanoTime();
            persons.contains(first);
            long time = System.nanoTime() - before;
            timeResult = timeResult + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("findPersons:first element \n" + "Average is: " + timeResult / 10);
        System.out.println();

        long timeResult2 = 0;
        for (int i = 0; i < 10; i++) {

            long before = System.nanoTime();
            persons.contains(somebody);
            long time = System.nanoTime() - before;
            timeResult2 = timeResult2 + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("findPersons:absent element \n" + "Average is: " + timeResult2 / 10);
        System.out.println();

        persons.set(99999, last);
        long timeResult3 = 0;
        for (int i = 0; i < 10; i++) {

            long before = System.nanoTime();
            persons.contains(last);
            long time = System.nanoTime() - before;
            timeResult3 = timeResult3 + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("findPersons:last element \n" + "Average is: " + timeResult3 / 10);
        System.out.println("#############################################");
        System.out.println();

    }

     public static void addDouble(Collection<Double> testCollection) {

        System.out.println("#############################################");
        System.out.println("Add elements in " +testCollection.getClass().getName().substring(10));
        System.out.println("#############################################");

        long timeResult = 0;
        for (int a = 0; a < 10; a++) {

            long before = System.nanoTime();
            for (int i = 0; i < 100_000; i++) {
                testCollection.add(new Double(i));
            }
            long time = System.nanoTime() - before;
            timeResult = timeResult + time;
            System.out.println(time);
        }
        System.out.println();
        System.out.println("Add elements in " + testCollection.getClass().getName().substring(10) + "\n" + "Average is: " + timeResult / 10);
        System.out.println("#############################################");
        System.out.println();


    }

public static void findDouble(Collection<Double> testCollection) {

    System.out.println("#############################################");
    System.out.println("Find first element in " + testCollection.getClass().getName().substring(10));
    System.out.println("#############################################");

    long timeResult = 0;
    for (int i = 0; i < 10; i++) {

        long before = System.nanoTime();
        testCollection.contains(new Double(0));
        long time = System.nanoTime() - before;
        timeResult = timeResult + time;
        System.out.println(time);
    }
    System.out.println();
    System.out.println("Find first element in " + testCollection.getClass().getName().substring(10) + "\n" + "Average is: " + timeResult / 10);
    System.out.println("#############################################");
    System.out.println();

     System.out.println("#############################################");
    System.out.println("Find last element in " + testCollection.getClass().getName().substring(10));
    System.out.println("#############################################");

    long timeResult2 = 0;
    for (int i = 0; i < 10; i++) {

        long before = System.nanoTime();
        testCollection.contains(new Double(99999));
        long time = System.nanoTime() - before;
        timeResult2 = timeResult2 + time;
        System.out.println(time);
    }
    System.out.println();
    System.out.println("Find last element in " + testCollection.getClass().getName().substring(10) + "\n" + "Average is: " + timeResult2 / 10);
    System.out.println("#############################################");
    System.out.println();
    }
}

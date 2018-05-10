package anoshkin.home7;

import anoshkin.home3.Person;

import java.util.*;
import java.util.List;

public class Test {

    public static final int maxSamples = 10000000;
    static String stringForList = "999999";
    static Long longForList = 999999L;
    static Integer intForList = 999999;
    static Person personForList = new Person("Ivan", "Ivanov", "1965", "Russia");

    public static void main(String[] args) {
        long before;

// TEST 1
        System.out.println("Start of test 1");
//Insets
//Strings
        System.out.println("Adding Strings: ");
        ArrayList<String> testStringArray = new ArrayList<>();
        before = System.nanoTime();
        for (int i=0; i < maxSamples; i++){
            testStringArray.add(stringForList);
        }
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("");
//Longs
        System.out.println("Adding Longs: ");
        ArrayList<Long> testLongArray = new ArrayList<>();
        before = System.nanoTime();
        for (int i=0; i < maxSamples; i++){
            testLongArray.add(longForList);
        }
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("");
//Ints
        System.out.println("Adding Ints: ");
        ArrayList<Integer> testIntArray = new ArrayList<>();
        before = System.nanoTime();
        for (int i=0; i < maxSamples; i++){
            testIntArray.add(intForList);
        }
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("");
//Persons
        System.out.println("Adding Persons: ");
        ArrayList<Person> testPersonArray = new ArrayList<>();
        before = System.nanoTime();
        for (int i=0; i < maxSamples; i++){
            testPersonArray.add(personForList);
        }
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("");
// Results for inserting:
/*        Start of test 1
        Adding Strings:
        End: 232280543

        Adding Longs:
        End: 394181910

        Adding Ints:    Integers is always much greater. Why ????????????????
        End: 2421372299

        Adding Persons:
        End: 214520226 */

//Search
//String
        System.out.println("Searching Last String: ");
        String FirstString = "First";
        String LastString = "Last";
        testStringArray.set(testStringArray.size()-1, LastString);
        before = System.nanoTime();
        testStringArray.contains(LastString);
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("Searching First String: ");
        testStringArray.set(0, FirstString);
        before = System.nanoTime();
        testStringArray.contains(FirstString);
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("Searching absent String: ");
        before = System.nanoTime();
        testStringArray.contains("AbsentString");
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("");

//Long
        System.out.println("Searching Last Long: ");
        Long FirstLong = 0L;
        Long LastLong = 10L;
        testLongArray.set(testLongArray.size()-1, LastLong);
        before = System.nanoTime();
        testLongArray.contains(LastLong);
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("Searching First Long: ");
        testLongArray.set(0, FirstLong);
        before = System.nanoTime();
        testLongArray.contains(FirstLong);
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("Searching absent Long: ");
        before = System.nanoTime();
        testLongArray.contains(9L);
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("");
//Int
        System.out.println("Searching Last Int: ");
        Integer FirstInt = 0;
        Integer LastInt = 10;
        testIntArray.set(testIntArray.size()-1, LastInt);
        before = System.nanoTime();
        testIntArray.contains(LastInt);
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("Searching First Int: ");
        testIntArray.set(0, FirstInt);
        before = System.nanoTime();
        testIntArray.contains(FirstInt);
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("Searching absent Int: ");
        before = System.nanoTime();
        testIntArray.contains(9);
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("");
//Person
        System.out.println("Searching Last Person: ");
        Person FirstPerson = new Person("1st", "1st", "1st", "1st");
        Person LastPerson = new Person("2st", "2st", "2st", "2st");;
        testPersonArray.set(testPersonArray.size()-1, LastPerson);
        before = System.nanoTime();
        testPersonArray.contains(LastPerson);
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("Searching First Person: ");
        testPersonArray.set(0, FirstPerson);
        before = System.nanoTime();
        testPersonArray.contains(FirstPerson);
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("Searching absent Person: ");
        before = System.nanoTime();
        testPersonArray.contains(new Person("no", "no", "no", "no"));
        System.out.println("End: " + (System.nanoTime() - before));
        System.out.println("");
//Results of Search
/*        Searching Last String:
        End: 31744478
        Searching First String:
        End: 2996
        Searching absent String:
        End: 36698021

        Searching Last Long:
        End: 42062998
        Searching First Long:
        End: 66575
        Searching absent Long:
        End: 38644352

        Searching Last Int:
        End: 101873332
        Searching First Int:
        End: 33621
        Searching absent Int:
        End: 96136530

        Searching Last Person:
        End: 83810763
        Searching First Person:
        End: 32289
        Searching absent Person:
        End: 66919587

        Integer is the worst again on search of the Last element*/

//Test2
        List<Double> arrList = new ArrayList<>();
        List<Double> lnkList = new LinkedList<>();
        Set<Double> hashSet = new HashSet<>();
        Set<Double> treeSet = new TreeSet<>();

//Adding elements
        System.out.println("Adding elements");
        before = System.nanoTime();
        for(int i=0; i<maxSamples; i++){
            arrList.add(new Double(i));
        }
        System.out.println("ArrayList Add:  " + (System.nanoTime() - before));
        before = System.nanoTime();
        for(int i=0; i<maxSamples; i++){
            lnkList.add(new Double(i));
        }
        System.out.println("LinkedList Add: " + (System.nanoTime() - before));
        before = System.nanoTime();
        for(int i=0; i<maxSamples; i++){
            hashSet.add(new Double(i));
        }
        System.out.println("HashSet Add:    " + (System.nanoTime() - before));
        before = System.nanoTime();
        for(int i=0; i<maxSamples; i++){
            treeSet.add(new Double(i));
        }
        System.out.println("TreeSet Add:    " + (System.nanoTime() - before));
//LastSearch:
        before = System.nanoTime();
        arrList.contains(new Double(maxSamples - 1));
        System.out.println("ArrList Last search: " + (System.nanoTime() - before));
        before = System.nanoTime();
        lnkList.contains(new Double(maxSamples - 1));
        System.out.println("LinkedList Last search: " + (System.nanoTime() - before));
        before = System.nanoTime();
        hashSet.contains(new Double(maxSamples - 1));
        System.out.println("HashSet Last search: " + (System.nanoTime() - before));
        before = System.nanoTime();
        treeSet.contains(new Double(maxSamples - 1));
        System.out.println("TreeSet Last search: " + (System.nanoTime() - before));
//FirstSearch:
        before = System.nanoTime();
        arrList.contains(new Double(0));
        System.out.println("ArrList First search: " + (System.nanoTime() - before));
        before = System.nanoTime();
        lnkList.contains(new Double(0));
        System.out.println("LinkedList First search: " + (System.nanoTime() - before));
        before = System.nanoTime();
        hashSet.contains(new Double(0));
        System.out.println("HashSet First search: " + (System.nanoTime() - before));
        before = System.nanoTime();
        treeSet.contains(new Double(0));
        System.out.println("TreeSet First search: " + (System.nanoTime() - before));
//Results
/*
Adding elements
ArrayList Add:  3554787387
LinkedList Add: 6515240272
HashSet Add:    2934045757
TreeSet Add:    25911348209

ArrList Last search:     114700745
LinkedList Last search:  138726806
HashSet Last search:     45937   - why is it so quick?
TreeSet Last search:     65576

ArrList First search:    4328
LinkedList First search: 20305
HashSet First search:    2663
TreeSet First search:    46936
 */
    }
}

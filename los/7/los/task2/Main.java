package los.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int ELEMENTS_NUMBER = 900000;
        final int FIRST_ELEMENT = 0;
        long i = 0L;

        Double elementToFind;

        TimeMeasurement<Double, ArrayList<Double>> doubleArrayList = new TimeMeasurement(new ArrayList<>());
        TimeMeasurement<Double, LinkedList<Double>> doubleLinkedList = new TimeMeasurement(new LinkedList<>());
        TimeMeasurement<Double, HashSet<Double>> doubleHashSet = new TimeMeasurement(new HashSet<>());
        TimeMeasurement<Double, TreeSet<Double>> doubleTreeSet = new TimeMeasurement(new TreeSet<>());

        System.out.printf("Time measurement for adding %d doubles to collections: %n", ELEMENTS_NUMBER);

        for (double baseValue = 0d; i < ELEMENTS_NUMBER; ++i, ++baseValue)
        {
            doubleArrayList.addElement(baseValue);
            doubleLinkedList.addElement(baseValue);
            doubleHashSet.addElement(baseValue);
            doubleTreeSet.addElement(baseValue);
        }

        System.out.printf(" ArrayList:  %.10f seconds %n", doubleArrayList.getAccumulatedAddTime());
        System.out.printf(" LinkedList: %.10f seconds %n", doubleLinkedList.getAccumulatedAddTime());
        System.out.printf(" HashSet:    %.10f seconds %n", doubleHashSet.getAccumulatedAddTime());
        System.out.printf(" TreeSet:    %.10f seconds %n%n", doubleTreeSet.getAccumulatedAddTime());

        for(int state = 0; state < 2; ++state)
        {
            switch(state)
            {
                case 0:
                {
                    System.out.println("Time measurement for getting the last element of ArrayList and finding it in all collections:");
                    elementToFind = doubleArrayList.getCollection().get(doubleArrayList.getCollection().size() - 1);
                    break;
                }

                case 1:
                {
                    System.out.println("Time measurement for getting the first element of ArrayList and finding it in all collections:");
                    elementToFind = doubleArrayList.getCollection().get(FIRST_ELEMENT);
                    break;
                }
                default:
                {
                    continue;
                }
            }

            doubleArrayList.hasElement(elementToFind);
            doubleLinkedList.hasElement(elementToFind);
            doubleHashSet.hasElement(elementToFind);
            doubleTreeSet.hasElement(elementToFind);

            System.out.printf(" ArrayList:  %.10f seconds %n", doubleArrayList.getLastOperationTime());
            System.out.printf(" LinkedList: %.10f seconds %n", doubleLinkedList.getLastOperationTime());
            System.out.printf(" HashSet:    %.10f seconds %n", doubleHashSet.getLastOperationTime());
            System.out.printf(" TreeSet:    %.10f seconds %n%n", doubleTreeSet.getLastOperationTime());
        }
    }
}
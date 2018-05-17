/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task2;

import java.util.*;

/**
 *
 * @author flyer
 */
public class CollectionsDouble {

    public static void main(String[] args) 
    {
        final double ELEMENT_NUMBER = 300000d;
        Double elementToFind;
        
        TimeMeasuredCollection<Double, ArrayList<Double> > d_arrayList = new TimeMeasuredCollection(new ArrayList<>());
        TimeMeasuredCollection<Double, LinkedList<Double> > d_linkedList = new TimeMeasuredCollection(new LinkedList<>());
        TimeMeasuredCollection<Double, HashSet<Double> > d_hashSet = new TimeMeasuredCollection(new HashSet<>());
        TimeMeasuredCollection<Double, TreeSet<Double> > d_treeSet = new TimeMeasuredCollection(new TreeSet<>());
        
        System.out.printf("Adding %.0f doubles to collections:%n", ELEMENT_NUMBER);
        
        for(double baseValue = 1d; baseValue < ELEMENT_NUMBER; ++baseValue)
        {
            d_arrayList.addElement(baseValue);
            d_linkedList.addElement(baseValue);
            d_hashSet.addElement(baseValue);
            d_treeSet.addElement(baseValue);
        }
        
        System.out.printf(" ArrayList:  %.9f seconds%n", d_arrayList.getAccumulatedAddTime());
        System.out.printf(" LinkedList: %.9f seconds%n", d_linkedList.getAccumulatedAddTime());
        System.out.printf(" HashSet:    %.9f seconds%n", d_hashSet.getAccumulatedAddTime());
        System.out.printf(" TreeSet:    %.9f seconds%n", d_treeSet.getAccumulatedAddTime());
        
        for(int x = 0; x < 2; ++x)
        {
            System.out.println();
            
            switch(x)
            {
                case 0:
                {
                    System.out.println("Search of the last element of ArrayList:");
                    elementToFind = d_arrayList.getStorage().get(d_arrayList.getStorage().size() - 1);
                    break;
                }
                
                case 1:
                {
                    System.out.println("Search of the first element of ArrayList:");
                    elementToFind = d_arrayList.getStorage().get(0);
                    break;
                }
                
                default:
                {
                    continue;
                }
            }
        
            d_arrayList.hasElement(elementToFind);
            d_linkedList.hasElement(elementToFind);
            d_hashSet.hasElement(elementToFind);
            d_treeSet.hasElement(elementToFind);
        
            System.out.printf(" ArrayList:  %.9f seconds%n", d_arrayList.getLastOperationTime());
            System.out.printf(" LinkedList: %.9f seconds%n", d_linkedList.getLastOperationTime());
            System.out.printf(" HashSet:    %.9f seconds%n", d_hashSet.getLastOperationTime());
            System.out.printf(" TreeSet:    %.9f seconds%n", d_treeSet.getLastOperationTime());
        }
    }
}

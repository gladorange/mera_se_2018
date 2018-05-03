package atarasov.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collections {
    public static void main(String[] args) {
        List newList = new LinkedList();
        newList.add("A");
        newList.add("A");
         System.out.println(newList);

        Set mn = new HashSet();
        mn.add("A");
        mn.add("A");
        mn.add("B");
        mn.add("C");

        Iterator it = mn.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next.equals("B")) {
                it.remove();
            }
        }

        for (Object o : mn) {
        //    System.out.println(o);
        }

        Map m = new TreeMap();
        m.put("B", "Beta");
        m.put("A", "Alpha");
        m.put("C", "Charlie");
        m.put("1", "One");
        m.put("A", "Apple");
       // System.out.println(m);

    }
}

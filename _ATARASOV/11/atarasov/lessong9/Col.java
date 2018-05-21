package atarasov.lessong9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Col {

    public static void main(String[] args) {
        List<Object> objects = Collections.synchronizedList(new ArrayList<>());


        synchronized (objects) {
            for (Object object : objects) {
                System.out.println(object);
            }
        }

        HashMap<String, String> map = new HashMap<>();
        Map<String, String> stringStringMap = Collections.synchronizedMap(map);

        ConcurrentHashMap<String, String> chs = new ConcurrentHashMap<>();
        //TreeMap
        ConcurrentSkipListMap<String, String> slMap = new ConcurrentSkipListMap<>();


    }
}

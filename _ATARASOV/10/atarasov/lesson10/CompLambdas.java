package atarasov.lesson10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompLambdas {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("andrey","yuri","Vasya", "Petya");

    /*    names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        names.sort((String o1,String o2) -> o2.toLowerCase().compareTo(o1.toLowerCase()));
        System.out.println(names);
    }
}

package atarasov.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import rybkin.task3.Person;

public class Streams {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Andrey", null, 1900, "Russia"));
        persons.add(new Person("Vasya", null, 1900, "Russia"));
        persons.add(new Person("Petya", null, 2001, "Russia"));
        persons.add(new Person("Misha", null, 2001, "Russia"));
        persons.add(new Person("Pavel", null, 2010, "Russia"));
        persons.add(new Person("Dmitry", null, 1990, "Russia"));
        persons.add(new Person("Oleg", null, 2010, "Russia"));

        List<Person> filteredPersons = persons.stream()
                                              .filter(person -> person.getYearofBirth() > 1989)
                                              .sorted(Comparator.comparing(p -> p.getYearofBirth()))
                                              .collect(Collectors.toList());

        //System.out.println(filteredPersons);

        Map<Integer, List<Person>> collect = persons.stream().collect(Collectors.groupingBy(p -> p.getYearofBirth()));
        System.out.println(collect);





    }
}

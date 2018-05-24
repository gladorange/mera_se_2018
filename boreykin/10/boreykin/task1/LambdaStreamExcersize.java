/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author flyer
 */
public class LambdaStreamExcersize 
{
    
    private static class  SortedObject<T>
    {
        private final String title;
        private final String paramTitle;
        T value;
        
        public SortedObject(String title, String paramTitle, T value)
        {
            this.title = title;
            this.paramTitle = paramTitle;
            this.value = value;
        }
        
        @Override
        public String toString()
        {
            return String.format("%s: %s - ", title, paramTitle) + value;
        }
        
        public T getValue()
        {
            return value;
        }
    }
    
    public static void main(String[] args) 
    {
        ArrayList<Shop> shops = new ArrayList<>();
        
        shops.add(new Shop("Магазин 1","Иванов Иван Иванович",
        new Good("Товар 1",  10,  100),
        new Good("Товар 2",  20,  200),
        new Good("Товар 3",  30,  300),
        new Good("Товар 4",  40,  400),
        new Good("Товар 5",  50,  500),
        new Good("Товар 6",  60,  600),
        new Good("Товар 7",  70,  700),
        new Good("Товар 8",  80,  800),
        new Good("Товар 9",  90,  900),
        new Good("Товар 10", 100, 1000)));
        
        shops.add(new Shop("Магазин 2","Иванов Иван Иванович",
        new Good("Товар 1",  10,  500),
        new Good("Товар 2",  20,  400),
        new Good("Товар 3",  30,  300),
        new Good("Товар 4",  40,  200),
        new Good("Товар 5",  50,  100),
        new Good("Товар 6",  60,  100),
        new Good("Товар 7",  70,  200),
        new Good("Товар 8",  80,  300),
        new Good("Товар 9",  90,  400),
        new Good("Товар 10", 100, 500)));
       
        shops.add(new Shop("Магазин 3","Петров Пётр Петрович",
        new Good("Товар 1",  11,  500),
        new Good("Товар 2",  21,  400),
        new Good("Товар 3",  31,  300),
        new Good("Товар 4",  41,  200),
        new Good("Товар 5",  51,  100),
        new Good("Товар 6",  61,  100),
        new Good("Товар 7",  71,  200),
        new Good("Товар 8",  81,  300),
        new Good("Товар 9",  91,  400),
        new Good("Товар 10", 101, 500)));
        
        shops.add(new Shop("Магазин 4","Петров Пётр Петрович",
        new Good("Товар 1",  11,  100),
        new Good("Товар 2",  21,  200),
        new Good("Товар 3",  31,  300),
        new Good("Товар 4",  41,  200),
        new Good("Товар 5",  51,  100),
        new Good("Товар 6",  61,  100),
        new Good("Товар 7",  71,  200),
        new Good("Товар 8",  81,  300),
        new Good("Товар 9",  91,  200),
        new Good("Товар 10", 101, 100)));
        
        shops.add(new Shop("Магазин 5","Александров Александр Александрович",
        new Good("Товар 1",  12,  500),
        new Good("Товар 2",  22,  500),
        new Good("Товар 3",  32,  500),
        new Good("Товар 4",  42,  500),
        new Good("Товар 5",  52,  500),
        new Good("Товар 6",  62,  500),
        new Good("Товар 7",  72,  500),
        new Good("Товар 8",  82,  500),
        new Good("Товар 9",  92,  500),
        new Good("Товар 10", 102, 500)));
        
        shops.forEach(i -> i.sellItemsOfEveryType(100));
        shops.forEach(Shop::debugPrint);
        
        System.out.println("Есть ли магазин с хотя бы одной полностью проданной позицией: " 
                + shops.stream().anyMatch(Shop::hasSoldOutTypes));
        
        System.out.println("Все ли магазины полностью продали хотя бы одну позицию: " 
                + shops.stream().allMatch(Shop::hasSoldOutTypes));
        
        System.out.println("Нет магазина с общим доходом меньше 200: " 
                + shops.stream().noneMatch(i -> i.getOverallRevenue() < 200));
        System.out.println();

        
        System.out.println("Магазины хотя бы с одной полностью сбытой позицией:");
        shops.stream().filter(Shop::hasSoldOutTypes).forEach(s -> System.out.println(" " + s.getTitle()));
        System.out.println();
        
        System.out.println("Директора магазинов:");
        shops.stream().map(Shop::getHeadName).distinct().sorted().forEach(s -> System.out.println(" " + s));
        System.out.println();
        
        System.out.println("Товары по остатку в магазинах:");
        shops.stream().flatMap(s -> 
                    s.getItems().stream().map((i) 
                        -> new SortedObject<Integer>(String.format("%s %s", s.getTitle(), i.getTitle()),
                                "остаток",
                                i.getRemaining())))
                .sorted((SortedObject<Integer> i, SortedObject<Integer> j) -> i.getValue() - j.getValue())
                .forEach(i -> System.out.println(" " +i));
        System.out.println();
   
        System.out.printf("Доход по всем магазинам: %d.%n",shops.stream().map(s -> s.getOverallRevenue()).reduce(Integer::sum).get());
        System.out.println();
        
        System.out.println("Директора и магазины под их управлением:");
        Map<String,List<Shop>> headGroup = shops.stream().collect(Collectors.groupingBy(s -> s.getHeadName()));
        for(String k:headGroup.keySet())
        {
            System.out.printf(" Под управлением директора \"%s\" находятся магазины:%n",k);
            headGroup.get(k).forEach(s -> System.out.println("  " + s.getTitle()));
        }
    }
}

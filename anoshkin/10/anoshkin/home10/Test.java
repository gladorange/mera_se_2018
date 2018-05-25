package anoshkin.home10;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop("5ka","Putin"));
        shops.add(new Shop("1ka", "Medvedev"));
        shops.add(new Shop("Magnit", "Lavrov"));
        shops.add(new Shop("Spar","Putin"));
        shops.add(new Shop("Eurospar", "Putin"));

        shops.get(0).addItems(new Flower((float) 5, 10));

        shops.get(1).addItems(new Bread(1.1f, 100));
        shops.get(1).addItems(new Flower(4f, 5));

        shops.get(2).addItems(new Bread(1.1f, 10));
        shops.get(2).addItems(new Flower(4f, 10));

        shops.get(3).addItems(new Bread(1.2f, 20));
        shops.get(3).addItems(new Flower(4.3f, 25));

        shops.get(4).addItems(new Bread(1.7f, 10));
        shops.get(4).addItems(new Flower(4.9f, 100));

        for(Shop shop: shops){
            shop.sell("Flower", 5);
        }

        System.out.println(shops.stream()
                .anyMatch(shop -> shop.getItems().stream()
                        .anyMatch(item -> item.getRest() == 0)));
        System.out.println(shops.stream()
                .allMatch(shop -> shop.getIncome() > 0));
        System.out.println(shops.stream()
                .noneMatch(shop -> shop.getIncome() < 20));

        System.out.println("Shops with 0 balances" + shops.stream()
                .filter(shop -> shop.getItems().stream()
                        .anyMatch(item -> item.getRest() == 0))
                .collect(Collectors.toList()));
        // out:
        // Shops with 0 balances[1ka]

        List<String> shopsManagers = shops.stream()
                .map(shop -> shop.getManager())
                .sorted()
                .collect(Collectors.toList());

        // out: [Lavrov, Medvedev, Putin, Putin, Putin]

        System.out.println(shopsManagers);
        // out:
        // {Lavrov=[Magnit], Medvedev=[1ka], Putin=[5ka, Spar, Eurospar]}

        List<Item> sortedItems = shops.stream()
            .flatMap(shop -> shop.getItems().stream())
            .sorted((a,b) -> a.getRest() - b.getRest())
                .collect(Collectors.toList());
        System.out.println(sortedItems);

        // out:
        // [Flower 0 4.0, Flower 5 5.0, Flower 5 4.0, Bread 10 1.1, Bread 10 1.7, Bread 20 1.2, Flower 20 4.3, Flower 95 4.9, Bread 100 1.1]

        System.out.println("Total income: " + shops.stream()
                .map(shop -> shop.getIncome())
                .reduce((a, b) -> a + b)
        );
        // out: Total income: Optional[111.0]

        Map<String, List<Shop>> shopsManagers2 = shops.stream()
                .sorted(Comparator.comparing(shop -> shop.getManager()))
                .collect(Collectors.groupingBy(sh -> sh.getManager()));

        System.out.println(shopsManagers2);
        // out:
        // {Lavrov=[Magnit], Medvedev=[1ka], Putin=[5ka, Spar, Eurospar]}

    }



}

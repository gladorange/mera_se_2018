package zudin.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main10 {
    public static void main(String[] args) {

        Shop shop1 = new Shop("shop1","Ivan");
        shop1.products.addAll(Arrays.asList
                (new Product("bread", 3, 1, 2),
                 new Product("milk", 4, 3, 7),
                 new Product("meat", 10, 32, 8),
                 new Product("potato", 3, 12, 6),
                 new Product("water", 2, 3, 4),
                 new Product("orange", 5, 5, 5),
                 new Product("apple", 4, 15, 4),
                 new Product("cucumber", 3, 6, 9),
                 new Product("tomato", 6, 4,2),
                 new Product("watermelon", 1, 5, 5)));

        Shop shop2 = new Shop("shop2","Ivan");
        shop2.products.addAll(Arrays.asList
                (new Product("bread", 5, 3, 5),
                 new Product("milk", 6, 5, 9),
                 new Product("meat", 12, 34, 10),
                 new Product("potato", 4, 14, 8),
                 new Product("water", 4, 0, 2),
                 new Product("orange", 5, 5, 5),
                 new Product("apple", 4, 15, 4),
                 new Product("cucumber", 3, 6, 9),
                 new Product("tomato", 6, 4,2),
                 new Product("watermelon", 1, 5, 5)));

        Shop shop3 = new Shop("shop3","Victor");
        shop3.products.addAll(Arrays.asList
                (new Product("bread", 5, 3, 5),
                 new Product("milk", 6, 5, 9),
                 new Product("meat", 12, 34, 10),
                 new Product("potato", 4, 14, 8),
                 new Product("water", 4, 5, 2),
                 new Product("orange", 5, 5, 5),
                 new Product("apple", 4, 15, 4),
                 new Product("cucumber", 3, 6, 9),
                 new Product("tomato", 6, 4,2),
                 new Product("watermelon", 1, 5, 5)));

        Shop shop4 = new Shop("shop4","Sergey");
        shop4.products.addAll(Arrays.asList
                (new Product("bread", 5, 3, 5),
                 new Product("milk", 6, 5, 9),
                 new Product("meat", 12, 34, 10),
                 new Product("potato", 4, 14, 8),
                 new Product("water", 4, 5, 2),
                 new Product("orange", 5, 5, 5),
                 new Product("apple", 4, 15, 4),
                 new Product("cucumber", 3, 6, 9),
                 new Product("tomato", 6, 4,2),
                 new Product("watermelon", 1, 5, 5)));


        Shop shop5 = new Shop("shop5","Irina");
        shop5.products.addAll(Arrays.asList
                (new Product("bread", 5, 3, 1),
                 new Product("milk", 6, 5, 9),
                 new Product("meat", 12, 34, 10),
                 new Product("potato", 4, 14, 8),
                 new Product("water", 4, 5, 2),
                 new Product("orange", 5, 5, 5),
                 new Product("apple", 4, 15, 4),
                 new Product("cucumber", 3, 6, 9),
                 new Product("tomato", 6, 2,2),
                 new Product("watermelon", 1, 5, 5)));

        List<Shop> shops = new ArrayList(){
            {
                add(shop1); add(shop2); add(shop3); add(shop4); add(shop5);
            }
        };

        System.out.println(shops.stream().anyMatch(shop -> shop.productIsEnded()));
        System.out.println(shops.stream().allMatch(shop -> shop.productWasSold()));
        System.out.println(shops.stream().noneMatch(shop -> shop.calcProfit() < 200));

        shops.stream().filter(shop -> shop.productIsEnded()).forEach(shop -> System.out.println(shop.getName()));
        shops.stream().map(shop -> shop.getDirectorName()).sorted().forEach(shop -> System.out.println(shop));
        shops.stream().flatMap(shop -> shop.products.stream())
                .sorted(Comparator.comparing(product -> product.getBalance()))
                .forEach(product -> System.out.printf(
                        "Product: %s Balance: %d\n", product.getName(), product.getBalance()));
        System.out.println(shops.stream()
                .mapToInt(shop -> shop.calcProfit())
                .reduce((p1, p2) -> p1 + p2).getAsInt());

        System.out.println(shops.stream().collect(Collectors.groupingBy(s -> s.getDirectorName())));
    }

}

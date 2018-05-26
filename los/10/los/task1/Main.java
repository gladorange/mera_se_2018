package los.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main
{
    private static class  SortedObject<T>
    {
        private final String nameShop;
        private final String nameProduct;
        T value;

        public SortedObject(String nameShop, String nameProduct, T value)
        {
            this.nameShop = nameShop;
            this.nameProduct = nameProduct;
            this.value = value;
        }

        @Override
        public String toString()
        {
            return String.format("%s: %s - ", nameShop, nameProduct) + value;
        }

        public T getValue()
        {
            return value;
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Shop> shops = new ArrayList<>();

        // Creating 5 shops, each shop contain 10 products
        // Product has nameProduct, cost, stockBalance, quantitySold
        shops.add(new Shop("Shop1","Donald John Trump",
                new Product("Product1",  324, 34, 9),
                new Product("Product2",  34,  65, 1),
                new Product("Product3",  30,  56, 3),
                new Product("Product4",  40,  56, 7),
                new Product("Product5",  50,  50056, 8),
                new Product("Product7",  70,  87, 4),
                new Product("Product8",  80,  78, 10),
                new Product("Product9",  90,  45, 9),
                new Product("Product10", 0, 9, 21)));

        shops.add(new Shop("Shop2","Mikhail Dmitrievich Prokhorov",
                new Product("Product1",  65,  65, 9),
                new Product("Product2",  56,  43534, 8),
                new Product("Product3",  63,  56, 7),
                new Product("Product4",  345,  435, 6),
                new Product("Product5",  656,  654, 5),
                new Product("Product6",  565,  45, 4),
                new Product("Product7",  345,  2132, 3),
                new Product("Product8",  56,  788, 2),
                new Product("Product9",  345,  34, 1),
                new Product("Product10", 345, 345, 0)));

        shops.add(new Shop("Shop3","Oleg Vladimirovich Deripaska",
                new Product("Product1",  34,  3, 5),
                new Product("Product2",  8,  345, 5),
                new Product("Product3",  567,  5345, 5),
                new Product("Product4",  767,  0, 5),
                new Product("Product5",  765,  0, 5),
                new Product("Product6",  565,  87, 5),
                new Product("Product7",  5656,  34, 5),
                new Product("Product8",  856,  45, 5),
                new Product("Product9",  5675,  43, 5),
                new Product("Product10", 5, 6456, 5)));

        shops.add(new Shop("Shop4","Donald John Trump",
                new Product("Product1",  76,  56, 1),
                new Product("Product2",  67,  56, 1),
                new Product("Product3",  567,  676, 0),
                new Product("Product4",  456,  77, 1),
                new Product("Product5",  67,  435, 1),
                new Product("Product6",  7,  54, 1),
                new Product("Product7",  7,  76, 1),
                new Product("Product8",  85,  35, 1),
                new Product("Product9",  576,  565, 1),
                new Product("Product10", 76, 65, 1)));

        shops.add(new Shop("Shop5","Anatoly Borisovich Chubais",
                new Product("Product1",  56,  55, 456),
                new Product("Product2",  76,  56, 56),
                new Product("Product3",  567,  456, 56),
                new Product("Product4",  567,  56, 98),
                new Product("Product5",  567,  545, 65),
                new Product("Product6",  657,  54, 32),
                new Product("Product7",  567,  56, 56),
                new Product("Product8",  67,  56, 98),
                new Product("Product9",  567,  456, 12),
                new Product("Product10", 76, 456, 67)));

        /*shops.forEach(i -> i.sellItemsOfEveryType(100));
        shops.forEach(Shop::debugPrint);*/

        System.out.println("Есть хоть один магазин с отсутствующим товаром: "
                + shops.stream().anyMatch(Shop::hasSoldOutTypes));

        System.out.println("Все магазины продали хотя бы один товар: "
                + shops.stream().allMatch(Shop::hasSoldOutTypes));

        System.out.println("Нет ни одного магазина с доходом меньше 200: "
                + shops.stream().noneMatch(i -> i.getTotalRevenue() < 200)
                 + "\n");

        System.out.println("Список магазинов в которых есть товары с одной полностью сбытой позицией:");
        shops.stream().filter(Shop::hasSoldOutTypes).forEach(s -> System.out.println(" " + s.getName()));
        System.out.println();

        System.out.println("Имя Отчество Фамилия директора магазинов(отсортированные по алфавиту):");
        shops.stream().map(Shop::getManagerName).distinct().sorted().forEach(s -> System.out.println(" " + s));
        System.out.println();

        System.out.println("Список товаров во всех магазинах, отсортированных по остатку:");
        shops.stream().flatMap(s ->
                s.getItems().stream().map((i)
                        -> new SortedObject<Integer>(String.format("%s %s", s.getName(), i.getName()),
                        "остаток",
                        i.getStockBalance())))
                .sorted((SortedObject<Integer> i, SortedObject<Integer> j) -> i.getValue() - j.getValue())
                .forEach(i -> System.out.println(" " +i));
        System.out.println();

        System.out.printf("Общий доход по всем магазинам: %d.%n",shops.stream().map(s -> s.getTotalRevenue()).reduce(Integer::sum).get());
        System.out.println();

        System.out.println("Имя Отчество Фамилия директора и список всех его магазинов:");
        Map<String,List<Shop>> managerGroup = shops.stream().collect(Collectors.groupingBy(s -> s.getManagerName()));
        for(String k:managerGroup.keySet())
        {
            System.out.printf(" Директор \"%s\" управляет следующими магазинами: %n",k);
            managerGroup.get(k).forEach(s -> System.out.println("  " + s.getName()));
        }
    }
}
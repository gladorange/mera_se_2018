package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Shop {
    String name;
    private Collection<Item> items = new ArrayList<>();
    private String director;
    private double profit;

    public Shop(String director, String name) {
        this.director = director;
        this.name = name;
    }

    public Item getItem(String name) {
        for (Item i: items) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }

    public void calcProfit(Item i, int sold) {
        this.profit += sold * i.getPrice();
    }

    public void addItem(Item i) {
        this.items.add(i);
    }

    public void sellItem(String name, int count) {
        Item i = getItem(name);
        if (i == null) {
            System.out.println("Item " + name + " does not exist");
            return;
        }

        if (i.sell(count)) {
            calcProfit(i, count);
        }

    }

    public boolean hasItemWithZeroCount(){
        for (Item i : items) {
            if (i.getCount() == 0) {
                return true;
            }
        }
        return false;
    }


    public int getSoldItemsTotal() {
        int sold = 0;
        for (Item i : items) {
            sold += i.getSold();
        }
        return sold;
    }

    public double getProfit() {
        return profit;
    }

    public void listAllItems() {
        System.out.println("Shop: " + this.name);
        for (Item i : items) {
            System.out.println("\tItem: " + i.getName() +
                    " Count: " + i.getCount() +
                    " Price: " + i.getPrice() +
                    " Sold: " + i.getSold());
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Collection<Shop> shops = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Shop s = new Shop(String.valueOf(99 - i), String.valueOf(i));
            shops.add(s);
            for (int j = 0; j < 10 ; j++) {
                s.addItem(new Item(String.valueOf(j), ((double)j+1)/100D + (double)j, 10-j-1));
            }
            s.sellItem("3" , 1);
            s.sellItem("9" , 9);

            s.listAllItems();
        }
        System.out.println("====================");

        System.out.println("There is shop with 0 items: " +
                shops.stream().anyMatch(shop -> shop.hasItemWithZeroCount() == true));

        System.out.println("All shops sold at least 1 item: " +
                shops.stream().allMatch(shop -> shop.getSoldItemsTotal() > 0));

        System.out.println("There is no shops with profit < 200: " +
                    shops.stream().noneMatch(shop -> shop.getProfit() < 200D));

        System.out.println("Shops with count=0 of any item: ");
        Collection<Shop> filtered = shops.stream()
                .filter(shop -> shop.hasItemWithZeroCount() == true)
                .collect(Collectors.toList());
            for (Shop i: filtered) {
                System.out.println("\tShop: " + i.name);
            }


        Collection<String> sortedDirectors = shops.stream()
                .map(shop -> shop.director)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted directors: " +  sortedDirectors);

        System.out.println("Items in all shops sorted by count: ");
        System.out.println(shops.stream()
                .flatMap(shop -> shop.items.stream())
                .sorted(Comparator.comparing(item -> item.getCount()))
                .collect(Collectors.toList())
        );

        System.out.println("Total profit in all shops: " +
                shops.stream()
                        .mapToDouble(shop -> shop.getProfit())
                        .reduce((p1, p2) -> p1 + p2)
                        .getAsDouble()
        );

        System.out.println("All shops of director: ");
        System.out.println(shops.stream()
                .collect(Collectors.groupingBy(s -> s.director))
        );
    }
}


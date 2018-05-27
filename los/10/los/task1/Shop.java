package los.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Shop
{
    ArrayList<Item> items;
    String managerName;
    String nameShop;

    public Shop(String nameShop, String managerName, Item ... items)
    {
        this.nameShop = nameShop;
        this.managerName = managerName;
        this.items = new ArrayList<>();
        this.items.addAll(Arrays.asList(items));
    }

    public String getName()
    {
        return nameShop;
    }

    public String getManagerName()
    {
        return managerName;
    }

    public ArrayList<Item> getItems()
    {
        return items;
    }

    public int getTotalRevenue()
    {
        return getSumMult(Item::getQuantitySold,Item::getCost);
    }

    public boolean hasSoldOutTypes()
    {
        return items.stream().anyMatch((i) -> i.getStockBalance() == 0);
    }


    protected int getSumMult(Function<Item,Integer> ... funcs)
    {
        return items.stream().map((i) -> Arrays.stream(funcs).map(f -> f.apply(i)).reduce((a,b) -> a*b).get()).reduce(Integer::sum).get();
    }
}
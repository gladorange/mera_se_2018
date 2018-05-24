/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/**
 *
 * @author flyer
 */

public class Shop 
{
    ArrayList<Item> items;
    String headName;
    String title;
    
    public Shop(String title, String headName, Item ... items)
    {
        this.title = title;
        this.headName = headName;
        this.items = new ArrayList<>();
        this.items.addAll(Arrays.asList(items));
    }
    
    public int getOverallRevenue()
    {
        return getSumMult(Item::getSold,Item::getPrice);
    }
    
    public int getOverallRemainingCount()
    {
        return getSum(Item::getRemaining);
    }
    
    public int getOverallSoldCount()
    {
        return getSum(Item::getSold);
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getHeadName()
    {
        return headName;
    }
    
    public void sellItemsOfEveryType(int count)
    {
        if(0 > count)
        {
            return;
        }
        
        for(Item i:items)
        {
            if(i.getRemaining() >= count)
            {
                i.sell(count);
            }
            else
            {
                i.sell(i.getRemaining());
            }
        }
    }
    
    public boolean hasSoldOutTypes()
    {
        return items.stream().anyMatch((i) -> i.getRemaining() == 0);
    }
    
    public ArrayList<Item> getItems()
    {
        return items;
    }
    
    public void debugPrint()
    {
        System.out.printf("Магазин: %s%n Директор: %s.%n", title, headName);
        items.forEach(i -> System.out.printf(" Позиция: название - \"%s\", цена - %d, осталось - %d, продано - %d.%n",
                i.getTitle(),i.getPrice(),i.getRemaining(),i.getSold()));
        System.out.printf("Совокупный доход магазина: %d.%n%n",getOverallRevenue());
    }

    protected int getSum(Function<Item,Integer> func)
    {
        return getSumMult(func);
    }
        
    protected int getSumMult(Function<Item,Integer> ... funcs)
    {
        return items.stream().map((i) -> Arrays.stream(funcs).map(f -> f.apply(i)).reduce((a,b) -> a*b).get()).reduce(Integer::sum).get();
    }
}

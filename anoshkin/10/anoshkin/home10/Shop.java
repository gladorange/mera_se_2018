package anoshkin.home10;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Item> items = new ArrayList<>();
    private String manager;
    private String shopName;

    public Shop(String name, String manager){
        this.manager = manager;
        this.shopName = name;
    }

    public Float getIncome(){
        Float Summ = 0.0f;
        for(Item item: items){
            Summ += item.getRealized()*item.getPrice();
        }
        return Summ;
    }
    public String getManager() {
        return manager;
    }

    public boolean sell(String item, Integer count){
        for(Item it: items){
            if(it.getName() == item){
                return it.sell(count);
            }
        }
        return false;
    }

    public Integer totalItems(){
        return items.size();
    }

    public final List<Item> getItems(){
        return items;
    }

    public void addItems(Item item){
        items.add(item);
    }

    public String getShopName() {
        return shopName;
    }

    @Override
    public String toString() {
        return getShopName();
    }
}

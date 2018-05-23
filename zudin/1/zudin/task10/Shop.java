package zudin.task10;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private String directorName;
    private int profit = 0;

    List<Product> products = new ArrayList();

    public String getDirectorName() {
        return directorName;
    }

    public String getName() {
        return name;
    }

    public Shop(String name, String directorName) {
        this.name = name;
        this.directorName = directorName;
        this.products = new ArrayList();
    }

    public int calcProfit() {
        for (Product p : products) {
            profit += p.getSoldOut() * p.getPriсe();
        }
        return profit;
    }

    public boolean productIsEnded() {
        for (Product p : products) {
            if (p.getBalance() == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean productWasSold() {
        for (Product p : products) {
            if (p.getSoldOut() == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString(){

        return getName();
    }
}

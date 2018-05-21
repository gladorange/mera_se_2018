package src;

interface Sellable {
    boolean sell(int count);

}

public class Item implements Sellable {
    private  String name;
    private double price;
    private int count;
    private int sold;

    public Item(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public int getSold() {
        return sold;
    }


    @Override
    public boolean sell(int toSell) {
        if (this.count < toSell) {
            System.out.println(
                    String.format("Not enough items to sell[requested %d, remained %d]", toSell, this.count));
            return false;
        }
        this.count -= count;
        this.sold += count;
        return true;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", sold=" + sold +
                '}';
    }
}

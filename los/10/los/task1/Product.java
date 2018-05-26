package los.task1;

public class Product implements Item
{
    private String nameProduct;
    private int cost;
    private int stockBalance;
    private int quantitySold;

    public Product(String nameProduct, int cost, int stockBalance, int quantitySold)
    {
        this.nameProduct = nameProduct;
        this.cost = cost;
        this.stockBalance = stockBalance;
        this.quantitySold = quantitySold;
    }

    @Override
    public String getName()
    {
        return nameProduct;
    }

    @Override
    public int getCost()
    {
        return cost;
    }

    @Override
    public int getStockBalance()
    {
        return stockBalance;
    }

    @Override
    public int getQuantitySold()
    {
        return quantitySold;
    }
}
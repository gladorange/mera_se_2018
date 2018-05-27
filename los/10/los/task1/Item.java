package los.task1;

public interface Item
{
    default public String getName()
    {
        return "Name is not known";
    }

    default public int getCost()
    {
        return 0;
    }

    default public int getStockBalance()
    {
        return 0;
    }

    default public int getQuantitySold()
    {
        return 0;
    }
}
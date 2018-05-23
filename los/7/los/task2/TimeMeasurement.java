package los.task1;

import java.util.Collection;

public class TimeMeasurement< V, T extends Collection<V> >
{
    private static final double DIVISOR_TO_SECOND = 1000000000f;
    private static final int FIRST_ELEMENT = 0;
    T collection;
    private long sumAddTime;
    private long lastOperationTime;

    TimeMeasurement(T collection)
    {
        sumAddTime = 0;
        lastOperationTime = 0;
        this.collection = collection;
    }

    public T getCollection()
    {
        return collection;
    }

    public void addElement(V element)
    {
        long before, after;
        before = System.nanoTime();
        collection.add(element);
        after = System.nanoTime();
        updateAccumulatedTime(before, after);
    }

    public boolean hasElement(V element)
    {
        boolean result;
        long before, after;

        before = System.nanoTime();
        result = collection.contains(element);
        after = System.nanoTime();

        updateLastOperationTime(before, after);

        return result;
    }

    protected void updateLastOperationTime(long before, long after)
    {
        lastOperationTime = after - before;
    }

    protected void updateAccumulatedTime()
    {
        sumAddTime += lastOperationTime;
    }

    protected void updateAccumulatedTime(long before, long after)
    {
        updateLastOperationTime(before, after);
        updateAccumulatedTime();
    }

    public double getAccumulatedAddTime()
    {
        return (double)sumAddTime/DIVISOR_TO_SECOND;
    }

    public double getLastOperationTime()
    {
        return (double)lastOperationTime/DIVISOR_TO_SECOND;
    }
}

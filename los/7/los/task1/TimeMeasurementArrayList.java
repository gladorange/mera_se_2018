package los.task1;

import java.util.ArrayList;

public class TimeMeasurementArrayList<T>
{
    private static final double DIVISOR_TO_SECOND = 1000000000f;
    private static final int FIRST_ELEMENT = 0;
    private ArrayList<T> arrayList;
    private long sumAddTime;
    private long lastOperationTime;

    public TimeMeasurementArrayList()
    {
        arrayList = new ArrayList<>();
        sumAddTime = 0;
        lastOperationTime = 0;
    }

    public void addElement(T element)
    {
        long before, after;
        before = System.nanoTime();
        arrayList.add(element);
        after = System.nanoTime();
        updateAccumulatedTime(before, after);
    }

    public T findFirstElement()
    {
        return findElement(FIRST_ELEMENT);
    }

    public T findLastElement()
    {
        return findElement(arrayList.size() - 1);
    }

    public T findElement(int index)
    {
        T element = arrayList.get(index);
        long before, after;

        before = System.nanoTime();
        arrayList.contains(element);
        after = System.nanoTime();

        updateLastOperationTime(before, after);

        return element;
    }

    public boolean hasElement(T element)
    {
        boolean result;
        long before, after;

        before = System.nanoTime();
        result = arrayList.contains(element);
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

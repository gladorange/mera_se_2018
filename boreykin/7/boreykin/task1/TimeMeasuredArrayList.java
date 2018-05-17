/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.util.ArrayList;

/**
 *
 * @author flyer
 * @param <T> - type for ArrayList
 */
public class TimeMeasuredArrayList<T>
{
    private static final float NANO_DIVISOR = 1000000000f;
    private ArrayList<T> storage;
    private long accumulatedAddTime;
    private long lastOperationTime;
    
    public TimeMeasuredArrayList()
    {
        storage = new ArrayList<>();
        accumulatedAddTime = 0;
        lastOperationTime = 0;
    }
    
    public void addElement(T element)
    {
        long start, end;
        start = System.nanoTime();
        storage.add(element);
        end = System.nanoTime();
        updateAccumulatedTime(start, end);
    }
    
    public T findFirstElement()
    {
        return findElement(0);
    }
    
    public T findLastElement()
    {
        return findElement(storage.size() - 1);
    }
    
    public T findElement(int index)
    {
        T element = storage.get(index);
        long start, end;
        
        start = System.nanoTime();
        storage.contains(element);
        end = System.nanoTime();
        
        updateLastOperationTime(start, end);
        
        return element;
    }
    
    public boolean hasElement(T element)
    {
        boolean result;
        long start, end;
        
        start = System.nanoTime();
        result = storage.contains(element);
        end = System.nanoTime();
        
        updateLastOperationTime(start, end);
        
        return result;
    }
    
    protected void updateLastOperationTime(long start, long end)
    {
        lastOperationTime = end - start;
    }
    
    protected void updateAccumulatedTime()
    {
        accumulatedAddTime += lastOperationTime;
    }
    
    protected void updateAccumulatedTime(long start, long end)
    {
        updateLastOperationTime(start, end);
        updateAccumulatedTime();
    }
    
    /**
     * getAccumulatedAddTime.
     * Gets accumulated time of all additions of elements to array list.
     * @return - Accumulated time in seconds
     */
    public float getAccumulatedAddTime()
    {
        return (float)accumulatedAddTime/NANO_DIVISOR;
    }
    
    public float getLastOperationTime()
    {
        return (float)lastOperationTime/NANO_DIVISOR;
    }
}

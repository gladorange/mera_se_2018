/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task2;

import java.util.Collection;

/**
 *
 * @author flyer
 * @param <V> - type of collection element
 * @param <T> - collection type
 */
public class TimeMeasuredCollection < V, T extends Collection<V> >
{
    private static final float NANO_DIVISOR = 1000000000f;
    private long accumulatedAddTime;
    private long lastOperationTime;
    T storage;
    
    TimeMeasuredCollection(T storage)
    {
        accumulatedAddTime = 0;
        lastOperationTime = 0;
        this.storage = storage;
    }
    
    public boolean addElement(V element)
    {
        boolean result;
        long start, end;
        
        start = System.nanoTime();
        result = storage.add(element);
        end = System.nanoTime();
        
        updateAccumulatedTime(start, end);
        
        return result;
    }
    
    public boolean hasElement(V element)
    {
        boolean result;
        long start, end;
        
        start = System.nanoTime();
        result = storage.contains(element);
        end = System.nanoTime();
        
        updateLastOperationTime(start, end);
        
        return result;
    }
    
    public T getStorage()
    {
        return storage;
    }
    
    public float getLastOperationTime()
    {
        return (float)lastOperationTime/NANO_DIVISOR;
    }
    
    public float getAccumulatedAddTime()
    {
        return (float)accumulatedAddTime/NANO_DIVISOR;
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
}

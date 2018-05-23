/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

/**
 *
 * @author flyer
 */
public interface Item 
{
    default public String getTitle()
    {
        return "DefTitle";
    }
    
    default public int getPrice()
    {
        return 0;
    }
    
    default public int getRemaining()
    {
        return 0;
    }
    
    default public int getSold()
    {
        return 0;
    }
    
    public void add(int count);
    public boolean sell(int count);
}

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
public class Good implements Item
{
    private String title;
    private int price;
    private int count;
    private int sold;
        
    public Good(String title, int price, int count)
    {
        this.title = title;
        this.price = (price >= 0) ? price : 0;
        this.count = (count >= 0 ) ? count : 0;
        this.sold = 0;
    }
    
    @Override
    public String getTitle()
    {
        return title;
    }
    
    @Override
    public int getPrice()
    {
        return price;
    }
    
    @Override
    public int getRemaining()
    {
        return count;
    }
    
    @Override
    public int getSold()
    {
        return sold;
    }
    
    @Override
    public boolean sell(int count)
    {
        if(count > this.count)
        {
            return false;
        }
        
        this.count -= count;
        this.sold += count;
        
        return true;
    }
    
    @Override
    public void add(int count)
    {
        this.count += count;
    }
}

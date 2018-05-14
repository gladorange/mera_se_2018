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
public class Dog extends Animal
{
    private static final int DEFAULT_BARK_VOLUME = 5;
    private int barkVolume;
    
    public Dog()
    {
        this("", -1);
    }
    
    public Dog(String name, int barkVolume)
    {
        super(name);
        this.barkVolume = (0 <= barkVolume) ? barkVolume : DEFAULT_BARK_VOLUME;
    }
    
    @Override
    public void sayHello()
    {
        String prefix;
        String suffix;
        
        if(barkVolume > DEFAULT_BARK_VOLUME)
        {
            prefix = "ГАВ";
            suffix = "лаю громко";
        }
        else if((barkVolume > 0)
            && (barkVolume < DEFAULT_BARK_VOLUME))
        {
            prefix = "Тяф";
            suffix = "лаю тихо";
        }
        else if(barkVolume == 0)
        {
            prefix = "Здравствуйте";
            suffix = "лаять не могу, поэтому просто улыбаюсь";
        }
        else
        {
            // Default
            prefix = "Гав";
            suffix = "я лаю";
        }
        
        System.out.printf("%s, я собака %s, %s.%n", prefix, this.getName(), suffix);
    }
    
    @Override
    public boolean equals(Object ob)
    {
        if(this == ob)
        {
            return true;
        }
        
        return (null != ob)
            && (ob instanceof Dog)
            && (super.equals((Animal)ob))
            && (((Dog)ob).barkVolume == this.barkVolume);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.barkVolume;
        return hash;
    }
    
    public int getBarkVolume()
    {
        return barkVolume;
    }
}

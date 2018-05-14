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
public class Zebra extends Animal
{
    private static final int DEFAULT_STRIPES = 10;
    private static final int MIN_STRIPES = 2;
    private int stripes;
    
    public Zebra(String name, int stripes)
    {
        super(name);
        this.stripes = (MIN_STRIPES < stripes) ? stripes : DEFAULT_STRIPES;
    }
    
    @Override
    public void sayHello()
    {
        System.out.printf("Иго-го, я зебра %s с %d полосами.%n", this.getName(), stripes);
    }
    
    @Override
    public boolean equals(Object ob)
    {
        if(this == ob)
        {
            return true;
        }
        
        return (null != ob)
                && (ob instanceof Zebra)
                && (super.equals((Animal)ob))
                && (((Zebra)ob).stripes == this.stripes);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.stripes;
        return hash;
    }
    
    public int getStripeNumber()
    {
        return stripes;
    }
}

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
public class Cat extends Animal
{
    private static final int DEFAULT_MUSTACHE_LENGTH = 5;
    private int mustacheLength;
    
    public Cat()
    {
        this("", -1);
    }
    
    public Cat(String name, int mustacheLength)
    {
        super(name);
        this.mustacheLength = (mustacheLength >= 0) ? mustacheLength : DEFAULT_MUSTACHE_LENGTH;
    }
    
    @Override
    public void sayHello()
    {
        String suffix;
        if(mustacheLength > DEFAULT_MUSTACHE_LENGTH)
        {
            suffix = "с удлинёнными усами";
        }
        else if((mustacheLength > 0)
             && (mustacheLength < DEFAULT_MUSTACHE_LENGTH))
        {
            suffix = "с укороченными усами";
        }
        else if(mustacheLength == 0)
        {
            suffix = "без усов";
        }
        else
        {
            // Default
            suffix = "с обычными усами";
        }
        
        System.out.printf("Мяу, я кот %s, %s.%n", this.getName(), suffix);
    }
    
    @Override
    public boolean equals(Object ob)
    {
        if(ob == this)
        {
            return true;
        }
        
        return (null != ob)
            && (ob instanceof Cat)
            && ((super.equals((Animal)ob)))
            && (((Cat)ob).mustacheLength == this.mustacheLength);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.mustacheLength;
        return hash;
    }
    
    public int getMustacheLength()
    {
        return mustacheLength;
    }
}

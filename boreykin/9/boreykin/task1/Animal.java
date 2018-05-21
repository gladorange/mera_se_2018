/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/**
 *
 * @author flyer
 */

@Retention(RetentionPolicy.RUNTIME)
@interface AnimalDescription
{
    String val();
}

public abstract class Animal
{
    private static final String DEFAULT_NAME_PREFIX = "Animal_";
    private static volatile long maxAnimalId = 1;
    
    private String name;
    private long animalId;
    
    public Animal()
    {
        this("");
    }
    
    public Animal(String name)
    {
        obtainId();
        this.name = ("".equals(name)) ? String.format("%s%d", DEFAULT_NAME_PREFIX, animalId) : name;
    }
        
    public abstract void sayHello();
    
    @Override
    public boolean equals(Object ob)
    {
        if(this == ob)
        {
            return true;
        }
        
        return (null != ob)
            && (ob instanceof Animal)
            && (((Animal)ob).name.equals(this.name));
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        if(false == "".equals(name))
        {
            this.name = name;
        }
    }
    
    public long getId()
    {
        return animalId;
    }
    
    private synchronized void obtainId()
    {
        animalId = maxAnimalId++;
    }
}

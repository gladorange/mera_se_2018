/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.regex.Pattern;

/**
 *
 * @author flyer
 */
public class AnimalReader 
{
    BufferedReader inReader;
    
    public AnimalReader(String fileName) throws FileNotFoundException
    {
        inReader = new BufferedReader(new FileReader(fileName));
    }
    
    public boolean readNextAnimal(Collection<Animal> animals, 
            Collection<Cat> cats,
            Collection<Dog> dogs,
            Collection<Zebra> zebras)
    {
        String lineToParse;
        String [] fields;
        Animal a;
        Pattern pat;
        
        try 
        {
            lineToParse = inReader.readLine();
        } 
        catch (IOException ex) 
        {
            return false;
        }
        
        if(null == lineToParse)
        {
            return false;
        }
        
        pat = Pattern.compile("[ ]+");
        fields = pat.split(lineToParse);
        
        if(fields.length < 3)
        {
            return false;
        }
        
        switch(fields[0])
        {
            case "Cat":
            {
                a = new Cat(fields[1], Integer.valueOf(fields[2]));
                cats.add((Cat)a);
                break;
            }
            case "Dog":
            {
                a = new Dog(fields[1], Integer.valueOf(fields[2]));
                dogs.add((Dog)a);
                break;
            }
            case "Zebra":
            {
                a = new Zebra(fields[1], Integer.valueOf(fields[2]));
                zebras.add((Zebra)a);
                break;
            }
            default:
            {
                return false;
            }
        }
        
        animals.add(a);
        return true;
    }
}

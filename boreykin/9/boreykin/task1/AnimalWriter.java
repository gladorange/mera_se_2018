/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

/**
 *
 * @author flyer
 * @param <TYPE> - defines extender of Animal class
 */
public abstract class AnimalWriter<TYPE extends Animal>
{
    private Collection<TYPE> associatedCollection;
    
    public String getAnimalClassName()
    {
        return getAnimalType().getSimpleName();
    }
    
    public String getAnimalDescription()
    {
        AnimalDescription ad = (AnimalDescription)getAnimalType().getAnnotation(AnimalDescription.class);
        return ad.val();
    }
    
    public void writeAll(BufferedWriter outWriter) throws IOException
    {
        if(null != associatedCollection)
        {
            writeAll(associatedCollection, outWriter);
        }
    }
    
    public void writeAll(Collection<TYPE> c, BufferedWriter outWriter) throws IOException
    {
        outWriter.write(String.format("{%n class:\"%s\",%n description:\"%s\",%n list:[%n", 
                getAnimalClassName(),
                getAnimalDescription()));
        for(TYPE a:c)
        {
            writeAnimal(a,outWriter);
        }
        
        outWriter.write(String.format(" ]%n}"));
    }
    
    public void associateCollection(Collection<TYPE> associatedCollection)
    {
        this.associatedCollection = associatedCollection;
    }
    
    protected void writeAnimal(TYPE a, BufferedWriter w) throws IOException
    {
        w.write(String.format("  {имя:\"%s\",",a.getName()));
        writeSpecificFields(a,w);
        w.write(String.format("},%n"));
    }
    
    protected abstract void writeSpecificFields(TYPE a, BufferedWriter w) throws IOException;
    
    protected Class getAnimalType()
    {
        Type t = this.getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        return (Class<TYPE>)pt.getActualTypeArguments()[0];
    }
}

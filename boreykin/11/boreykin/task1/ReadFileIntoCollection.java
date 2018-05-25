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

/**
 *
 * @author flyer
 */
public class ReadFileIntoCollection 
{
    private Collection<String> targetCollection;
    private final Object collectionMonitor;
    
    public ReadFileIntoCollection(Collection<String> targetCollection) throws NullCollectionProvided
    {
        setCollection(targetCollection);
        collectionMonitor = new Object();
    }
    
    public void readFile(String path) throws FileNotFoundException, IOException
    {
        try (BufferedReader inReader = new BufferedReader(new FileReader(path))) 
        {
            String lineToWrite;
            
            /* With this implementation there is a possible situation
            * when two threads can read one file and add its contents to the collection.
            * After this file contents will be added to the collection twice and element order
            * will be quite random. I do not know if it is required to prevent this and just made
            * writing to collection thread-safe.*/
            for(lineToWrite = inReader.readLine();
                    null != lineToWrite;
                    lineToWrite = inReader.readLine())
            {
                synchronized(collectionMonitor)
                {
                    targetCollection.add(lineToWrite);
                }
            }
        }
    }
    
    public final void setCollection(Collection<String> targetCollection) throws NullCollectionProvided
    {
        if(null == targetCollection)
        {
            throw new NullCollectionProvided();
        }
        
        this.targetCollection = targetCollection;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author flyer
 */
public class TextFileReaders 
{
    HashMap<Runnable,Thread> readers;
    ReadFileIntoCollection lineCollector;
    
    public TextFileReaders(ReadFileIntoCollection lineCollector)
    {
        readers = new HashMap<>();
        this.lineCollector = lineCollector;
    }
    
    public void addReader(String fileName)
    {
        readers.put(() -> 
        {
            try
            {
                lineCollector.readFile(fileName);
            }
            catch(IOException e)
            {
                System.out.printf("Failed to read file \"%s\": %s%n",fileName,e);
            }
        }, null);
    }
    
    public void runSequent()
    {
        readers.keySet().stream().forEach(Runnable::run);
    }
    
    public void runParallel()
    {
        readers.entrySet().stream().forEach(e -> e.setValue(new Thread(e.getKey())));
        readers.values().stream().forEach(Thread::start);
        readers.values().stream().forEach(t -> 
        {
            try
            {
                t.join();
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted thread run: " + e);
            }
        });
    }
}

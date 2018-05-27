/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author flyer
 */
public class ThreadExcersize 
{
    private static final float NANO_DIVISOR = 1000000000f;
        
    public static <T> void printMeasureOperation(Collection<T> collection, Runnable operation, String title)
    {
        long timeStamp_start, timeStamp_end;
        timeStamp_start = System.nanoTime();
        operation.run();
        timeStamp_end = System.nanoTime();
        System.out.printf("%s:%n"
                + " Элементов: %d.%n"
                + " Время операции: %.9f с.%n", 
                title,
                collection.size(),
                ((float)timeStamp_end - (float)timeStamp_start)/NANO_DIVISOR);
    }
    
    public static void main(String[] args) 
    {
        long timeStamp_start, timeStamp_end;
        ArrayList<String> fileStrings = new ArrayList<>();
        ReadFileIntoCollection fReader;
        try 
        {
            fReader = new ReadFileIntoCollection(fileStrings);
        } 
        catch (NullCollectionProvided ex) 
        {
            System.out.println("Exception caugnt: " + ex);
            return;
        }
        
        TextFileReaders readerList = new TextFileReaders(fReader);
        readerList.addReader("./file1.txt");
        readerList.addReader("./file2.txt");
        readerList.addReader("./file3.txt");
        
        printMeasureOperation(fileStrings,
                readerList::runSequent,
                "Последовательное добавление элементов в коллекцию");
        
        fileStrings.clear();
        
        printMeasureOperation(fileStrings,
                readerList::runParallel,
                "Параллельное добавление элементов в коллекцию");
   }
}

package los.task1;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Throwable
    {
        final int NUMBER_OBJECTS = 6;
        final int HALF_NUMBER_OBJECTS = 3;
        final int NUMBER_FILES = 3;
        String[] fileName = {"testFileWithStrings1.txt", "testFileWithStrings2.txt", "testFileWithStrings3.txt"};
        ReaderFilesWritingToCollections[] readerFiles = new ReaderFilesWritingToCollections[NUMBER_OBJECTS];
        long sumLinesFiles = 0;

        try {
            for(int i = 0,j = 0; i < NUMBER_OBJECTS; ++i, ++j)
            {
                if(j == NUMBER_FILES)
                {
                    j = 0;
                }
                readerFiles[i] = new ReaderFilesWritingToCollections(fileName[j]);
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Exception caught: " + ex);
            for(int i = 0; i < NUMBER_FILES; ++i) {
                System.out.printf("Could not find test file \"%s\". %n", fileName[i]);
            }
            return;
        }

        System.out.println("Synchronous reading from files: ");
        long before = System.nanoTime();
        for(int i = 0; i < HALF_NUMBER_OBJECTS; ++i) {
            readerFiles[i].readFile();
        }
        System.out.format("Total time of reading from %s files and writing to collection: %d \n", NUMBER_FILES, (System.nanoTime() - before));

        for(int i = 0; i < HALF_NUMBER_OBJECTS; ++i) {
            sumLinesFiles += readerFiles[i].getStringArrayList().size();
        }
        System.out.println("Sum number of lines in all files: " + sumLinesFiles);


        System.out.println("\nAsynchronous reading from files: ");
        try {
            Thread[] threadReaderFiles = new Thread[HALF_NUMBER_OBJECTS];
            for (int i = 3, j = 0; i < NUMBER_OBJECTS; ++i, ++j) {
                threadReaderFiles[j] = new ReaderFilesWritingToCollectionsThreads(readerFiles[i]);
            }

            before = System.nanoTime();
            for (int i = 0; i < HALF_NUMBER_OBJECTS; ++i) {
                threadReaderFiles[i].start();
            }
            for (int i = 0; i < HALF_NUMBER_OBJECTS; ++i) {
                threadReaderFiles[i].join();
            }

            System.out.format("Total time of reading from %s files and writing to collection: %d \n", NUMBER_FILES, (System.nanoTime() - before));
            sumLinesFiles = 0;
            for (int i = 3; i < NUMBER_OBJECTS; ++i) {
                sumLinesFiles += readerFiles[i].getStringArrayList().size();
            }
            System.out.println("Sum number of lines in all files: " + sumLinesFiles);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

package ru.merann.anoshkin.src.main.java.home11;

import sun.java2d.loops.GraphicsPrimitive;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String file1 = "C:\\Users\\danosh\\Downloads\\TheWarAndPeace1.txt";
        String file2 = "C:\\Users\\danosh\\Downloads\\TheWarAndPeace2.txt";
        String file3 = "C:\\Users\\danosh\\Downloads\\TheWarAndPeace3.txt";
        List<String> lines = new ArrayList<>();
        try {
            System.out.println("Start without threads:");
            int totalLines = 0;
            long before = System.nanoTime();
            totalLines += Reader.read(lines, file1);
            totalLines += Reader.read(lines, file2);
            totalLines += Reader.read(lines, file3);
            System.out.println("Total lines = " + totalLines);
            System.out.println("Total time = " + (System.nanoTime() - before));

            System.out.println("Start with multythreading:");
            totalLines = 0;
            before = System.nanoTime();

            List <String> threadLines = Collections.synchronizedList(new ArrayList<String>());

            Thread f1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Reader.read(threadLines, file1);
                    }
                    catch (IOException e) {
                        System.out.println(e);
                        System.exit(1);
                    }
                }
            });

            Thread f2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Reader.read(threadLines, file2);
                    }
                    catch (IOException e) {
                        System.out.println(e);
                        System.exit(1);
                    }
                }
            });

            Thread f3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Reader.read(threadLines, file3);
                    }
                    catch (IOException e) {
                        System.out.println(e);
                        System.exit(1);
                    }
                }
            });

            f1.start();
            f2.start();
            f3.start();
            try {
                f1.join();
                f2.join();
                f3.join();
            }
            catch (InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println("Total lines = " + threadLines.size());
            System.out.println("Total time = " + (System.nanoTime() - before));
        }
        catch (FileNotFoundException fe ){
            System.out.println("File not found: " + fe);
        }
        catch (IOException ioe){
            System.out.println("Can't read from file: " + ioe);
        }
    }
}

/*
Results
Start without threads:
Total lines = 20103
Total time = 340248732
Start with multythreading:
Total lines = 20103
Total time = 138919024
 */

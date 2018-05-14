/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.io.FileNotFoundException;

/**
 *
 * @author flyer
 */
public class ZooExcersize {

    public static void main(String[] args) 
    {
        Zoo zoo;
        AnimalReader aReader;
        String path = "zoo.txt";
        
        try
        {
           aReader = new AnimalReader(path) ;
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("Exception caught: " + ex);
            System.out.printf("Файл со списком животных \"%s\" не найден.%n", path);
            return;
        }
        
        zoo = new Zoo();
        
        while(true == aReader.readNextAnimal(zoo.getAllAnimalsList(), zoo.getCatList(), zoo.getDogList(), zoo.getZebraList()))
        {
            // No additional actions required here
        }
        
        System.out.println("Вас приветствуют коты:");
        AnimalTalker.sayHelloAll(zoo.getCatList());
        System.out.println();
        
        System.out.println("Вас приветствуют cобаки:");
        AnimalTalker.sayHelloAll(zoo.getDogList());
        System.out.println();

        System.out.println("Вас приветствуют зебры:");
        AnimalTalker.sayHelloAll(zoo.getZebraList());
        System.out.println();
        
        System.out.println("Вас приветствуют все сразу:");
        AnimalTalker.sayHelloAll(zoo.getAllAnimalsList());
        System.out.println();
   }
}

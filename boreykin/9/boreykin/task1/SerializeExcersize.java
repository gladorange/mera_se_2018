/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author flyer
 */
public class SerializeExcersize 
{
    public static void main(String[] args) 
    {
        String fileName;
        
        ArrayList<AnimalWriter<?>> aWriters = new ArrayList<>();
                
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Zebra> zebras = new ArrayList<>();
        
        CatWriter cw = new CatWriter();
        DogWriter dw = new DogWriter();
        ZebraWriter zw = new ZebraWriter();
        
        cats.add(new Cat("Барсик",4));
        cats.add(new Cat("Пират",5));
        cats.add(new Cat("Котофей",6));
        
        dogs.add(new Dog("Жучка",4));
        dogs.add(new Dog("Моська",5));
        dogs.add(new Dog("Барбос",6));
        
        zebras.add(new Zebra("Фрея",13));
        zebras.add(new Zebra("Капрея",14));
        zebras.add(new Zebra("Левкада",15));
        
        cw.associateCollection(cats);
        dw.associateCollection(dogs);
        zw.associateCollection(zebras);
        
        aWriters.add(cw);
        aWriters.add(dw);
        aWriters.add(zw);
        
        for(AnimalWriter<?> aw:aWriters)
        {
            fileName = String.format("./%s.json", aw.getAnimalClassName());
            try(BufferedWriter w = new BufferedWriter(new FileWriter(String.format("./%s.json", aw.getAnimalClassName()))))
            {
                aw.writeAll(w);
            } 
            catch (IOException ex) 
            {
                System.out.printf("Exception during writing %s: %s%n",fileName, ex);
            }
            System.out.println("Файл " + fileName + " успешно записан.");
        }
    }
}

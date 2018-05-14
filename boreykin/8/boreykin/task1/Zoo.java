/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.util.ArrayList;

/**
 *
 * @author flyer
 */
public class Zoo
{
    private ArrayList<Animal> animals;
    private ArrayList<Cat> cats;
    private ArrayList<Dog> dogs;
    private ArrayList<Zebra> zebras;
    
    public Zoo()
    {
        animals = new ArrayList<>();
        cats = new ArrayList<>();
        dogs = new ArrayList<>();
        zebras = new ArrayList<>();
    }
    
    public ArrayList<Animal> getAllAnimalsList()
    {
        return animals;
    }
    
    public ArrayList<Cat> getCatList()
    {
        return cats;
    }
    
    public ArrayList<Dog> getDogList()
    {
        return dogs;
    }
    
    public ArrayList<Zebra> getZebraList()
    {
        return zebras;
    }
}

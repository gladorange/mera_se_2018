/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author flyer
 */
public class AnimalTalker 
{
    public static void sayHelloAll(Collection<? extends Animal> c)
    {
        for(Animal a:c)
        {
            a.sayHello();
        }
    }
}

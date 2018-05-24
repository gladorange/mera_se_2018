package los.task1;

import java.util.Collection;
import java.util.Iterator;

public class AnimalTalker
{
    public static void sayHelloAll(Collection<? extends Animal> collection)
    {
        for(Animal i:collection)
        {
            i.sayHello();
        }
        System.out.println();
    }
}

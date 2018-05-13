package src;

import java.util.Collection;

public class AnimalTalker <T extends Animal>{

    public void sayHelloAll(Collection<T> collection) {
        for (T animal: collection) {
            animal.sayHello();
        }
    }
}

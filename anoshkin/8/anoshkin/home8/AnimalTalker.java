package anoshkin.home8;

import java.util.List;

public class AnimalTalker {
    public static void sayHello(List<? extends Animal> animals){
        for (Animal animal: animals){
            animal.sayHello();
        }
    }
}

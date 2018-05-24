package telukhin.task1;

import java.util.ArrayList;

public class AnimalTalker {

    static void sayHelloAll(ArrayList<? extends Animal> list) {
        for (Animal a : list) {
            System.out.print(a.getName() + " ");
            a.sayHello();
        }
        System.out.println();
    }
}

package zudin.task8;

import java.util.ArrayList;

public class AnimalTalker {

 public void sayHelloAll (ArrayList<? extends Animal> animals){
     for (Animal a : animals) {
     a.sayHello();
     }


 }
}

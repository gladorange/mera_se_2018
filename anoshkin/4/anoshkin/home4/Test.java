package anoshkin.home4;

import anoshkin.home3.Person;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Person mic = new Artist("Michelangio", Artist.Style.EXPRESSIONIST);
        Person leo = new Artist("Leonardo", "LeonardoLastName");
        Person put = new Person("Vladimir", "Putin", "1952", "Russia");
        ArrayList<Person> men = new ArrayList<Person>();
        men.add(mic);
        men.add(leo);
        men.add(put);
        for(Person m : men){
            m.printInfo();
        }
    }
}

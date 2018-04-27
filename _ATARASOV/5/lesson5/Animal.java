package lesson5;

import java.util.Arrays;
import java.util.Random;

interface WildAnimal {
    public void eatSomebody(String somebody);
}

interface VeganAnimal {
    public static final String CONSTANT = "КАКОЕ_ТО ЗНАЧЕНИЕ";
    public void eatGrass(String typeOfGrass);
}

public abstract class Animal extends Object {
    protected final String name;

    @Override
    public boolean equals(Object o) {
        return name.equals(((Animal)o).name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public Animal(String name) {
        Random r = new Random();
        this.name = name;
        final int a;
        if (2 > 1) {
            a = 2;
        } else {
            a = 42;
        }

    /*    int a = 2;
            int c = a + 6;
            int b = a +4;

        */
    }

    enum Test { ABC, DFE;}

    public static void main(final String[] args) {
        System.out.println(Arrays.toString(Test.values()));

    }

    public String getName() {
        return name;
    }

  /*  @Override
    public String toString() {
        return "Я " + name;
    }
*/
    public abstract void walk();

    public static String getClassName() {
        return "Animal";
    }
}

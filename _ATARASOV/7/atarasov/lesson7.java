package atarasov;

import java.util.Collections;
import java.util.Set;

import rybkin.task3.Person;

public class lesson7 {
    static class Box <TYPE> {
        TYPE item;

        public TYPE getItem() {
            return item;
        }

        public void setItem(TYPE item) {
            this.item = item;
        }

        public <U> U  clone(U variable) {
            if (variable instanceof String) {
                return (U) new String(((String) variable).getBytes());
            }

            if (variable instanceof Integer) {
                return (U) new Integer((Integer) variable);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Box<Person> b = new Box<>();
        b.setItem(new Person(1990));
        String original = "123";
        String clone = b.clone(original);
        Integer original2 = 512;
        Integer clone2 = b.clone(original2);
        System.out.println(clone);
        System.out.println(clone2);
        System.out.println(clone2 == original2);
        System.out.println(clone == original);

        Box<Number> mBox = new Box<>();
        mBox.setItem(new Integer(2));
        Number item = mBox.getItem();

        PersonWithCoins p = new PersonWithCoins();
    }


    static class PersonWithCoins {
        Set<Integer> coins = Collections.emptySet();
        Set<String> strs = Collections.emptySet();
    }
}

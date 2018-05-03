package atarasov.lesson6;

import java.io.FileNotFoundException;

public class ExceptionLesson {


    public static class IllegalAgeException extends Exception {
        String info;

        public IllegalAgeException(String info) {
            this.info = info;
        }
    }

    public static class Person{
        String name;
        int age;

        public Person(String name, int age) throws IllegalAgeException {
            this.name = name;
            this.age = age;
            if (age < 0) {
                throw new IllegalAgeException("Неправильный возраст для " + name);
            }

        }
    }

    public static void main(String[] args) {
        try {
            Person p = new Person("Андрей", 1);
            Person p2 = new Person("Вася", -2);
            System.out.println(p2);
        } catch (IllegalAgeException e) {
            System.out.println(e.info);
        }

       /* try {
            method2();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }*/
    }

    public static void method2() throws FileNotFoundException {

        try {
            method4();
        }
        catch (NullPointerException | ArithmeticException e) {
            System.out.println("Исключение" + e);
        }

        System.out.println("После выполенения method3");
    }

    private static void method4() throws FileNotFoundException {
            throw new FileNotFoundException("Всегда кидательное исключеное");
    }

    private static void method3() {
        int a = 1;
        int b = 0;
        int c = a / b;
        Object o = null;
        o.toString();
        System.out.println("Конец");
    }

}

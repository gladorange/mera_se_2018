package atarasov.lesson9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import jdk.nashorn.internal.objects.annotations.Property;
import rybkin.task3.Person;



public class Refl {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface JsonName {
        String value();
    }

 /*   SOLID
    S - Single Responsibility principle
    O - Open-closed
    L - Liskov substitution principle
    I - Interface segregation
    D - Dependency Inversion Principle (Dependency Injection)
    */

    public static class Example {
        private String name;

        @JsonName("surname")
        private String value;

        public Example() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static void fields(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Example e = new Example();
        Class<? extends Example> aClass = e.getClass();
        Integer v1 = null;
        Integer v2 = null;
        for (Field field : aClass.getDeclaredFields()) {
            field.setAccessible(true);
            field.set(e, 0);
            System.out.println(field.get(e));
            System.out.println(field.getName());
        }
        Method calc = aClass.getDeclaredMethod("calc", Integer.class, Integer.class);
        Method calc1 = aClass.getDeclaredMethod("calc", Integer.TYPE);
        calc1.invoke(e, 42);
    }

    public static void main(String[] args) throws IllegalAccessException {
        Example e1 = new Example();
        e1.setName("Andrey");
        e1.setValue("Tarasov");
        System.out.println(serialize(e1));
    }


    public static String serialize(Object obj) throws IllegalAccessException {
        String result = "{";

        Class<?> aClass = obj.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            field.setAccessible(true);
            String fieldName = field.getName();

            JsonName annotation = field.getAnnotation(JsonName.class);
            if (annotation != null) {
                fieldName = annotation.value();
            }
            result +=fieldName + ":\"" + field.get(obj) + "\"";
            if (i != declaredFields.length -1) {
                result += ",";
            }
        }


        return result + "}";
    }

}

package ru.mera.atarasov;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( generateRandomString() );
        SaySomething s = () -> "Hello";
    }

    public int calc(int a, int b) {
        return a + b;
    }

    public static String generateRandomString() {
        return RandomStringUtils.random(42);
    }

    public interface SaySomething {
        String say();
    }
}

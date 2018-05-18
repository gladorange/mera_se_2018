package rybkin.task3;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName = "none";
    private String secondName = "none";
    private Integer yearOfBirth = 0;
    private String country = "none";
    static int personCount;

    public List<String> fruits = new ArrayList<>();

    public Person () {
        personCount++;

        if (Math.random() * 100 < 50) {
            fruits.add("Яблоко");
        } else {
            fruits.add("Апельсины");
            fruits.add("Груши");
        }

    }

    public static int getPersonCount() {
        return personCount;
    }

    public Person(String firstName, String secondName, Integer yearOfBirth, String country) {
        this();
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.country = country;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getYearofBirth() {
        return yearOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setYearofBirth(Integer yearofBirth) {
        this.yearOfBirth = yearofBirth;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName='" + firstName + '\'' + ", yearOfBirth=" + yearOfBirth + '}';
    }
}

package src;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public abstract class Person {
    private String firstName;
    private String secondName;
    private Date birthday;
    private String country;
    private static int counter = 0;


    public Person(String firstName, String secondName, Date birthday, String country) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday   = birthday;
        this.country    = country;
        counter++;
    }

    public static void printCounter() {
        System.out.println("Total persons: " + counter);
    }

    public void printInfo() {
        System.out.println(String.format("%s %s", this.firstName, this.secondName));

        if (this.birthday != null) {
            DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println(String.format("\tBorn at %s", sdf.format(this.birthday)));
        }
        if (this.country != null) {
            System.out.println(String.format("\tCountry: %s", this.country));
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}

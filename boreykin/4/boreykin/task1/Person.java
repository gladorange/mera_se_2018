/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

/**
 *
 * @author flyer
 */
public class Person 
{
    private static int personCount = 0;
    protected static final String DEFAULT_FIRST_NAME = "DefaultFirstName";
    protected static final String DEFAULT_LAST_NAME = "DefaultLastName";
    protected static final int DEFAULT_BIRTH_YEAR = 0;
    protected static final String DEFAULT_COUNTRY = "Nowhere";
    
    private String firstName;
    private String lastName;
    private int birthYear;
    private String country;
    
    public Person()
    {
        this(DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_BIRTH_YEAR, DEFAULT_COUNTRY);
    }
    
    public Person(Person person)
    {
        this(person.firstName,person.lastName, person.birthYear, person.country);
    }
    
    public Person(String firstName)
    {
        this(firstName,DEFAULT_LAST_NAME,DEFAULT_BIRTH_YEAR,DEFAULT_COUNTRY);
    }
    
    public Person(String firstName, String lastName)
    {
        this(firstName,lastName,DEFAULT_BIRTH_YEAR,DEFAULT_COUNTRY);
    }
    
    public Person(String firstName, String lastName, int birthYear)
    {
        this(firstName,lastName,birthYear,DEFAULT_COUNTRY);
    }
    
    public Person(String firstName, String lastName, int birthYear, String country)
    {
        personCount++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.country = country;
    }
    
    public void printInfo()
    {
        System.out.printf("Данные: %s %s, родился в %d году%n",
                this.firstName,
                this.lastName,
                this.birthYear);
    }

    public static int getPersonCount() {
        return personCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

   public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

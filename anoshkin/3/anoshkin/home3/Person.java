package anoshkin.home3;

public class Person {
    private String name;
    private String surname;
    private String birthDate;
    private String country;
    private static int count = 0;

    public Person(String name, String surname, String birthDate, String country){
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.country = country;
        count ++;
    }

    public static int getCount(){
        return count;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }

    public void printInfo(){
        String out = getName() + " " + getSurname() + " родился в " + getBirthDate() + " году.";
        System.out.println(out);
    }
}

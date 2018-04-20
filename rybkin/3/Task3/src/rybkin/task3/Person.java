package rybkin.task3;

public class Person {
    private String firstName = "none";
    private String secondName = "none";
    private Integer yearOfBirth = 0;
    private String country = "none";

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
}

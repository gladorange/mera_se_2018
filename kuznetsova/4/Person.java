public class Person {
    private String firstName;
    private String secondName;
    private String birthdayDate;
    private String city;
    private static int countOfPerson = 0;

    public Person(String firstName, String secondName, String birthdayDate, String city) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthdayDate = birthdayDate;
        this.city = city;
        countOfPerson = countOfPerson + 1;
    }

    public static int getCountOfPerson() {
        return countOfPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void printInfo () {
        System.out.println(String.format("Меня зовут %s, моя фамиля %s, я родился в %s году",this.firstName,this.secondName,this.birthdayDate));

    }
}

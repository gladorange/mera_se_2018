package rybkin.task4;

public class Painter extends Person {



    public Painter (String firstName, String secondName, int yearOfBirth, String country, Style generalStyle){
        super(firstName, secondName, yearOfBirth, country);
        this.generalStyle = generalStyle;
    }
    private Style generalStyle = Style.MAIN_S;

    public Painter (String firstName, String secondName){
        this(firstName, secondName, 1980, "Russia", generalStyle);
    }
    public Painter (String firstName, Style generalStyle) {
        this(firstName, "Петров", 1980, "Russia", generalStyle);
    }
    public Painter (String firstName, String secondName, Style generalStyle){
        this(firstName, secondName, 1980, "Russia", generalStyle);
    }

    public enum Style {
        MAIN_S ("Всемогущий"),
        IMPRESSIONISM ("Импрессионизм"),
        EXPRESSIONISM("Экспрессионизм"),
        CUBISM("Кубизм"),
        MODERNISM("Модернизм"),
        NEOCLASSICISM("Неоклассицизм"),
        ROMANTISM("Роонтизм"),
        REALISM("Реализм");

        String rusName;

        Style(String rusName) {
            this.rusName = rusName;
        }
        public String toString() {
            return rusName;
        }
    }


    public void printInfo () {
        super.printInfo();
        System.out.println("основой силь рисования" + generalStyle);
    }

}

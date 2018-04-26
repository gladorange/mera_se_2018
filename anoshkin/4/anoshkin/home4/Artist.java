package anoshkin.home4;
import anoshkin.home3.Person;

import javax.xml.bind.annotation.XmlType;

public class Artist extends Person {
    public enum Style {
        IMPRESSIONIST("Импрессионизм"),
        EXPRESSIONIST("Экспрессионизм"),
        CUBISM("Кубизм"),
        MODERNISM("Модернизм"),
        NEOCLASSICISM("Неоклассицизм"),
        ROMANTISM("Романтизм"),
        REALISM("Реализм");

        private final String description;

        Style(String s) {
            this.description = s;
        }

        @Override
        public String toString() {
            return this.description;
        }
    }

    private static final String DEFAULT_NAME = "Unknown";
    private static final String DEFAULT_SURNAME = "Unknown";
    private static final String DEFAULT_BIRTHDATE = "Unknown";
    private static final String DEFAULT_COUNTRY = "Unknown";
    private static final Style DEFAULT_STYLE = Style.IMPRESSIONIST;

    private Style style;


    public Artist(String name, String surname, String birthDate, String country, Style style) {
        super(name, surname, birthDate, country);
        this.style = style;
    }

    public Artist(String name, String surname){
        this(name, surname, DEFAULT_BIRTHDATE, DEFAULT_COUNTRY, DEFAULT_STYLE);
    }

    public Artist(String name, Style style){
        this(name, DEFAULT_SURNAME, DEFAULT_BIRTHDATE, DEFAULT_COUNTRY, style);
    }

    public Artist(String name, String surname, Style style){
        this(name, surname, DEFAULT_BIRTHDATE, DEFAULT_COUNTRY, style);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        String out = "Основной стиль рисования: " + this.style.toString();
        System.out.println(out);
    }
}

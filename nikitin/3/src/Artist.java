package src;

import java.util.Date;

public class Artist extends Person {
    private Style style;

    public enum Style {
        STYLE_UNKNOWN("Неизвестно"),
        STYLE_POSTIMPRESSIONISM("Пост импрессионизм"),
        STYLE_CUBISM("Кубизм"),
        STYLE_ABSTRSACTIONISM("Абстракционизм"),
        STYLE_MODERN("Модернизм"),
        STYLE_PORTRAIT("Портрет"),
        STYLE_POFIGIZM("Пофигизм"),
        STYLE_ROMANTISM("Романтизм"),
        STYLE_REALISM("Реализм");

        private String rusName;

        private Style(String rusName) {
            this.rusName = rusName;
        }
        public String getRusName() {return rusName;}
    };

    public Artist(String firstName, String secondName) {
        super(firstName, secondName, null, null);
    }

    public Artist(String firstName, String secondName, Style style, Date birthday, String country) {
        super(firstName, secondName, birthday, country);
        this.style = style;
    }

    public Artist(String firstName, String secondName, Style style) {
        this(firstName, secondName, style, null, null);
    }

    public Artist(String firstName, Style style) {
        this(firstName, null, style, null, null);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print("\tGeneral style: " + this.style.getRusName());
    }


}

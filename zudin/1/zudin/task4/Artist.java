package zudin.task4;

public class Artist extends Person {

    private MainStyle style;

    public Artist(String firstName, String lastName) {
        super(firstName, lastName, null);
        this.style = null;
    }

    public Artist(String firstName, MainStyle style) {
        super(firstName, "", null);
        this.style = style;
    }

    public Artist(String firstName, String lastName, MainStyle style) {
        super(firstName, lastName, null);
        this.style = style;
    }

    enum MainStyle {
        IMPRESSIONISM("Импрессионизм"),
        EXPRESSIONISM("Экспрессионизм"),
        CUBISM("Кубизм"),
        MODERNIZM("Модернизм"),
        NEOCLASSICISM("Неокласицизм"),
        ROMANTICISM("Романтизм"),
        REALISM("Реализм");

        private String translation;

        MainStyle(String translation) {
            this.translation = translation;
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        if (style != null) {
            System.out.println("Основной стиль рисования: " + style.translation);
            System.out.println();
        } else {
            System.out.println();
        }
    }
}

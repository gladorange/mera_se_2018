public class Painter extends Person {

    enum ProfessionStyle {
        DEFAULT("Нет стиля"),
        IMPRESSIONISM("Импрессионизм"),
        EXPRESSIONISM("Экспрессионизм"),
        CUBISM("Кубизм"),
        MODERNISM("Модернизм"),
        NEOCLASSICISM("Неоклассицизм"),
        ROMANTICISM("Романтизм"),
        REALISM("Реализм");

        String rusProfessionStyle;

        ProfessionStyle(String rusProfessionStyle) {
            this.rusProfessionStyle = rusProfessionStyle;
        }

        @Override
        public String toString() {
            return rusProfessionStyle;
        }
    }
    private ProfessionStyle rusProfessionStyle;

    public Painter(String firstName, String secondName, String birthdayDate, String city,ProfessionStyle rusProfessionStyle) {
        super(firstName, secondName, birthdayDate, city);
        this.rusProfessionStyle = rusProfessionStyle;
    }

    public Painter(String firstName, String secondName) {
        this(firstName, secondName,"","", ProfessionStyle.DEFAULT);
    }

    public Painter(String firstName, ProfessionStyle rusProfessionStyle) {
        this(firstName,"no name", "","",rusProfessionStyle);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(String.format("Основной стиль рисования %s",rusProfessionStyle));

    }
}

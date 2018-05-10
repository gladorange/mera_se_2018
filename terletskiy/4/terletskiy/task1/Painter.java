package terletskiy.task1;

public class Painter extends Person{
    private Style mainStyle = DEFAULT_STYLE;
    private static final String DEFAULT_NAME = "NoName";
    private static final int DEFAULT_YEAR = 0;
    private static final Style DEFAULT_STYLE = Style.GENERIC;

    public Painter(String firstName, String lastName, int birthYear, Style mainStyle) {
        super(firstName, lastName, birthYear);
        this.mainStyle = mainStyle;
    }

    //- Имя, фамилию
    public Painter(String firstName, String lastName) {
        this(firstName, lastName, DEFAULT_YEAR, DEFAULT_STYLE);
    }

    //- Имя, Стиль
    public Painter(String firstName, Style mainStyle) {
        this(firstName, DEFAULT_NAME, DEFAULT_YEAR, mainStyle);
    }

    //- Имя, фамилию, стиль (используйте перегруженные версии конструкторов)
    public Painter(String firstName, String lastName, Style mainStyle) {
        this(firstName, lastName, DEFAULT_YEAR, mainStyle);
    }

    // который выводит тоже самое, но еще добавляет строку "Основной стиль рисования: стиль)
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(String.format("Основной стиль рисования: %s", mainStyle));
    }

    public enum Style{
        GENERIC("Все могу"),
        IMPRESSIONISM("Импрессионизм"),
        EXPRESSIONISM("Экспрессионизм"),
        CUBISM("Кубизм"),
        MODERNISM("Модернизм"),
        NEOCLASSICIS("Неоклассицизм"),
        ROMANTICISM("Романтизм"),
        REALISM("Реализм");

        private final String rusName;

        Style(String rusName){
            this.rusName = rusName;
        }

        @Override
        public String toString() {
            return rusName;
        }
    }
}

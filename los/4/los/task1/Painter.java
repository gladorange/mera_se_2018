package los.task1;

public class Painter extends Person {
    public enum STYLE
    {
    IMPRESSIONISM,
    EXPRESSIONISM,
    CUBISM,
    MODERNISM,
    NEOCLASSICISM,
    ROMANTICISM,
    REALISM,
    NOT_KNOWN;

    @Override
    public String toString()
    {
        switch(this)
        {
            case IMPRESSIONISM:
            {
                return "Импрессионизм";
            }
            case EXPRESSIONISM:
            {
                return "Экспрессионизм";
            }
            case CUBISM:
            {
                return "Кубизм";
            }
            case MODERNISM:
            {
                return "Модернизм";
            }
            case NEOCLASSICISM:
            {
                return "Неоклассицизм";
            }
            case ROMANTICISM:
            {
                return "Романтизм";
            }
            case REALISM:
            {
                return "Реализм";
            }
            default:
            {
                return "Стиль неизвестен";
            }
        }
    }
   }

    private STYLE mainStyle;

    public Painter(String name, String surname, int yearBirthday) {
        super(name, surname, yearBirthday);
        this.mainStyle = Painter.STYLE.NOT_KNOWN;
    }

    public Painter(String name, String surname)
    {
        super(name, surname);
        this.mainStyle = Painter.STYLE.NOT_KNOWN;
    }

    public Painter(String name, STYLE style)
    {
        super(name);
        this.mainStyle = style;
    }

    public Painter(String name, String surname,STYLE style)
    {
        super(name, surname);
        this.mainStyle = style;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.format("The main style of painting: %s \n\n", this.mainStyle);
    }
}

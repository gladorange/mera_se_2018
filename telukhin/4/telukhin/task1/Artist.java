package telukhin.task1;

public class Artist extends Person {
    private Style style;


    public Artist(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Artist(String firstName, Style style) {
        super(firstName);
        this.style = style;
    }

    public Artist(String firstName, String lastName, Style style) {
        super(firstName, lastName);
        this.style = style;
    }

    public Artist(String firstName, String lastName, int yearBirth, Style style) {
        super(firstName, lastName, yearBirth);
        this.style = style;
    }


    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public void printInfo(){
        System.out.println(String.format(
                "%s %s, родился в %d году. Основной стиль рисования: %s",
                super.getFirstName(),
                super.getLastName(),
                super.getYearBirth(),
                Style.toRussian(this.style)));
    }



}

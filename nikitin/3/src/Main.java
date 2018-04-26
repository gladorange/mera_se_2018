package src;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Artist vincent = new Artist("Vincent", "Van Gogh", Artist.Style.STYLE_POSTIMPRESSIONISM);
        vincent.printInfo();


        /*
        Autor jesus = new Autor("Jesus", "Christ", new Date(), "Judea, Roman Empire");
        jesus.printInfo();
        jesus.writeBook("Holy F*cking Bible", 666);
        jesus.printBooks();


        Autor gogol = new Autor("Nikolay", "Gogol", new Date(), "Russia");
        gogol.writeBook("Dead Souls I", 121);
        gogol.writeBook("Dead Souls II", 422);
        gogol.printBooks();
        Book.printTotalPages();
        gogol.burnBook("Dead Souls II");
        gogol.printBooks();
        Book.printTotalPages();


        Autor pushkin = new Autor("Alex", "Push", new Date(), "Russia");
        pushkin.writeBook("Evgen Onegin ", 345);
        pushkin.printBooks();

        Person.printCounter();
        Book.printTotalPages();
        */
    }

}

package zudin.task4;

import zudin.task4.Artist.MainStyle;

public class Main4 {

    public static void main(String[] args) {

        Artist a = new Artist("Винсент", "Ван Гог");
        Artist b = new Artist("Винсент", MainStyle.IMPRESSIONISM);
        Artist c = new Artist("Винсент", "Ван Гог", MainStyle.IMPRESSIONISM);
        a.printInfo();
        b.printInfo();
        c.printInfo();

    }

}

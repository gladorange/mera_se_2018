package los.task1;

public class Main {
    public static void main(String args[])
    {
        Painter michelangelo = new Painter ("Michelangelo", "Leonardo", 1475);
        Painter ivan = new Painter ("Ivan", "Aivazovsky");
        Painter rembrandt = new Painter ("Rembrandt", Painter.STYLE.REALISM);
        Painter pablo = new Painter ("Pablo", "Picasso", Painter.STYLE.CUBISM);

        michelangelo.printInfo();
        ivan.printInfo();
        rembrandt.printInfo();
        pablo.printInfo();
    }

}

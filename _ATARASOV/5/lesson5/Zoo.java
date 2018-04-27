package lesson5;

public class Zoo {

    Animal[] animals = new Animal[6];

    public static void main(String[] args) {
        Zoo z = new Zoo();

        z.animals[0] = new Zebra("Олень");
        z.animals[1] = new Fish("Немо");
        z.animals[2] = new Fish("Золотая рыбка");
        z.animals[3] = new Fish("Дори");
        z.animals[4] = new Wolf("Акелла");
        z.animals[5] = new Dog("Шарик");

        for (Animal animal : z.animals) {
            animal.walk();
            if (animal instanceof WildAnimal) {
                WildAnimal wild = (WildAnimal) animal;
                wild.eatSomebody("Кролики");
            }

            if (animal instanceof VeganAnimal) {
                VeganAnimal vaganAnimal = (VeganAnimal) animal;
                vaganAnimal.eatGrass("Сено");
            }

        }

    }

    enum Answers {
        NO, YES, LATER, SOON, NEVER;

        Answers ask() {
            int prob = (int) (100 * Math.random() * 100);
            if (prob < 30)
                return NO;
            else if (prob < 60)
                return YES;
            else if (prob < 75)
                return LATER;
            else if (prob < 98)
                return SOON;
            else
                return NEVER;
        }

}

}

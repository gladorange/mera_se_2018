package anoshkin.home8;

import anoshkin.home9.AnimalHeader;

@AnimalHeader(description = "Собака бывает кусачей только от жизни собачей",
              parameterField = "громкость")
public class Dog extends Animal {
    private Integer loud = 0;

    public Dog(String name, int loud){
        super(name);
        this.loud = loud;
    }

    @Override
    public void sayHello() {
        if ((loud > 5)) {
            System.out.println("Гав, я собака громко лаю");
        } else {
            System.out.println("Гав");
        }
    }

    public Integer getLoud(){
        return loud;
    }
}
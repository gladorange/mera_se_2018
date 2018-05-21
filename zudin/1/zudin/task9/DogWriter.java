package zudin.task9;

public class DogWriter extends AnimalWriter<Dog> {

    @Override
    public String getAnimalDescription() {

        return "Собака бывает кусачей только от жизни собачей";
    }
}

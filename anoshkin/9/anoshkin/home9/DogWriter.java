package anoshkin.home9;

import anoshkin.home8.Dog;


public class DogWriter extends AnimalWriter<Dog> {
    @Override
    public String[] getAnimalDescription(Dog dog) {
        String [] out = new String[2];
        out[0] = dog.getName();
        out[1] = Integer.toString(dog.getLoud());
        return out;
    }
}

package src;

public class CatWriter extends AnimalWriter<Cat>  {

    @Override
    String getAnimalDescription() {
        return "miau miau";
    }
}

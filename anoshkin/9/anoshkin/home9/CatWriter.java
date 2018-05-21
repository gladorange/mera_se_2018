package anoshkin.home9;

import anoshkin.home8.Cat;

import javax.xml.ws.Action;

public class CatWriter extends AnimalWriter<Cat> {

    @Override
    public String[] getAnimalDescription(Cat cat) {
        String [] out = new String[2];
        out[0] = cat.getName();
        out[1] = Integer.toString(cat.getLength());
        return out;
    }
}

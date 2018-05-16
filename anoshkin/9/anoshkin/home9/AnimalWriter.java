package anoshkin.home9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public abstract class  AnimalWriter <ANIMAL> {
    public void writeAll(Collection<ANIMAL> animals) throws IOException {

        if (animals.size() > 0) {
            Iterator<ANIMAL> anIt = animals.iterator();
            ANIMAL animal = anIt.next();
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("anoshkin\\" + animal.getClass().getSimpleName() + ".json"));
            String outString = "{\n";
            Class<?> clazz = animal.getClass();
            AnimalHeader ah = clazz.getAnnotation(AnimalHeader.class);
            String nameField = "Name";
            String valueField = "Value";
            if(ah != null){
                outString += ah.typeField() + ": \"" + ah.typeName() + "\",\n";
                outString += ah.descriptionField() + ": \"" + ah.description() + "\",\n";
                nameField = ah.nameField();
                valueField = ah.parameterField();
            }
            outString += "list:[\n";
            do{
                String[] descr = getAnimalDescription(animal);
                outString += "\t{" + nameField  + ":\"" + descr[0] + "\"," +
                                     valueField + ":\"" + descr[1] + "\"}";
                if(anIt.hasNext()){
                    animal = anIt.next();
                    outString += ",\n";
                }
                else {
                    outString += "\n\t]";
                    break;
                }
            } while (true);
            outString += "\n}";
            out.write(outString);
            out.flush();
            out.close();
        }
    }

    public abstract String[] getAnimalDescription(ANIMAL animal);
}

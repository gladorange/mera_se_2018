package zudin.task9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

public abstract class AnimalWriter <ANIMAL extends Animal> {

    public abstract String getAnimalDescription();

    public void writeAll(Collection<ANIMAL> animals) throws IOException {

        // get current type
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        Class animalClass = (Class<ANIMAL>) pt.getActualTypeArguments()[0];
        String fileName = animalClass.getName().substring(12) + ".json";

        File file = new File(fileName);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        bw.write("{\nanimal: \"" + animalClass.getName().substring(12) + "\"\n");
        bw.write("description: \"" + getAnimalDescription() +  "\"\nlist : [\n");
           for (ANIMAL animal : animals) {
               bw.write("\t\t{name:\"" + animal.getName() + "\", " + animal.getParameter() +"\"},\n");
           }
            bw.append("\t]\n}");
            bw.close();
    }
}


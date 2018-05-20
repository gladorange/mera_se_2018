package src;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;


public abstract class AnimalWriter <ANIMAL extends Animal> {
    abstract String getAnimalDescription();

    void writeAll(Collection<ANIMAL> animals) {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        Class animalClass = (Class<ANIMAL>) pt.getActualTypeArguments()[0];
        String name = animalClass.getSimpleName();

        String filename = name + ".json";
        try (FileWriter writer = new FileWriter(filename, false)) {
            writer.write("{\n");
            writer.append("\t\"Animal\" : \"" + name + "\",\n");
            writer.append("\t\"Description\" : \"" + getAnimalDescription() + "\",\n");
            writer.append("\t\"list\" : [\n");
            for (ANIMAL a : animals) {
                writer.append(String.format("\t\t{\"Name\" : \"%s\",\n", a.name));
                writer.append(String.format("\t\t%s},\n", a.getParameter()));

            }
            writer.append("\t]\n");
            writer.append("}");
            writer.close();
            System.out.println(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package los.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

public abstract class AnimalWriter<TYPE extends Animal>
{
    private Collection<TYPE> ANIMAL;
    static final int FIRST_ELEMENT = 0;

    public void setANIMAL(Collection<TYPE> ANIMAL)
    {
        this.ANIMAL = ANIMAL;
    }

    public String getAnimalClassName()
    {
        return getAnimalType().getSimpleName();
    }

    public String getAnimalDescription()
    {
        AnimalDescription animalDescription = (AnimalDescription)getAnimalType().getAnnotation(AnimalDescription.class);
        return animalDescription.value();
    }

    public void writeAll(BufferedWriter bufferedWriter) throws IOException
    {
        if(null != ANIMAL)
        {
            bufferedWriter.write(String.format("{%n animal:\"%s\",%n description:\"%s\",%n list:[%n",
                    getAnimalClassName(),
                    getAnimalDescription()));
            for(TYPE animal:ANIMAL)
            {
                bufferedWriter.write(String.format("  {name:\"%s\",",animal.getName()));
                writingStrings(animal,bufferedWriter);
            }
            bufferedWriter.write(String.format(" ]%n}"));
        }
    }

    protected abstract void writingStrings(TYPE a, BufferedWriter w) throws IOException;

    protected Class getAnimalType()
    {
        Type type = this.getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) type;
        return (Class<TYPE>)parameterizedType.getActualTypeArguments()[FIRST_ELEMENT];
    }
}

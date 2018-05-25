package los.task1;

import java.io.BufferedWriter;
import java.io.IOException;

public class DogWriter extends AnimalWriter<Dog>
{
    @Override
    protected void writingStrings(Dog dog, BufferedWriter bufferedWriter) throws IOException
    {
        bufferedWriter.write(String.format("громкостьЛая:\"%d\"},%n", dog.getBarkingVolume()));
    }
}
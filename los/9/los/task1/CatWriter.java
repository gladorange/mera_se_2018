package los.task1;

import java.io.BufferedWriter;
import java.io.IOException;

public class CatWriter extends AnimalWriter<Cat>
{
    @Override
    protected void writingStrings(Cat cat, BufferedWriter bufferedWriter) throws IOException
    {
        bufferedWriter.write(String.format("длинаУсов:\"%d\"},%n",cat.getLengthMustacge()));
    }
}

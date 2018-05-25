package los.task1;

import java.io.BufferedWriter;
import java.io.IOException;

public class ZebraWriter  extends AnimalWriter<Zebra>
{
    @Override
    protected void writingStrings(Zebra zebra, BufferedWriter bufferedWriter) throws IOException
    {
        bufferedWriter.write(String.format("числоПолос:\"%d\"},%n", zebra.getNumberStrips()));
    }
}
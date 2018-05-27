package los.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class ReaderFilesWritingToCollections {
    private BufferedReader inputReader;
    Collection<String> stringArrayList;

    public ReaderFilesWritingToCollections(String fileName) throws FileNotFoundException
    {
        inputReader = new BufferedReader(new FileReader(fileName));
        stringArrayList = new ArrayList<>();
    }

    public ReaderFilesWritingToCollections()
    {
        inputReader = null;
        stringArrayList = null;
    }

    public void setInputReader(BufferedReader inputReader) {
        this.inputReader = inputReader;
    }

    public void setStringArrayList(Collection<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

    public Collection<String> getStringArrayList() {
        return stringArrayList;
    }

    public boolean readFile()
    {
        try {
            String lineFromFile = this.inputReader.readLine();
            while (null != lineFromFile)
            {
                this.stringArrayList.add(lineFromFile);
                lineFromFile = this.inputReader.readLine();
            }
        }
        catch (IOException ex)
        {
            return false;
        }

        return true;
    }
}


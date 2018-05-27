package los.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;


public class ReaderFilesWritingToCollections {
    private BufferedReader inputReader;
    // а почему коллекция не приватная?
    Collection<String> stringArrayList;

    public ReaderFilesWritingToCollections(String fileName) throws FileNotFoundException
    {
        inputReader = new BufferedReader(new FileReader(fileName));
        // можно было бы инициализировать сразу вместе с объялвнием
        //Collection<String> stringArrayList = new ArrayList<>();

        stringArrayList = new ArrayList<>();
    }

    public ReaderFilesWritingToCollections()
    {
        // зачем такой конструктор?
        inputReader = null;
        stringArrayList = null;
    }

    // не думаю, что здесь есть польза от сеттеров, т.к. классы одноразовые по сути. Указал файл - прочитал. Что-то дополнительное после этого выставлять особо смысла нет.

    public void setInputReader(BufferedReader inputReader) {
        this.inputReader = inputReader;
    }

    public void setStringArrayList(Collection<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

    public Collection<String> getStringArrayList() {
        return stringArrayList;
    }

    // метод возвращает boolean, но он нигде не используется.
    public boolean readFile()
    {
        try {
            // можно было бы использовать цикл do {} while ()
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


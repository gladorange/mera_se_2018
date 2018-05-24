package zudin.task11;

import java.io.*;
import java.util.ArrayList;

public class MyFileReader {

    ArrayList<String> strings;

    public MyFileReader (){
        strings = new ArrayList<>();
    }

    public void readFile(File file) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            strings.add(line);
        }
        in.close();

    }

    public void readWithCheck(File file){

        long before = System.nanoTime();
        try {
            readFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long time = System.nanoTime() - before;
        System.out.printf("%s time for reading : %d\n", file.getName(),time);
    }
}


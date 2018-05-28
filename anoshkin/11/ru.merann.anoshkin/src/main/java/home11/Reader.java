package ru.merann.anoshkin.src.main.java.home11;

import java.io.*;
import java.util.List;

public class Reader{

    public static int read(List<String> buffer, String file) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(file)));
        String line;
        int lines = 0;
        while((line = br.readLine()) != null){
            lines ++;
            buffer.add(line);
        }
        return lines;
    }

}

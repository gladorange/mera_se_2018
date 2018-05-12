package atarasov;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class lesson8_io {

    public static void main(String[] args)  {

        try (FileWriter str = new FileWriter("SomeFIle.txt")) {
            str.write("а");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

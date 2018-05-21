package src;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;


public class Reader {
        private BufferedReader in;
        Collection<String> lines= new ArrayList<>();
        String file;

    public Reader(String filename) throws Throwable {
            URL url = getClass().getResource(filename);
            File file = new File(url.getPath());
            this.file = filename;
            in = new BufferedReader(new FileReader(file));
            in.mark((int)file.length());
    }

        public void refresh() throws Throwable {
            lines.clear();
            in.reset();
        }

        public void read() {
            try {
                String line = in.readLine();
                while (line != null) {
                    lines.add(line);
                    line = in.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            System.out.println(file + " Lines: " + lines.size());
        }
}

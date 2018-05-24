package zudin.task11;

import java.io.File;

public class Main11 {
    public static void main(String[] args) {

        File file1 = new File("/home/eugene/mera_se_2018/zudin/1/zudin/task11/Holmes6.txt");
        File file2 = new File("/home/eugene/mera_se_2018/zudin/1/zudin/task11/Holmes3.txt");
        File file3 = new File("/home/eugene/mera_se_2018/zudin/1/zudin/task11/page2.txt");

        MyFileReader r = new MyFileReader();

        r.readWithCheck(file1);
        r.readWithCheck(file2);
        r.readWithCheck(file3);

        System.out.println("Total strings: " + r.strings.size());
        r.strings.clear();

        Thread thread1 = new Thread(new MyThread(r, file1));
        Thread thread2 = new Thread(new MyThread(r, file2));
        Thread thread3 = new Thread(new MyThread(r, file3));

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total strings: " + r.strings.size());

    }
}
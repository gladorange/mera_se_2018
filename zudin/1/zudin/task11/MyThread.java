package zudin.task11;

import java.io.File;

public class MyThread implements Runnable {

    private final MyFileReader mfr;
    private final File file;


    MyThread(MyFileReader mfr, File file) {
        this.mfr = mfr;
        this.file = file;
    }

    @Override
    public void run() {
        System.out.println("this is " + Thread.currentThread().getName());
        synchronized (file) {
            mfr.readWithCheck(file);
        }
    }
}

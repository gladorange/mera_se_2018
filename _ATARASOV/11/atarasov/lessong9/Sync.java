package atarasov.lessong9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Sync {

    final static ReentrantLock lock = new ReentrantLock();

    public synchronized static void main(String[] args) {
        List<String> list = new ArrayList<>();
        ListWriter wr = new ListWriter(list);
        ListReader lr = new ListReader(list);

        new Thread(wr).start();
        new Thread(lr).start();
    }

    public static class ListWriter implements Runnable {
        final List<String> listToWrite;

        public ListWriter(List<String> listToWrite) {
            this.listToWrite = listToWrite;
        }

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 50_000; i++) {
                    listToWrite.add(String.valueOf(i));
                }
            }
        }
    }

    public static class ListReader implements Runnable {
        final List<String> listToRead;

         public ListReader(List<String> listToRead) {
            this.listToRead = listToRead;
        }

        @Override
        synchronized public void run() {
            synchronized (lock) {
                for (String s : listToRead) {
                    System.out.println(s);
                }
            }
        }
    }
}

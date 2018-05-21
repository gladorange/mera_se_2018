package atarasov.lessong9;


public class ProdConsumer {

    final static Object monitor = new Object();
    static  String str = "";

    public static void main(String[] args) {

        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }

    public static class Producer implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (monitor) {
                    int v = (int) (Math.random() * 10);
                    if (v == 9) {
                        monitor.notify();
                    } else {
                        str += v;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static class Consumer implements Runnable {


        @Override
        synchronized public void run() {
            while (true) {
                synchronized (monitor) {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(str);
                }
            }
        }
    }
}

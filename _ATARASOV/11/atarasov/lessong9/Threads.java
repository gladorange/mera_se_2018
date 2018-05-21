package atarasov.lessong9;

public class Threads {

    public static void main(String s[]) throws InterruptedException {

        Thread a = new Thread(new ThreadTest("a"));
        a.start();

      /*  new Thread(new ThreadTest("b")).start();
        new Thread(new ThreadTest("c")).start();*/
        Thread.sleep(1000);
        a.interrupt();
        a.join();

        System.out.println("End main");
    }

    static class ThreadTest implements Runnable {
        final String name;

        ThreadTest(String name) {
            this.name = name;
        }

        public void run() {
            System.out.println("Starting");
            int i = 0;
            while (i < 100) {
                //Thread.currentThread().isInterrupted();
                if (Thread.interrupted()) {
                    break;
                }
                System.out.println(i++);

            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Кто-то нас прервал");
            }
            while (i > 0) {
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
                System.out.println(i--);

            }

            System.out.println("end" + name);

        }
    }
}

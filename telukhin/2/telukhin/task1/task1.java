package telukhin.task1;

public class task1 {

    public static void main(String[] args) {
        doSomething(-6L, 6L);
        System.out.println();

    }

    public static boolean evenCheck(long number) {
        return number % 2 == 0;
    }

    public static boolean aboveZero(long number) {
        return number > 0;
    }

    public static void doSomething(long i, long j) {
        if (evenCheck(i)) {
            System.out.println((long) i + j);
        }
        if (evenCheck(j)) {
            System.out.println((long) i - j);
        }
        if (aboveZero(i)) {
            System.out.println((long) i * j);
        }
        if (aboveZero(j)) {
            System.out.println((float) i / (float) j);
        }
    }


}

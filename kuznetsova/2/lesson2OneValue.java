
public class lesson2OneValue {
    public static void main (String[] args) {
        int value1 = 9;
        int sum = 0;

        for ( int i=1 ; i <= value1; i++) {
            System.out.println(i);
            i++;
        }
        for ( int i=0 ; i <= value1; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}

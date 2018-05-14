package los.task1;

public class operationsWithNumbers
{
	public static void main(String[] args) {
		long long_1 = 9124234, long_2 = 867454;
		
		if ((long_1 & 1) == 0) {
			System.out.println("Sum of two numbers " + (long_1 + long_2));
		}
		if ((long_2 & 1) == 0) {
			System.out.println("Difference of two numbers " + (long_1 - long_2));
		}
		if (long_1 > 0) {
			System.out.println("Multiplication of two numbers " + (long_1 * long_2));
		}
		if (long_2 > 0) {
			System.out.println("Division of two numbers " + (long_1 / long_2));
		}
	}
}
package los.task2;

public class oddNumbers
{
	public static void main(String[] args) {
		int Mylong = 96;
		long sumEvenNumbers = 0;
		
		System.out.println("Odd numbers: ");
		for(int i = 1; i <= Mylong; i++) 
		{	
			if ((i & 1) == 0) {
				sumEvenNumbers += i;		
			}
			else {
				System.out.print(i + " ");	
			}	
		}
			
		System.out.println("\n" + "Sum of even numbers: " + sumEvenNumbers);		
	}
}
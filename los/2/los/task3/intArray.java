package los.task3;

public class intArray
{
	public static void main(String[] args) 
	{
		long MaxElement = 100;
		int[] int_array = new int [] {1,5,10,2,-1,-3,3,11,3,-2};
		int index_max_value = 0, i = 0;
		int max_value = int_array[i];		
		
		for(; i <= int_array.length - 1; i++) 
		{	
			if (int_array[i] > MaxElement)
			{
			System.out.println("Element more than 100: " + int_array[i] );		
			break;	
			}	
			
			if (max_value < int_array[i]) 
			{
				max_value = int_array[i];
				index_max_value = i;		
			}
		}
		
		if (i > 0)
		{			
			System.out.println("Max value with index: " + index_max_value );		
		}
		else 
		{
			System.out.println("First element more than: " + MaxElement);
		}					
	}
}
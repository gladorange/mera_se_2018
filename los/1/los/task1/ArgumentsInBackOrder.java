// This application returns arguments in back order
package los.task1;

public class ArgumentsInBackOrder
{
	public static void main(String[] args) {
		if (args.length == 0)
        {
            System.out.println("There were no command line arguments passed!");
        }
        else {
            System.out.println("Arguments in back order: ");
		    for(int i = args.length -1; i >= 0; i--)
		    {	        
		        System.out.print(args[i] + " ");
		    }
        }
	}
}
import java.util.Scanner;
public class NumberTester
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num;

		System.out.print("Enter an integer: ");
		num = scan.nextInt();

		if (num<0)
		{                                
			System.out.println("The number " + num + " is negative.");                     //true branch		
			System.out.println("Negative numbers are less than zero.");		      //true branch
		}
		else
		{	
			System.out.println(" The number " + num +
				" is zero or positive.");
			System.out.print  ("Positive numbers are greater ");         // false-branch
     			System.out.println("than zero. ");   		     		
		}

		System.out.println("Good-bye for now");					// always executed

	}
}

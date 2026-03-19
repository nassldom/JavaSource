import java.util.Scanner;

// Add up integers entered by the user
// After the last integer, the user enters a 0

public class AddUpNumbers
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int value;				// data entered by the user
		int sum = 0;				// initialize the sum
// get the first value
		System.out.print("Enter first integer (enter 0 to quit): ");
		value = scan.nextInt();

		while (value != 0)
		{
// add value to sum
			sum = sum + value;
// get the next value from the user
			System.out.println("Enter next integer (enter 0 to quit): ");
			value = scan.nextInt();
		}
		System.out.println("Sum of the integers: " + sum);

		scan.close();
	}
}
			
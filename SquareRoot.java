import java.util.Scanner;

public class SquareRoot
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double value;

		// read in a double
		System.out.print("Enter a double:");
		value = scan.nextDouble();

		// calculate its square root
		double result = Math.sqrt(value);

		// Write out the result
		System.out.println("square root: " + result);

		scan.close();
	}
}

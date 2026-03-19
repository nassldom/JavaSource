import java.util.Scanner;
public class SquareRootThree
{
	public static void main(String[] args)
	{
		final double smallValue = 1.0E-14;
		double N;					// the user enters N
		double guess = 1.00;				// the same first guess works for any N

// get the number from the user

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		N = scan.nextDouble();

		if (N >= 0.0)
		{
			while (Math.abs(N/(guess*guess) - 1.0) > smallValue)
			{
				guess = N/(2*guess) + guess/2;  // calculate a new guess
			}
			System.out.println("The square root of " + N + " is " + guess);
		}
		else
		{
			System.out.println("Please enter a positive number");
		}

		scan.close();
	}
}
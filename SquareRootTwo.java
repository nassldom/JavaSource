public class  SquareRootTwo
{

	public static void main( String[] args ) 
	{
		final double smallValue = 1.0E-14;
		double N = 3.00;
		double guess = 1.00;

		while (Math.abs(N/(guess*guess) - 1.0) > smallValue)
		{

// calculate a new value for the guess

			guess = N/(2*guess) + guess/2;
		}

		System.out.println("The square root of " + N + " is " + guess);
	}
}
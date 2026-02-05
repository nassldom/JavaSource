public class HarmonicTester
{
	public static void main (String[] args)
	{
		int term=1, lastTerm = 6;
		double sum = 0.0;

		while (term <= lastTerm)
		{
			sum += 1.0/term;				// add the next term to sum
			term++;						// increment term
		}

		System.out.println("Sum of 6 terms:" + sum);
	}
}
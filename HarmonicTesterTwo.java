import java.util.Scanner;

public class HarmonicTesterTwo
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How many Terms? ");
		int limit = scan.nextInt();

		int term = 1;
		double sum = 0.0;

		while (term <= limit)
		{
			sum += 1.0/term;			// add the next term to sum
			term++;					// increment term
		}

		System.out.println("Sum of " + limit + " terms:" + sum);

		scan.close();
	}
}
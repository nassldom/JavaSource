// IRS Weigh-in
// Income between $24000 and $58150 inclusive

import java.util.Scanner;
public class TaxGouge
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int income;

// get the income
		
		System.out.println("What is your income?");
		income = scan.nextInt();

// check that the income is within range for the 28% bracket

		if (income >= 24000 && income <= 58150)
			System.out.println("In the 28% bracket.");
		else
			System.out.println("Time for a tax audit!");

		scan.close();
	}
}
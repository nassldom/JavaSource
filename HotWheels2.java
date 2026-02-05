import java.util.Scanner;

public class HotWheels2
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String inData;
		int cash, credit, debt;

// get the cash

		System.out.println("How much cash?");
		cash = scan.nextInt();

// get the credit line

		System.out.println("How much credit do you have?");
		credit = scan.nextInt();

// determine the debts

		System.out.println("How much do you owe?");
		debt = scan.nextInt();

// check that at least one qualification is met

		if (cash >= 25000 || (credit >= 25000 && debt < 1000))
			System.out.println("Enough to buy this car!");		
		else
			System.out.println("Have you considered a Yugo?");
	}
}
import java.util.Scanner ;
public class CarPurchase
{
	public static void main (String[] args) 
	{
		final int basePrice = 200000;			// base price in dollars
		final int pinPrice = 250;			// pin stripe price
		final int brakePrice = 800;			// anti-lock brake price

		Scanner scan = new Scanner(System.in);

		int answer;
		int totalCoast = basePrice;

		System.out.print("Do you want pin stripes (0 or 1)? ");

		answer = scan.nextInt();
		if (answer==1)
		{
			totalCoast = totalCoast + pinPrice;	
		}
		
		System.out.print("Do you want anti-lock brakes (0 or 1)? ");
		answer = scan.nextInt();
		if (answer==1)
		{
			totalCoast = totalCoast + brakePrice;
		}

		System.out.println("Total cost is: $" + totalCoast);
	}
}


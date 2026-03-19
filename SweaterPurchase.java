import java.util.Scanner ;
public class SweaterPurchase
{
	public static void main (String[] args) 
	{
		final int price = 4495;  					// price in cents
		Scanner scan = new Scanner(System.in);
		int cash;
		
		System.out.println("How much do you have, in pennies?");
		cash = scan.nextInt();

		if(cash<price)
		{
			System.out.println("You can´t buy the sweater.");
			System.out.println("You need " + (price-cash) + " more cents.");
		}
		else
			System.out.println("You can buy the sweater.");

		scan.close();
	}	
}

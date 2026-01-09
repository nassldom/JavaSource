import java.util.Scanner;

public class RestaurantBill
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double basicCost;

		System.out.print("Enter the basic cost: ");
		basicCost = scan.nextDouble();

		System.out.println("basic cost: " + basicCost + " total cost: " +
			(basicCost + basicCost*0.06 + basicCost*0.20) );				// 20% tip and 6% taxes
	}
}
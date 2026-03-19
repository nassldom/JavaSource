import java.util.Scanner;

public class RestaurantBillImproved
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double basicCost;
		double tipPercent;

		System.out.print("Enter the basic cost: ");
		basicCost = scan.nextDouble();
		System.out.print("Enter the tip percentage: ");
		tipPercent = scan.nextDouble();

		System.out.println("basic cost: " + basicCost + " total cost: " +
			(basicCost + basicCost*0.06 + basicCost*tipPercent) );				// 20% tip and 6% taxes

		scan.close();
	}
}
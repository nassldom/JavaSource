import java.util.Scanner;

// Add up integers entered by the user
// After the last integer, the user enters a 0

public class AddUpNumbersTwo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String suffix;
		int value;
		int count = 0;
		int sum = 0;

		System.out.println("Enter first integer (enter 0 to quit): ");
		value = scan.nextInt();

		while (value != 0)
		{
			sum = sum + value;
			count = count + 1;

			if (count + 1 == 2)
				suffix = "nd";
			else
				if (count + 1 == 3)
					suffix = "rd";
				else
					suffix = "th";
			System.out.println("Enter the " + (count+1) + suffix +
					   "integer (enter 0 to quit): ");
			value = scan.nextInt();
		}
		System.out.println("Sum of the integers: " + sum);
	}
}
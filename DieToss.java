import java.util.Scanner;
import java.util.Random;

public class DieToss
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		while (true)
		{
			System.out.print("You toss a " + (rand.nextInt(6)+1));
			String line = scan.nextLine();
		}
	}
}
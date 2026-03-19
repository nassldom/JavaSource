import java.util.Scanner;

public class EvalPoly
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		
		String response = "y";			// "y" or "n"

		while (response.equals("y"))
		{
			// Get a value for x
			// Evaluate the polynomial
			// print out the result
			// Ask the user if the program should continue
			// the user´s answer is "response"

			System.out.println("continue (y or n)?: ");

			response = scan.next();

			scan.close();
		}
	}
}
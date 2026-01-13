import java.util.*;

public class PasswordGenerator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int digits = 0;

// Ensure that the password is 5 or more characters

		while (digits < 5)
		{
			System.out.println("Your password must have at least 5 characters.");
			System.out.print("How many characters do you want in your password? ");
			digits = scan.nextInt();
		}

// create a long string of characters to randomly pick from

		String choices = "abcdefghijklmnopqrstuvwxyz";
		choices = choices + choices.toUpperCase();
		choices = choices + "1234567890";

		String password = "";
		int j = 0;

// Randomly pick characters from the string

		while (j<digits)
		{
			password = password + choices.charAt(rand.nextInt(choices.length()));
			j = j + 1;
		}
		System.out.println("Here is your password: " + password);
	}
}
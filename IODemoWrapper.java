import java.text.*;

public class IODemoWrapper
{
	public static void main (String[] args)
	{
		Integer i = 7654321;            // Create an Integer thru autoboxing
		Double d = 11000.0008;		// Create a Double thru autoboxing

		DecimalFormat numform = new DecimalFormat();
		System.out.println("integer = " + numform.format(i) + "\n double = " + numform.format(d));
	}
}

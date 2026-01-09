import java.text.*;
import java.util.Locale;

public class IODemoGermany
{
	public static void main (String[] args)
	{
		int i = 7654321;
		double d = 11000.0008;

		Locale.setDefault(Locale.GERMANY);
		DecimalFormat numform = new DecimalFormat();

		System.out.println("Default Locale = " + Locale.getDefault());
		System.out.println("integer = " + numform.format(i) + " double = " + numform.format(d));
	}
}

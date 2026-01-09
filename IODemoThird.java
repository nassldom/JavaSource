import java.text.*;

public class IODemoThird
{
	public static void main (String[] args)
	{
		DecimalFormat numform = new DecimalFormat("0.000000");
		System.out.println("Third = " + numform.format(1.0/3.0));
	}
}

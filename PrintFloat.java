import java.lang.Math;

public class PrintFloat
{
	public static void main (String[] args)
	{
		System.out.printf("PI = %8.2f%n", Math.PI);	// 8 places, 2 for precision
		System.out.printf("PI = %8.4f%n", Math.PI);	// 8 places, 4 for precision
		System.out.printf("PI = %8.6f%n", Math.PI);	// 8 places, 6 for precision
		System.out.printf("PI = %f%n", Math.PI);	// default
	}
}

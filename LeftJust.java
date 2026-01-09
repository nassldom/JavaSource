public class LeftJust
{
	public static void main (String[] args)
	{
		double x = 12.34, y = -6.95, z = 1024;
		System.out.printf("x:%8.3f, y:%8.3f, z:%8.3f%n", x, y, z); // default right justification
		System.out.printf("x:%-8.3f, y:%-8.3f, z:%-8.3f%n%n", x, y, z); // left justification
		
		int a = 12, b = 12345, c = -1234567;
		System.out.printf("a:%10d; b:%10d; c:%10d%n", a, b, c);    // default right justification
	}
}

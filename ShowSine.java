public class ShowSine
{
	public static void main (String[] args)
	{
		Double angle = 0.5; // angle in radians (auto boxed)
		double sine = Math.sin(angle); // compute sine of the angle

		System.out.println("sine of: " + angle + " is " + sine);
	}
}
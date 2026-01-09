public class HelloPlanets
{
	public static void main (String[] args)
	{
		String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter",
				    "Saturn", "Uranus", "Neptune", "Pluto"};

            for (String planet : planets) {
                System.out.println("Hello " + planet + "!");
            }
	}
}	
class HelloObject
{
	public void speak()
	{
		System.out.println("Hello from an object!");
	}
}

public class HelloTester
{
	public static void main( String[] args )
	{
		HelloObject anObject = new HelloObject();
		anObject.speak();
	}
}	
   
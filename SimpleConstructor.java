class HelloObject                                           // 2a. class definition is used to make the object
{
    private String greeting;

    public HelloObject(String greeting)
    {
        this.greeting = greeting;
    }
    public void speak()                                     // 2b. A speak() method is included in the object
    {
        System.out.println(greeting);                       // 3a. The speak() method of the object prints a message on the screen
    }
}
public class SimpleConstructor
{
    public static void main(String[] args)                                  // 1. Main starts running
    {
       HelloObject anObject = new HelloObject("A Greeting!");     // 2. A HelloObject is created using its default constructor
       anObject.speak();                                                   // 3. The object´s speak() method is called
    }
}                                                                          // 4. Entire program finished
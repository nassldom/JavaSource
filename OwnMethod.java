public class OwnMethod 
{
    public static void main( String [] args )
    {
        String name = "Spongebob";
        int age = 30;

        happyBirthday( name, age );
    }
    static void happyBirthday( String name, int age )
    {
        System.out.println( "Happy Birthday to you!" );
        System.out.printf( "Happy Birthday dear %s!\n", name );
        System.out.printf( "You are now %d years old!\n", age );
        System.out.println( "Happy Birthday to you!\n" );
    }
    
}

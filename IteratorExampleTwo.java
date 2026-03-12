import java.util.* ;
public class IteratorExampleTwo
{
  public static void main ( String[] args)
  {
    ArrayList<String> names = new ArrayList<String>();

    names.add( "Amy" );    names.add( "Bob" ); 
    names.add( "Chris" );  names.add( "Deb" ); 
    names.add( "Elaine" ); names.add( "Frank" );
    names.add( "Gail" );   names.add( "Hal" );
    
    for ( String nm : names ) 
      System.out.println( nm );
  }
}
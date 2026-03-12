import java.util.* ;
public class IteratorExample
{
  public static void main ( String[] args)
  {
    // Create and populate the list
    ArrayList<String> names = new ArrayList<String>();
    names.add( "Amy" );    names.add( "Bob" ); 
    names.add( "Chris" );  names.add( "Deb" ); 
    names.add( "Elaine" ); names.add( "Frank" );
    names.add( "Gail" );   names.add( "Hal" );

    // Create an iterator for the list
    Iterator<String> iter = names.iterator();

    // Use the iterator to visit each element
    while ( iter.hasNext() )
      System.out.println( iter.next() );
  }
}

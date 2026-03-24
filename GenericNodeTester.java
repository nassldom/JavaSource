public class GenericNodeTester
{
  public static void main (String args[])
  {
    Bird robin = new Bird("Turdus", "migratoris", "Robin", 1 );
    GenericNode<Bird> node = new GenericNode<Bird>( robin );
    System.out.println("node: " + node );
    node.getValue().incSightings();    
    System.out.println("node: " + node );
  }
} 
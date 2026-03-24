// LinkedListTester2
//
import java.util.* ;

public class LinkedListTester2
{
  public static void main( String[] args )
  {
    LinkedList list = new LinkedList();
    Scanner scan = new Scanner( System.in );
    Random rand = new Random();
    
    System.out.print("How many nodes? ");
    int numNodes = scan.nextInt();
    for ( int j = 0; j<numNodes; j++ )
    {
      list.insertFirst( rand.nextInt(1001) );
    }
    list.traverse();  

    scan.close();
  }
}
import java.util.* ;

public class OrderedLinkedListTester
{
  public static void main( String[] args )
  {
    OrderedLinkedList list = new OrderedLinkedList();
    Scanner scan = new Scanner( System.in );
    Random rand = new Random();
    
    System.out.print("How many nodes? ");
    int numNodes = scan.nextInt();
    for ( int j = 0; j<numNodes; j++ )
    {
      list.insertInOrder( rand.nextInt(1001) );
    }

    scan.close();

  }
}
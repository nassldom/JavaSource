public class NodeTester
{
  public static void main ( String[] args )
  {
    Node node0 = new Node( 223 );  
    Node node1 = new Node( 493 );
    System.out.println("Node 0: " + node0 + ", Node 1: " + node1 );  
      
    node0.setNext( node1 );
    System.out.println("Node 0: " + node0 + ", Node 1: " + node0.getNext() );     
  }
}
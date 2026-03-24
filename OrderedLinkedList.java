public class OrderedLinkedList
{
  private Node headPtr = null;
  
  // The constructor creates an empty list
  public OrderedLinkedList()
  {
    headPtr = null;
  }
 
  // Determine if the List is empty
  public boolean isEmpty()
  {
     return headPtr == null;
  }
 
  // Clear the list
  public void clear()
  {
    headPtr = null;
  }
  
  // Insert one Node containing data  
  // into the list in ascending order
  public void insertInOrder( int data )
  {
    Node newNode = new Node( data );
    newNode.setNext( null );
    
    // CASE 1: insert into an empty list
    if ( headPtr==null )
    {
      headPtr = newNode;
      return;
    }
    
    // CASE 2: if data is less than current first
    else if ( data < headPtr.getValue() )
    {
      newNode.setNext( headPtr ); // current first becomes second
      headPtr = newNode;          // newNode becomes first 
      return;      
    }
    
    // CASE 3 and 4: data goes in a gap or at end of the list
    //               
    Node current = headPtr;      // initialize the pointers
    Node next = headPtr.getNext();

    // search for the end or a gap
    while ( next!=null && data > next.getValue() )
    {
      current = next;
      next = next.getNext();
    }

    // link in the new node        
    newNode.setNext( next );
    current.setNext( newNode );
  }
     
  
  // Traverse the list printing out each Node
  public void traverse()
  {
    Node current = headPtr;
    while ( current != null )
    {
      if ( current == headPtr )
        System.out.print( current );
      else
        System.out.print( ", " + current );
      
      current = current.getNext();
    }
  }

}
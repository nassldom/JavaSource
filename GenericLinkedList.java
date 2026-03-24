public class GenericLinkedList<E>
{
  private GenericNode<E> headPtr = null;
  
  // The constructor creates an empty list
  public GenericLinkedList()
  {
    headPtr = null;
  }
  
  // Determine if the List is empty
  public boolean isEmpty()
  {
     return headPtr == null;
  }
  
  // Delete the entire list
  //
  public void deleteList()
  {
    if ( headPtr != null ) 
    {    
      headPtr =null;
    }
  }   
  
  // Insert one GenericNode containing data at the head
  // of the list. 
  public void insertFirst( E data )
  {
    GenericNode<E> newFirst = new GenericNode<E>( data );
    newFirst.setNext( headPtr );
    headPtr = newFirst;
  }
  
  // Delete the first node of the list
  //
  public void deleteFirst()
  {
    if ( headPtr != null ) 
    {    
      headPtr = headPtr.getNext();  // headPtr now points at second node, or
                                    // is null if there was no second node.
    }
  }   
  
  // Traverse the list, printing each node
  public void traverse()
  {
    GenericNode<E> p = headPtr;
    while ( p != null )
    {
      System.out.print( p + " ");
      p = p.getNext();
    }
  }
  
  // get the first value in the list
  // or return null
  public E getFirst() 
  {
    if ( isEmpty() )
      return null;   
      
    return headPtr.getValue();
  }

  public String getLast() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getLast'");
  } 
  
} 
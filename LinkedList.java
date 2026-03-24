// LinkedList.java
//
public class LinkedList
{
   private Node headPtr = null;
  
  // The constructor creates an empty list
  public LinkedList()
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
  
  // Insert one Node containing data at the head
  // of the list. 
  public void insertFirst( int data )
  {
    Node newFirst = new Node( data );
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
    Node p = headPtr;
    while ( p != null )
    {
      System.out.print( p + ", " );
      p = p.getNext();
    }
  }
  
  // Insert a new last node into the list
  //
  public void insertLast( int data )
  {
    // create a new node
    Node newNode = new Node( data );
    
    // if list is empty
    if ( headPtr == null )
    {
      headPtr = newNode;
    }
    else
    {
      // search for the last node
      Node p = headPtr;
      while ( p.getNext() != null )   
        p = p.getNext();   
        
      // link new node after it
      p.setNext( newNode );
    }
                            
  }  
  
  // delete the last Node of the list
  public void deleteLast()
  {

    // if list is empty do nothing
    if ( headPtr == null )
    {
      return;
    }

    // if list has one node, unlink it
    if ( headPtr.getNext() == null )
    {
      headPtr = null;
      return;
    }

    // search for the next to last node
    Node p = headPtr;
    while ( p.getNext().getNext() != null )   
      p = p.getNext();   
      
    // unlink the last node
    p.setNext( null );
  }                    

  // get the value at indexof the list
  //
  int get( int index ) throws IndexOutOfBoundsException
  {
    if ( isEmpty() )
      throw new IndexOutOfBoundsException();   
      
    Node p = headPtr;
    int counter = 0;
    while ( counter<index && p != null )
    {      
      p = p.getNext();
      counter++ ;
    }
    if ( index==counter )
      return p.getValue();
    else
      throw new IndexOutOfBoundsException();   
  }               
}
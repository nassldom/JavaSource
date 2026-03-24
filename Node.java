public class Node
{
  private int  value;
  private Node next;
  
  public Node ( int val )
  {
    value = val;
    next = null;
  }
  
  public int  getValue() { return value; }
  public Node getNext()  { return next; }
  
  public void setValue( int val ) { value = val; }
  public void setNext( Node nxt ) { next = nxt; } 
  
  public String toString() { return "" + value ; }
}
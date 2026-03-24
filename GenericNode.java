public class GenericNode<E>
{
  private E value;
  private GenericNode<E> next;
  
  // Constructor
  public GenericNode( E val )
  {
    value = val;
    next = null;
  }
  
  public E getValue() { return value; }
  public GenericNode<E> getNext()  { return next; }
  
  public void setValue( E val ) { value = val; }
  public void setNext ( GenericNode<E> nxt ) { next = nxt; } 
  
  public String toString() { return "" + value; }
}
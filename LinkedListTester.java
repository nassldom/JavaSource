public class LinkedListTester
{
  public static void main( String[] args )
  {
     // create a linked list
     LinkedList list = new LinkedList();
     
     // insert some nodes
     list.insertFirst( 99 );
     list.insertFirst( 77 );
     list.insertFirst( 55 );
     list.insertFirst( 11 );
     
     // traverse the list
     list.traverse();
     System.out.println();
     
     list.insertLast( 5 );
     list.insertLast( 6 );
     list.insertLast( 7 );
     list.insertLast( 8 );

     // traverse the list
     list.traverse();
     System.out.println();
     
     // delete some nodes
     list.deleteFirst();
     list.deleteLast();

     // traverse the list
     list.traverse();
     System.out.println();
     
     // get some values
     System.out.println("value at 1: " + list.get(1) );
     System.out.println("value at 5: " + list.get(5) );
     System.out.println("value at 7: " + list.get(7) );
      
  }
}
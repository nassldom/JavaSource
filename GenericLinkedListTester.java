public class GenericLinkedListTester
{
  public static void main( String[] args )
  {
    // create an empty generic linked list
    GenericLinkedList<Bird> list = new GenericLinkedList<>(); 
    
    // insert some Birds
    Bird bird = new Bird("Turdus", "migratoris", "Robin", 1 );
    list.insertFirst( bird );
    bird = new Bird("Cyanocitta", "cristata", "Blue Jay", 1 );
    list.insertFirst( bird );
    bird = new Bird("Spinus", "tristis", "Goldfinch", 1 );
    list.insertFirst( bird );
  
    list.traverse();
    System.out.println("\n"); 
    
    // test getFirst()
    System.out.println("First: " + list.getFirst() );
    list.deleteFirst();
    list.traverse();
    System.out.println("\n"); 
    System.out.println("New First: " + list.getFirst() );
    
    // test increment
    bird = list.getFirst();
    bird.incSightings();
    list.traverse();
    System.out.println("\n"); 
    
    // test getLast()
    System.out.println("Last : " + list.getLast() );
 
  }
}
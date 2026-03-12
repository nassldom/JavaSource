public class StoreArray
{

  public static void main ( String[] args )
  {
    Goods[] inventory =  new Goods[10];
    inventory[0] = new Goods( "bubble bath", 1.40 );
    inventory[1] = new Food ( "ox tails", 4.45, 1500 );
    inventory[2] = new Book ( "Emma", 24.95, "Austen" );
    inventory[3] = new Toy  ( "Leggos", 54.45, 8 );

    System.out.println( inventory[0] );
    System.out.println( inventory[1] ); 
    System.out.println( inventory[2] );
    System.out.println( inventory[3] );
  }
}
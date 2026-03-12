public class Store
{
  public static void main ( String[] args )
  {
    Taxable item1 = new Book ( "Emma", 24.95, "Austen" );
    System.out.println( "Tax on item 1 "+ item1.calculateTax() );

    System.out.println( "Author: " + ((Book)item1).getAuthor() );
  }
}
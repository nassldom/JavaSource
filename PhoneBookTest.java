import java.util.* ;

class Entry
{
  private String name;
  private String number;

  // constructor
  public Entry( String n, String num )
  {
    name = n; number = num;
  }

  // methods
  public String getName()
  {
    return name ;
  }

  public String getNumber()
  {
    return number ;
  }

  public boolean equals( Object other )
  {
   
    System.out.print  ("    Compare " + other + " To " + this );
    System.out.println(" Result: " +  name.equals( ((Entry)other).name ) );
    return getName().equals( ((Entry)other).getName() );
  }

  public String toString()
  {
    return "Name: " + getName() + "; Number: " + getNumber() ;
  }
 
}

public class PhoneBookTest
{
  public static void main ( String[] args)
  {
    ArrayList<Entry> phone = new ArrayList<Entry>();

    phone.add( new Entry( "Amy", "123-4567") );
    phone.add( new Entry( "Bob", "123-6780") );
    phone.add( new Entry( "Hal", "789-1234") );
    phone.add( new Entry( "Deb", "789-4457") );
    phone.add( new Entry( "Zoe", "446-0210") );

    String name;
    Scanner scan = new Scanner( System.in );

    System.out.print("Enter name -->");
    name = scan.next();

    while( !name.equals("quit" ) )
    {
      int spot = phone.indexOf( new Entry( name, null ) ) ;

      if ( spot >= 0 )
        System.out.println( phone.get( spot ) ) ;
      else
        System.out.println( name + " not found" ) ;
      
      System.out.println();
      System.out.print("Enter name -->") ;
      name = scan.next();
    }
 
  }
}
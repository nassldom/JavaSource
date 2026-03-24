import java.util.*;

class Month
{
  // constants
  final int ERRORFLAG = 999;
 
  // instance variables
  private int   month;  // 1 == January
  private int   year;   // year as an int, eg 2017
  private int   daysInMonth;   // number of days in this month
  
  private int[] temp;
  private boolean[] valid; // true, if corresponding day holds data
  
  // constructors
  public Month( int month, int year)
  {
    this.month = month;
    this.year  = year;

    temp  = new int[ 32 ] ;
    valid = new boolean[ 32 ];    

    switch ( month )
    {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        daysInMonth = 31;
        break;
        
      case 4: case 6: case 9: case 11:
        daysInMonth = 30;
        break;
        
      case 2:
        if ( isLeapYear( year ) )
          daysInMonth = 29;
        else
          daysInMonth = 28;
        break;
          
      default :
        daysInMonth = 0;
     }    
  
  }
  
  public boolean isLeapYear( int year )
  {
    return ((year%4==0) && (year%100!=0)) || (year%400==0);
  }
  
  // Getters and Setters
  public int getTemp( int dayNumber )
  {
    if ( dayNumber > 0 && dayNumber <= daysInMonth && valid[dayNumber] )
      return temp[ dayNumber ];
    else
      return ERRORFLAG;
  }
   
  public boolean setTemp( int dayNumber, int tmp )
  {
    if ( dayNumber > 0 && dayNumber <= daysInMonth )
    {
      temp[dayNumber] = tmp;
      valid[dayNumber] = true;
      return true;
    }
    else
      return false;
  }
 
  
  public String toString()
  {
    String str = month + "/" + year + "\n";
    for ( int day = 1; day<=daysInMonth; day++ )
    {
      str += day + ": ";
      if ( valid[day] ) 
        str += temp[day] ;
      else
        str += "no data ";
      str += "\n";
    }
    return str;
  }

}

public class MonthTester
{
  public static void main( String[] args)  
  {
    Scanner scan = new Scanner( System.in );
    Month jan = new Month( 1, 2017 ) ;
    String line = "Y";
    
    // Fill Month with temperatures
    while ( line.toUpperCase().charAt(0) == 'Y' )
    {
      System.out.print("day?  ");
      int day = scan.nextInt();
      
      System.out.print("temp ? ");
      int temp = scan.nextInt();
      if ( !jan.setTemp(day, temp ) )
        System.out.println(" error in input ");
       
      System.out.print("Continue (Y/N)? ");
      line = scan.next();
    }

    System.out.println( jan );  
    
    scan.close();
  }
  
}
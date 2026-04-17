public class StringDemo4
{
  public static void main ( String[] args )
  {
    String str = new String( "Golf is a good walk spoiled." ); // create the original object

    String sub = str.substring(8); //create a new object from the original

    System.out.println( sub );

  }
}
/*
| substring(n) | Ausgabe                        | Erklärung           |
| ------------ | ------------------------------ | ------------------- |
| 0            | "Golf is a good walk spoiled." | Ganzer String       |
| 5            | "is a good walk spoiled."      | Nach "Golf "        |
| 8            | "a good walk spoiled."         | Nach "Golf is "     |
| 20           | "spoiled."                     | Ab "s" in "spoiled" |
| 30           | "" (leerer String)             | Über Länge hinaus   |
*/

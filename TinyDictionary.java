import java.util.Arrays;
import java.util.Scanner;

public class TinyDictionary 
{
    public static void main ( String[] args )
    {
        Entry[] wordList = new Entry[10];

        wordList[0] = new Entry( "WWW", "World Wide Web" );
        wordList[1] = new Entry( "HTTP","Hypertext Transport Protocol" );
        wordList[2] = new Entry( "DNS", "Domain Name System" );
        wordList[3] = new Entry( "AWT", "Application Windowing Toolkit" );
        wordList[4] = new Entry( "CPU", "Central Processing Unit" );
        wordList[5] = new Entry( "RAM", "Random Access Memory" );
        wordList[6] = new Entry( "URL", "Uniform Resource Locator" );
        wordList[7] = new Entry( "GUI", "Graphical User Interface");
        wordList[8] = new Entry( "API", "Application Programming Interface" );
        wordList[9] = new Entry( "ROM", "Read-only Memory" );

        Arrays.sort( wordList );

        Scanner scan = new Scanner( System.in );
        String key = "";
        int location;

        System.out.println("Word: ");
        key = scan.next();

        while ( !key.equals("quit") && !key.equals("q"))
        {
            location = Arrays.binarySearch( wordList, new Entry( key, "" ));

            if ( location < 0 )
                System.out.println("Not in the dictionary");
            else
                System.out.println( wordList[location] );

            System.out.println("Word: ");
            key = scan.next();
        }
        scan.close();    
    }
    
}

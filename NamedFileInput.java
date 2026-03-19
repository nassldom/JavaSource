import java.util.Scanner;
import java.io.*;

class NamedFileInput
{
  public static void main (String[] args) throws IOException
  { 
    int num, square;    

    // this Scanner is used to read what the user enters
    Scanner user = new Scanner( System.in ); 
    String  fileName;

    System.out.print("File Name: ");
    fileName = user.nextLine().trim();
    File file = new File( fileName );     // create a File object

    // this Scanner is used to read from the file
    Scanner scan = new Scanner( file );      

    while( scan.hasNextInt() )   // is there more data to process? 
    {
      num = scan.nextInt();
      square = num * num ;      
      System.out.println("The square of " + num + " is " + square);
    }
    scan.close();
    user.close();
  }
}
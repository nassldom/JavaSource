import java.io.*;

class ReadIntEOF
{
  public static void main ( String[] args ) 
  {
    String fileName = "ints.dat" ;   long sum = 0;

    try
    {
      DataInputStream instr = 
        new DataInputStream(
          new BufferedInputStream(
            new FileInputStream( fileName ) ) );

      try
      {
        while ( true )
          sum += instr.readInt();
      }

      catch ( EOFException  eof )
      {
        System.out.println( "The sum is: " + sum );
        instr.close();
      }

      catch ( IOException iox )
      {
        System.out.println( "Problems reading " + fileName );
        instr.close(); 
      }
    }

    catch ( IOException iox )
    {
      System.out.println("I/O Problems with " + fileName );
    }

  }
}
import java.util.Scanner;

class Pangram
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String line = scan.nextLine().toLowerCase();

    int[] counts = new int[26];

    for (int i = 0; i < line.length(); i++) {
      char ch = line.charAt(i);
      if (ch >= 'a' && ch <= 'z') {
        counts[ch - 'a']++;
      }
    }

    boolean isPangram = true;
    for (int i = 0; i < 26; i++) {
      if (counts[i] == 0) {
        isPangram = false;
        break;
      }
    }

    if (isPangram)
      System.out.println("Pangram");
    else
      System.out.println("NOT a pangram");
  }
}
import java.util.Scanner;

class TextEdit {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine();

    while (!line.equals("//done")) {
      System.out.println(line);
      line = scan.nextLine();
    }
  }
}
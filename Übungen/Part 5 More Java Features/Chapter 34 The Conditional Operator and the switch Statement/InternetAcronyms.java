import java.util.Scanner;

public class InternetAcronyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter text. Press Ctrl+D (Linux/Mac) or Ctrl+Z (Windows) to end.");

        while (scan.hasNext()) {
            String token = scan.next();

            switch (token) {
                case "LOL":
                    System.out.print("laughing out loud ");
                    break;
                case "BRB":
                    System.out.print("be right back ");
                    break;
                case "IDK":
                    System.out.print("I don't know ");
                    break;
                case "IMO":
                    System.out.print("in my opinion ");
                    break;
                case "TTYL":
                    System.out.print("talk to you later ");
                    break;
                case "FYI":
                    System.out.print("for your information ");
                    break;
                case "ASAP":
                    System.out.print("as soon as possible ");
                    break;
                default:
                    System.out.print(token + " ");
                    break;
            }
        }
    }
}
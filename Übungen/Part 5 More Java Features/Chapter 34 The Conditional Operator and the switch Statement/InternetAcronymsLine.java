import java.util.Scanner;

public class InternetAcronymsLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String line = scan.nextLine();

        line = line.replace("LOL", "laughing out loud");
        line = line.replace("BRB", "be right back");
        line = line.replace("IDK", "I don't know");
        line = line.replace("IMO", "in my opinion");
        line = line.replace("TTYL", "talk to you later");
        line = line.replace("FYI", "for your information");
        line = line.replace("ASAP", "as soon as possible");

        System.out.println(line);
    }
}
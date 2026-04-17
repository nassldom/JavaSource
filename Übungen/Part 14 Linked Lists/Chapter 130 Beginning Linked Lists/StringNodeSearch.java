import java.util.Scanner;

class StringNode {
    String data;
    StringNode next;

    StringNode(String data, StringNode next) {
        this.data = data;
        this.next = next;
    }
}

public class StringNodeSearch {
    public static void main(String[] args) {
        StringNode head = new StringNode("apple",
                          new StringNode("banana",
                          new StringNode("orange",
                          new StringNode("pear", null))));

        Scanner scan = new Scanner(System.in);
        System.out.print("String to search for: ");
        String target = scan.nextLine();

        StringNode p = head;
        boolean found = false;

        while (p != null) {
            if (p.data.equals(target)) {
                found = true;
                break;
            }
            p = p.next;
        }

        if (found) {
            System.out.println("The string is in the list.");
        } else {
            System.out.println("The string is not in the list.");
        }
    }
}
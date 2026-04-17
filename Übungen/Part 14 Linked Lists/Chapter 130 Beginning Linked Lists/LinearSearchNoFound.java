import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LinearSearchNoFound {
    public static void main(String[] args) {
        Node head = new Node(12,
                    new Node(99,
                    new Node(37,
                    new Node(12,
                    new Node(77, null)))));

        Scanner scan = new Scanner(System.in);
        System.out.print("Value to search for: ");
        int target = scan.nextInt();

        Node p = head;
        int nodeNumber = 1;

        while (p != null && p.data != target) {
            p = p.next;
            nodeNumber++;
        }

        if (p == null) {
            System.out.println("Value not found in list.");
        } else {
            System.out.println("Found in node " + nodeNumber);
        }
    }
}
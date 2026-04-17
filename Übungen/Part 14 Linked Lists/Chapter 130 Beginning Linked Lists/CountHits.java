import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class CountHits {
    public static void main(String[] args) {
        Node head = new Node(12,
                    new Node(99,
                    new Node(37,
                    new Node(12,
                    new Node(77,
                    new Node(12, null))))));

        Scanner scan = new Scanner(System.in);
        System.out.print("Value to count: ");
        int target = scan.nextInt();

        int hits = 0;
        Node p = head;

        while (p != null) {
            if (p.data == target) {
                hits++;
            }
            p = p.next;
        }

        System.out.println("Number of hits: " + hits);
    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ChainMaker {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node current = head;

        for (int i = 20; i <= 100; i += 10) {
            current.next = new Node(i);
            current = current.next;
        }

        Node p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }
}
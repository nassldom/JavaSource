public class LinkedList {

    private Node headPtr;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public LinkedList() {
        headPtr = null;
    }

    // Exercise 1
    public LinkedList(int[] values) {
        headPtr = null;

        if (values == null || values.length == 0) {
            return;
        }

        headPtr = new Node(values[0]);
        Node current = headPtr;

        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
    }

    public void insertFirst(int value) {
        headPtr = new Node(value, headPtr);
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);

        if (headPtr == null) {
            headPtr = newNode;
            return;
        }

        Node current = headPtr;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void traverse() {
        Node current = headPtr;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Exercise 3
    public int search(int target) {
        Node current = headPtr;
        int index = 0;

        while (current != null) {
            if (current.data == target) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    // Exercise 4
    public void set(int index, int value) throws IndexOutOfBoundsException {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Negative index: " + index);
        }

        Node current = headPtr;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index too large: " + index);
        }

        current.data = value;
    }

    // Exercise 5
    public LinkedList copy() {
        LinkedList result = new LinkedList();

        if (headPtr == null) {
            return result;
        }

        result.headPtr = new Node(headPtr.data);

        Node sourceCurrent = headPtr.next;
        Node copyCurrent = result.headPtr;

        while (sourceCurrent != null) {
            copyCurrent.next = new Node(sourceCurrent.data);
            copyCurrent = copyCurrent.next;
            sourceCurrent = sourceCurrent.next;
        }

        return result;
    }

    // Exercise 6
    public int delete(int victim) {
        int count = 0;

        while (headPtr != null && headPtr.data == victim) {
            headPtr = headPtr.next;
            count++;
        }

        Node current = headPtr;

        while (current != null && current.next != null) {
            if (current.next.data == victim) {
                current.next = current.next.next;
                count++;
            } else {
                current = current.next;
            }
        }

        return count;
    }

    // Optional helper for testing
    public int size() {
        int count = 0;
        Node current = headPtr;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Exercise 1: constructor from array");
        int[] data = {10, 20, 30, 40, 50};
        LinkedList listA = new LinkedList(data);
        listA.traverse();

        System.out.println("Exercise 2: more nodes");
        LinkedList chain = new LinkedList();
        for (int i = 1; i <= 15; i++) {
            chain.insertLast(i * 10);
        }
        chain.traverse();

        System.out.println("Exercise 3: search");
        System.out.println("search(30) = " + listA.search(30));
        System.out.println("search(99) = " + listA.search(99));

        System.out.println("Exercise 4: set");
        listA.set(2, 999);
        listA.traverse();

        System.out.println("Exercise 5: copy");
        LinkedList listB = listA.copy();
        System.out.print("Original: ");
        listA.traverse();
        System.out.print("Copy:     ");
        listB.traverse();

        listA.delete(999);
        listA.delete(10);

        System.out.println("After deleting from original:");
        System.out.print("Original: ");
        listA.traverse();
        System.out.print("Copy:     ");
        listB.traverse();

        System.out.println("Exercise 6: delete victim");
        LinkedList listC = new LinkedList(new int[]{7, 2, 7, 7, 5, 7, 8, 7});
        listC.traverse();
        int removed = listC.delete(7);
        System.out.println("Removed = " + removed);
        listC.traverse();
    }
}

/*
Zu den einzelnen Übungen
Exercise 1 — Array to List
Der Konstruktor LinkedList(int[] values) erzeugt die Knoten in derselben Reihenfolge wie die Werte im Array, also values[0] im ersten Knoten, values[1] im zweiten usw. Das entspricht genau der Aufgabenstellung.

Exercise 2 — More Nodes
Für „More Nodes“ musst du im Grunde nur öfter Knoten erzeugen und korrekt verlinken. Solange jeder neue Knoten an next des letzten Knotens gehängt wird, funktioniert die Traversierung unverändert.

Exercise 3 — search(int target)
search() benutzt lineare Suche, weil man bei einer einfach verketteten Liste nur nacheinander von Knoten zu Knoten gehen kann. Es gibt also keinen Direktzugriff wie bei Arrays.

Exercise 4 — set(int index, int value)
set() läuft bis zum gewünschten Index und ändert dort data. Falls der Index negativ oder größer als die Listengröße minus eins ist, wird IndexOutOfBoundsException geworfen.

Exercise 5 — copy()
Die Aufgabe verlangt eine tiefe Kopie der Knotenstruktur, also eine neue LinkedList mit neuen Node-Objekten. Deshalb reicht es nicht, einfach headPtr zu übernehmen, weil Original und Kopie sonst dieselben Knoten teilen würden.

Exercise 6 — delete(int victim)
Beim Löschen in einfach verketteten Listen braucht man Zugriff auf den vorherigen Knoten, weil man die Kette mit prev.next = current.next neu verbinden muss. Ein Sonderfall ist der Kopf der Liste, deshalb werden passende Head-Knoten zuerst separat entfernt.

Wichtiger Denkpunkt
Bei delete() darfst du nach einem Treffer nicht immer sofort current = current.next machen, weil du sonst bei aufeinanderfolgenden Treffern Knoten überspringen könntest. Genau deshalb bleibt current nach einem Löschen an derselben Stelle und prüft den neuen current.next erneut.
*/
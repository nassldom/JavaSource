public class OrderedLinkedList {

    private Node headPtr;

    private static class Node {
        int data;
        int count;
        Node next;

        Node(int data) {
            this.data = data;
            this.count = 1;
            this.next = null;
        }

        Node(int data, int count, Node next) {
            this.data = data;
            this.count = count;
            this.next = next;
        }
    }

    public OrderedLinkedList() {
        headPtr = null;
    }

    // Exercise 1
    public OrderedLinkedList(int[] values) {
        headPtr = null;

        if (values != null) {
            for (int value : values) {
                insertInOrder(value);
            }
        }
    }

    // Exercise 2
    public void insertInOrder(int value) {
        if (headPtr == null) {
            headPtr = new Node(value);
            return;
        }

        if (value < headPtr.data) {
            headPtr = new Node(value, 1, headPtr);
            return;
        }

        if (value == headPtr.data) {
            headPtr.count++;
            return;
        }

        Node prev = headPtr;
        Node curr = headPtr.next;

        while (curr != null && curr.data < value) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null && curr.data == value) {
            curr.count++;
        } else {
            prev.next = new Node(value, 1, curr);
        }
    }

    public void traverse() {
        Node p = headPtr;

        while (p != null) {
            System.out.println("value = " + p.data + ", count = " + p.count);
            p = p.next;
        }
    }

    // Exercise 3
    public int search(int target) {
        Node p = headPtr;

        while (p != null && p.data <= target) {
            if (p.data == target) {
                return p.count;
            }
            p = p.next;
        }

        return -1;
    }

    // Exercise 4
    public OrderedLinkedList copy(OrderedLinkedList original) {
        OrderedLinkedList result = new OrderedLinkedList();

        if (original == null || original.headPtr == null) {
            return result;
        }

        Node source = original.headPtr;
        result.headPtr = new Node(source.data, source.count, null);

        Node dest = result.headPtr;
        source = source.next;

        while (source != null) {
            dest.next = new Node(source.data, source.count, null);
            dest = dest.next;
            source = source.next;
        }

        return result;
    }

    // Exercise 5
    public int delete(int victim) {
        if (headPtr == null) {
            return 0;
        }

        if (headPtr.data == victim) {
            if (headPtr.count > 1) {
                headPtr.count--;
            } else {
                headPtr = headPtr.next;
            }
            return 1;
        }

        Node prev = headPtr;
        Node curr = headPtr.next;

        while (curr != null && curr.data < victim) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null && curr.data == victim) {
            if (curr.count > 1) {
                curr.count--;
            } else {
                prev.next = curr.next;
            }
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] values = {7, 3, 9, 7, 2, 9, 9, 5, 3, 7};

        System.out.println("Exercise 1 + 2:");
        OrderedLinkedList list = new OrderedLinkedList(values);
        list.traverse();

        System.out.println();
        System.out.println("Exercise 3:");
        System.out.println("search(7) = " + list.search(7));
        System.out.println("search(9) = " + list.search(9));
        System.out.println("search(4) = " + list.search(4));

        System.out.println();
        System.out.println("Exercise 4:");
        OrderedLinkedList copyList = new OrderedLinkedList().copy(list);
        System.out.println("Copy of list:");
        copyList.traverse();

        System.out.println();
        System.out.println("Exercise 5:");
        System.out.println("delete(9) returned " + list.delete(9));
        System.out.println("delete(9) returned " + list.delete(9));
        System.out.println("delete(9) returned " + list.delete(9));
        System.out.println("delete(9) returned " + list.delete(9));
        System.out.println("List after deletes:");
        list.traverse();

        System.out.println();
        System.out.println("Copied list remains unchanged:");
        copyList.traverse();
    }
}

/*
Exercise 1 — Array to List
Der Konstruktor OrderedLinkedList(int[] values) ruft für jeden Arraywert insertInOrder() auf, dadurch entsteht automatisch eine geordnete Liste. Genau das verlangt die Aufgabe ausdrücklich.

Exercise 2 — Occurrence Count
Der Node speichert jetzt nicht nur data, sondern auch count. Wenn insertInOrder(value) einen bereits vorhandenen Wert findet, wird kein neuer Knoten angelegt, sondern nur count erhöht; bei einem neuen Wert wird ein Knoten mit count = 1 eingefügt.

Das bedeutet zum Beispiel:

Eingaben: 7, 3, 7, 7, 5

Liste: 3(count 1) -> 5(count 1) -> 7(count 3)

Exercise 3 — Search
Da die Liste geordnet ist, kann search(target) sogar abbrechen, sobald ein Knotenwert größer als target wird. Wenn der Wert gefunden wird, gibt die Methode den count zurück, sonst -1.

Exercise 4 — copy()
Die Aufgabe verlangt eine komplett neue Liste mit neuen Knoten, also eine tiefe Kopie der Kettenstruktur. Deshalb kopiert die Methode jeden Knotenwert und jeden count in neue Node-Objekte, statt einfach Referenzen zu übernehmen.

Hinweis: Die Signatur in der Aufgabe ist etwas ungewöhnlich, weil copy() das Original als Parameter bekommt. Häufiger würde man eher public OrderedLinkedList copy() ohne Parameter schreiben, aber ich habe mich hier an die Aufgabenform gehalten.

Exercise 5 — delete()
Die modifizierte delete(int victim)-Methode macht jetzt genau eines:

Falls der Knoten mit victim einen count > 1 hat, wird nur count-- gemacht.

Falls count == 1, wird der ganze Knoten aus der Kette entfernt.

Da gleiche Werte in dieser Listenstruktur nur in einem Knoten mit Zähler gespeichert werden, ist der Rückgabewert hier sinnvollerweise 1, wenn ein Vorkommen entfernt wurde, und 0, wenn kein passender Wert existiert.

Kleine Verbesserung
Wenn du möchtest, kann man die Klasse noch „schulbuchnäher“ machen, indem man zusätzlich eine parameterlose Variante schreibt:

java
public OrderedLinkedList copy() {
    return copy(this);
}
Das ist oft bequemer beim Aufruf, z.B. OrderedLinkedList b = a.copy();. Die eigentliche Kopierlogik bleibt dabei gleich.


*/
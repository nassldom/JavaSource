public class StringObject {
    public static void main(String[] args) {
        String str = new String("Hello World");
        // String secondVariable;  // Deklariert, aber kein Objekt – ist null
        String secondVariable = null;
        System.out.println(str);         // Hello World
        System.out.println(secondVariable);  // null (kein Fehler!)
    }
} 
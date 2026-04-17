public class Quadratic {
    public static void main(String[] args) {
        double x, value;  // Nur zwei Variablen
        
        // Erster Wert
        x = 0.0;
        value = 3 * x * x - 8 * x + 4;
        System.out.println("At X = " + x + " the value is " + value);
        
        // Zweiter Wert (kopiere und ändere x)
        x = 2.0;
        value = 3 * x * x - 8 * x + 4;
        System.out.println("At X = " + x + " the value is " + value);
        
        // Dritter Wert (kopiere wieder)
        x = 4.0;
        value = 3 * x * x - 8 * x + 4;
        System.out.println("At X = " + x + " the value is " + value);
    }
}
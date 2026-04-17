public class Quadratic {
    public static void main(String[] args) {
        double x = 4.0;  // Ändere diesen Wert zum Testen
        
        double quadratic = 3 * x * x - 8 * x + 4;
        
        System.out.println("At X = " + x + " the value is " + quadratic);
    }
}

/*
| X-Wert             | Quadratischer Wert | Bemerkung                   |
| ------------------ | ------------------ | --------------------------- |
| 0.0                | 4.0                | Konstantenterm              |
| 1.0                | -1.0               | Negativ                     |
| 2.0                | 0.0                | Genau Null (Wurzel)         |
| 0.6666666666666666 | 0.0                | Genau Null (2/3 ≈ 0.666...) |
| 4.0                | 20.0               | Groß positiv                |
| 10.0               | 224.0              | Sehr groß                   |
| -1.0               | 15.0               | Negativer X                 |
*/
public class Trigonometry {
    public static void main(String[] args) {
        double value = 0.5236;
        
        double sinx = Math.sin(value);
        double cosx = Math.cos(value);
        
        double sum = sinx * sinx + cosx * cosx;
        
        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum);
    }
}
/* 
| value (Radianten) | sine   | cosine | sum of squares |
| ----------------- | ------ | ------ | -------------- |
| 0.5236 (≈30°)     | 0.5000 | 0.8660 | ≈1.0           |
| 1.0               | 0.8415 | 0.5403 | 1.0            |
| 0.0               | 0.0    | 1.0    | 1.0            |
| Math.PI / 2       | 1.0    | 0.0    | 1.0            |
*/
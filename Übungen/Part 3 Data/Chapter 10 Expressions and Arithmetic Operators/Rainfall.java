public class Rainfall {
    public static void main(String[] args) {
        double april = 12.0;
        double may   = 14.0;
        double june  = 8.0;
        
        double average = (april + may + june) / 3.0;  // / 3.0 statt / 3 vermeidet Integer-Teilung!
        
        System.out.println("Rainfall for April: \t" + april);
        System.out.println("Rainfall for May  : \t" + may);
        System.out.println("Rainfall for June: \t" + june);
        System.out.println("Average rainfall: \t" + average);
    }
}
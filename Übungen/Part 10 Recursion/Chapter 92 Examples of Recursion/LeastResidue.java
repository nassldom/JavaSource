import java.util.Scanner;

public class LeastResidue {
    public static int leastRes(int a, int m) {
        if (a >= 0 && a < m) {
            return a;
        } else if (a >= m) {
            return leastRes(a - m, m);
        } else { // a < 0
            return leastRes(a + m, m);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Modulus M: ");
        int m = scan.nextInt();

        Integer lastA = null;

        while (true) {
            System.out.print("A (argument): ");
            int a = scan.nextInt();

            if (lastA != null && a == lastA) {
                System.out.println("Same A twice in a row, quitting.");
                break;
            }

            int res = leastRes(a, m);
            System.out.println(a + " mod " + m + " = " + res);

            lastA = a;
        }

        // Beispiel-Rechnungen aus der Aufgabe
        long v1 = 1734L * 595L * 347L;
        int r1 = leastRes((int)(v1 % m), m); // evtl. BigInteger nötig für volle Präzision
        System.out.println("leastRes(1734*595*347, 23) ≡ " + r1);

        int r1734 = leastRes(1734, 23);
        int r595  = leastRes(595, 23);
        int r347  = leastRes(347, 23);
        long prod = (long) r1734 * r595 * r347;
        int r2 = leastRes((int) prod, 23);
        System.out.println("leastRes(leastRes(1734,23)*leastRes(595,23)*leastRes(347,23), 23) ≡ " + r2);
    }
}
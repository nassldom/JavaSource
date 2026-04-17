public class GroundBeefValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Price per pound package A: ");
        double priceA      = in.nextDouble();
        System.out.print("Percent lean package A: ");
        double percentLeanA = in.nextDouble() / 100.0;

        System.out.print("Price per pound package B: ");
        double priceB      = in.nextDouble();
        System.out.print("Percent lean package B: ");
        double percentLeanB = in.nextDouble() / 100.0;

        double leanCostA = priceA / percentLeanA;
        double leanCostB = priceB / percentLeanB;

        System.out.printf("Package A cost per pound of lean: %.1f%n", leanCostA);
        System.out.printf("Package B cost per pound of lean: %.6f%n", leanCostB);

        if (leanCostA < leanCostB) {
            System.out.println("Package A is the best value");
        } else {
            System.out.println("Package B is the best value");
        }
    }
}

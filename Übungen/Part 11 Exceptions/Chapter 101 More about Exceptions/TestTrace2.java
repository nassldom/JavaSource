class CallEg {

    public void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException ex) {
            System.out.println("Stack trace in methodA:");
            ex.printStackTrace();
            throw ex;  // weiterwerfen
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException ex) {
            System.out.println("Stack trace in methodB:");
            ex.printStackTrace();
            throw ex;  // weiterwerfen
        }
    }

    public void methodC() throws ArithmeticException {
        try {
            int z = 12 / 0;
            System.out.println("Never reached: " + z);
        } catch (ArithmeticException ex) {
            System.out.println("Stack trace in methodC:");
            ex.printStackTrace();
            throw ex;  // weiterwerfen
        }
    }
}

public class TestTrace2 {
    public static void main(String[] args) {
        CallEg eg = new CallEg();

        try {
            eg.methodA();
        } catch (ArithmeticException oops) {
            System.out.println("Stack trace in main:");
            oops.printStackTrace();
        }
    }
}
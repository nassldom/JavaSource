class CallEg {

    public void methodA() throws ArithmeticException {
        // direkt durch 0 teilen
        int x = 12 / 0;
        System.out.println("This line is never reached: " + x);
    }

    public void methodB() throws ArithmeticException {
    }

    public void methodC() throws ArithmeticException {
    }
}

public class TestTrace {
    public static void main(String[] args) {
        CallEg eg = new CallEg();

        try {
            eg.methodA();
        } catch (ArithmeticException oops) {
            oops.printStackTrace();
        }
    }
}
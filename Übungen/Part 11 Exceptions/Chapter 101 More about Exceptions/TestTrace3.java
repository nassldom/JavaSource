class CallEgA {
    public void method() throws ArithmeticException {
        CallEgB b = new CallEgB();
        b.method();
    }
}

class CallEgB {
    public void method() throws ArithmeticException {
        CallEgC c = new CallEgC();
        c.method();
    }
}

class CallEgC {
    public void method() throws ArithmeticException {
        int x = 42 / 0;   // Division durch 0
        System.out.println("Never reached: " + x);
    }
}

public class TestTrace3 {
    public static void main(String[] args) {
        CallEgA eg = new CallEgA();

        try {
            eg.method();
        } catch (ArithmeticException oops) {
            oops.printStackTrace();
        }
    }
}
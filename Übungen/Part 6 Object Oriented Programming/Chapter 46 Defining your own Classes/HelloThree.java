public class HelloThree {
    public static void main(String[] args) {
        HelloObject original = new HelloObject("Hello Copy!");
        HelloObject shallowCopy = new HelloObject(original);
        HelloObject deepCopy   = HelloObject.copyWithNewString(original);

        original.speak();      // Hello Copy!
        shallowCopy.speak();   // Hello Copy!
        deepCopy.speak();      // Hello Copy!
    }
}
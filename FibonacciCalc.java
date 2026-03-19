class FibonacciCalc 
{
    public int fib( int n )
    {
        if ( n == 1 )
            return 1;
        else if ( n == 2 )
            return 1;
        else
            return fib( n - 1 ) + fib( n - 2 );
    }  
}

class FibonacciTester {
  public static void main (String[] args) {
    if (args.length == 0) {
      System.out.println("Bitte N als Argument angeben, z.B.: java FibonacciTester 20");
      return;
    }

    int argument = Integer.parseInt(args[0]);

    FibonacciCalc f = new FibonacciCalc();
    int result = f.fib(argument);
    System.out.println("fib(" + argument + ") is " + result);
  }
}


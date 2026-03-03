public class CheckingAccountTester 
{
    public static void main( String[] args )
    {
        //CheckingAccount account1 = new CheckingAccount( "123", "Bob", 100.00);                     

        //System.out.println( account1.getBalance() );
        //account1.processDeposit( 2000.00 );
        //account1.processCheck( 1500.00 );
        //System.out.println( account1.getBalance() );

        // -> Output: 100.0 und 585.0

        //CheckingAccount account1 = new CheckingAccount( "123", "Bob", 100 );
        //CheckingAccount account2 = new CheckingAccount( "456", "Jill", 900 );
        //CheckingAccount account3; 
    
        //System.out.println( account1.toString() );
        //System.out.println( account2.toString() );

        //account3 = account1;
        //System.out.println( account3.toString() );

        // -> Output: Account: 123;   Owner: Bob;     Balance: 100.0
                //Account: 456;   Owner: Jill;    Balance: 900.0

        //CheckingAccount account1 = new CheckingAccount( "123", "Bob", 100 );
        //CheckingAccount account2 = new CheckingAccount( "456", "Jill", 900 );
        //CheckingAccount account3; 
    
        //account3 = account1;
        //if ( account1 == account3 )
            //System.out.println("An alias has been detected!");
        //else
            //System.out.println("These are different objects!");
        // -> Output: An alias has been detected!

        //account3.processCheck( 85 ); // subtracts 85 + 15 from account1 and account3, which are the same object
        //System.out.println( account1.toString() );
        //System.out.println( account3.toString() );
        // -> Output: Account: 123;   Owner: Bob;     Balance: 0.0
                    //Account: 123;   Owner: Bob;     Balance: 0.0

        CheckingAccount bobsAccount  = new CheckingAccount( "999", "Bob", 100 );
        CheckingAccount jillsAccount = new CheckingAccount( "111", "Jill", 500 );

        bobsAccount.processCheck( 50 );
        System.out.println( bobsAccount.toString() );

        jillsAccount.processDeposit( 500 );
        jillsAccount.processCheck( 100 );
        jillsAccount.processCheck( 100 );
        jillsAccount.processDeposit( 100 );

        System.out.println( jillsAccount.toString() ); 
    }
}

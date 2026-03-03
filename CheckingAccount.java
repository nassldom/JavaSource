public class CheckingAccount
{
   private String accountNumber;                                                                      // instance variables
   private String accountHolder;
   private double balance;
   private double useCount = 0;
   
   public CheckingAccount( String accNumber, String holder, double start )                            // constructor
   {
        this.accountNumber = accNumber;
        this.accountHolder = holder;
        this.balance = start;
   }

   public double getBalance()                                                                         // methods
   {
        return balance;
   }

   public void processDeposit( double amount )
   {
        incrementUse();
        balance = balance + amount;
   }

   public void processCheck( double amount )
   {
        double charge;
        incrementUse();
        if ( balance < 100000 )
        
            charge = 15;
        
        else
        
            charge = 0;

        balance = balance - amount - charge;
    }
    
    public String toString()
    {
        return  "Account: " + accountNumber + "\tName: " + accountHolder + 
            "\tBalance: " +  balance + "\tUse Count: " + useCount;
    }

    private void incrementUse()
    {
        useCount = useCount + 1;
    }


   
}

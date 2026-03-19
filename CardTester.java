import java.util.*;

abstract class Card
{
    protected String recipient;
    public abstract void greeting();
}

class Holiday extends Card
{
    public Holiday( String r )
    {
        recipient = r;
    }

    public void greeting()
    {
        System.out.println( "Dear " + recipient + "," );
        System.out.println( "Season's Greetings!\n" );
    }
}

class Birthday extends Card
{
    private int age;

    public Birthday ( String r, int years)
    {
        recipient = r;
        age = years;
    }

    public void greeting()
    {
        System.out.println( "Dear " + recipient + ",\n" );
        System.out.println( "Happy " + age + "th Birthday!\n\n" );
    }
}

class Valentine extends Card
{
    private int kisses;

    public Valentine ( String r, int k )
    {
        recipient = r;
        kisses = k;
    }

    public void greeting()
    {
        System.out.println( "Dear " + recipient + "," );
        System.out.println( "Love and Kisses," + kisses );
        for ( int j=0; j<kisses; j++ )
            System.out.println( "X" );
        System.out.println( "\n" );
    }
}

public class CardTester
{
    public static void main ( String[] args )
    {
        String me;
        Scanner input = new Scanner( System.in );
        System.out.println( "Your name: " );
        me = input.next();

        Holiday hol = new Holiday( me );
        hol.greeting();

        Birthday bd = new Birthday( me, 21 );
        bd.greeting();

        Valentine val = new Valentine( me, 7 );
        val.greeting();
        

        // ====== POLYMORPHISMUS-BEISPIEL ======
        Card card;  // Referenz vom Typ Card

        card = new Holiday("Amy");
        card.greeting();          // ruft Holiday.greeting()

        card = new Valentine("Bob", 3);
        card.greeting();          // ruft Valentine.greeting()

        card = new Birthday("Cindy", 17);
        card.greeting();          // ruft Birthday.greeting()

        card = new YouthBirthday("Danny", 12, "Mom");
        card.greeting();          // ruft YouthBirthday.greeting()
        // ====== ENDE POLYMORPHISMUS ======
        // instanceof-Beispiel mit Object:
        Object obj;
        YouthBirthday ybd = new YouthBirthday( "Ian", 4, me );
        

        obj = ybd;  // impliziter Cast von YouthBirthday zu Object

        if ( obj instanceof YouthBirthday )
            (( YouthBirthday ) obj ).greeting();  // expliziter Cast von Object zu YouthBirthday

        else if ( obj instanceof String )
            System.out.println( ( String ) obj );

        input.close();

            
    }
}

class YouthBirthday extends Birthday
{
    private String sender;

    public YouthBirthday( String r, int years, String sender )
    {
        super( r, years );
        this.sender = sender;
    }

    @Override
    public void greeting()
    {
        super.greeting();
        System.out.println( "How you have grown!!\n" );
        System.out.println( "Love, " + sender + "\n" );
        
    }
}

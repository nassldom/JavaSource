public class Book extends Goods implements Taxable
{
    protected String author;

    public Book( String des, double pr, String auth )
    {
        super( des, pr );
        author = auth ;
    }

    public String toString()
    {
        return super.toString() + "author: " + author ;
    }

    public double calculateTax()
    {
        return price * TAXRATE ;
    }
    
    public String getAuthor()
    {
        return author;
    }
}

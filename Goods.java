public class Goods 
{
    protected String description;
    protected double price;

    public Goods( String des, double pr )
    {
        description = des;
        price = pr;
    }

    public String toString()
    {
        return "item: " + description + " price: " + price + " ";
    }  
}

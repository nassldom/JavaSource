public class Toy extends Goods implements Taxable
{
  protected int minimumAge;

  public Toy( String des, double pr, int min)
  {
    super( des, pr );
    minimumAge  = min ;
  }

  public String toString()
  {
    return super.toString() + "minimum age: " + minimumAge ;
  }

  public double calculateTax()
  {
    return price * TAXRATE ;
  }
}
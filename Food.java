public class Food extends Goods
{
  protected double calories;

  public Food( String des, double pr, double cal)
  {
    super( des, pr );
    calories = cal ;
  }

  public String toString()
  {
    return super.toString() + calories + " calories";
  }
}
public class Cone                                                   // file: Cone.java (other TestCone.java)
{
  private double radius;  // radius of the base
  private double height;  // height of the cone
  private double area;    // area of the cone
  private double volume;  // volume of the cone
  
  public Cone( double radius, double height )
  {
    this.radius = radius;
    this.height = height;
    this.area = Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius) );
    this.volume = Math.PI*radius*radius*height/3.0;
  }
  
  public double area()
  {
    return area;
  }
  
  public double volume()
  {
    return volume;
  }
  
  public void setHeight( double height )
  {
    if ( height >= 0 )
      this.height = height ;
  }
  
  public void setRadius( double radius )
  {
    if ( radius >= 0 )
      this.radius = radius ;
  }
  
  public double getHeight()
  {
    return height ;
  }
  
  public double getRadius()
  {
    return radius ;
  }
  
  public String toString()
  {
    return "Height: " + height + " Radius: " + radius ;
  }
}

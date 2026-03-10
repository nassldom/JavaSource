class Video
{
  protected String  title;    // name of the item
  protected int     length;   // number of minutes
  protected boolean avail;    // is the video in the store?
  protected double  price;    // price in dollars
  
  // constructors
  public Video( String ttl )
  {
    title = ttl; length = 90; avail = true; 
  }

  public Video( String ttl, int lngth, double pr )
  {
    title = ttl; length = lngth; avail = true; price = pr;
  }

  public String toString()
  {
    return title + ", " + length + " min. available:" + avail + " price: $" + price ;
  } 
 
  public String getTitle() { return title; }
  public void setTitle( String ttl ) { title = ttl; }
  public int getLength() { return length; }
  public void setLength( int lng ) { length = lng; }
  public boolean getAvailable() { return avail;}
  public void setAvailable( boolean avl ) { avail = avl;}
  public double getPrice() { return price;}
  public void setPrice( double pr ) { price = pr;}
}

class Movie extends Video
{
  private String  director;     // name of the director
  private String  rating;       // G, PG, R, or X

  // constructor
  public Movie( String ttl, int lngth, String dir, String rtng, double price )
  {
    super( ttl, lngth, price );    // use the base class's constructor to initialize members inherited from it
    director = dir;
    rating = rtng;      
  }

  // added to class Movie
  //public String toString()
  //{
   // return title + ", " + length + " min. available:" + avail +
  //       " dir: " + director + ", rating:  " + rating ; 
  //}
  public String toString()
  {
    return super.toString() + "  dir: " + director + ", rating: " + rating ;  
  }
  
  public String getDirector() { return director; }
  public String getRating() { return rating; }
}  

class MusicVideo extends Video
{
  private String artist;
  private String category;
 
  // constructor
  public MusicVideo ( String ttl, int len, String art, String cat, double price )
  {
    super( ttl, len, price );
    artist   = art;
    category = cat;
  }
   
  public String toString()
  {
    return super.toString() +  " artist:" + artist + " style: " + category ;
  } 
    
  // Setters and Getters
  public String  getArtist() { return artist; }
  public String  getCategory() { return category; }
}

public class VideoStore02
{
  public static void main ( String args[] )
  {
    Video item1 = new Video("Microcosmos", 90, 9.50 );
    Movie item2 = new Movie("Jaws", 120, "Spielberg", "PG", 14.95 );
    Video item3 = new MusicVideo( "Wrecking Ball", 4, "Miely", "Rock", 0.98 );
    
    System.out.println( "\n" + item1.toString() );
    System.out.println( item2.toString() );
    System.out.println( item3.toString() );
    
    // Change some prices
    System.out.print( "\nPrice change! " + item1.getTitle() + " formerly $" + item1.getPrice() );
    item1.setPrice( 9.45 );
    System.out.println( "  Now $" + item1.getPrice() );
  }
  
}
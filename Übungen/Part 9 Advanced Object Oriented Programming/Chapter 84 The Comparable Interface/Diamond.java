class Diamond implements Comparable<Diamond>
{
  private String stockNumber;
  
  private double carat;      /* Größe */
  private String clarity;    /* FL, IF, VVS1, ... */
  private char color;        /* D-Z */
  private String cut;        /* Schliffname */

  String getStock()   { return stockNumber; }
  double getCarat()   { return carat; }
  String getClarity() { return clarity; }
  char   getColor()   { return color; }
  String getCut()     { return cut; }
  
  public Diamond( String s, double car, String clar, char col, String ct )
  {
    stockNumber = s;  
    carat = car; 
    clarity = clar; 
    color = col; 
    cut = ct;  
  }
  
  public String toString()
  {
    return stockNumber + "  " 
         + carat + " ct  "
         + clarity + "  " 
         + color + "  " 
         + cut;
  }

  private int clarityScore()
  {
    // höherer Wert = bessere Klarheit
    if (clarity.equals("FL"))  return 11;
    if (clarity.equals("IF"))  return 10;
    if (clarity.equals("VVS1"))return 9;
    if (clarity.equals("VVS2"))return 8;
    if (clarity.equals("VS1")) return 7;
    if (clarity.equals("VS2")) return 6;
    if (clarity.equals("SI1")) return 5;
    if (clarity.equals("SI2")) return 4;
    if (clarity.equals("I1"))  return 3;
    if (clarity.equals("I2"))  return 2;
    if (clarity.equals("I3"))  return 1;
    return 0; // unbekannter Code
  }

  private int colorScore()
  {
    // D ist beste Farbe → hoher Score, Z schlechteste → niedriger Score
    char c = Character.toUpperCase(color);
    if (c < 'D' || c > 'Z') return 0;
    return 'Z' - c + 1;  // D -> 23, E -> 22, ..., Z -> 1
  }

  public int compareTo( Diamond other )
  {
    // 1. Nach carat: größere Steine zuerst (besser links)
    if (this.carat > other.carat) return -1;
    if (this.carat < other.carat) return  1;

    // 2. „Qualitätswert“: max(gestreckte Klarheit, Farbe)
    int thisClarity = this.clarityScore();
    int otherClarity = other.clarityScore();

    // Klarheit auf ~23er Skala strecken (z.B. *2)
    int thisClarityScaled  = thisClarity * 2;
    int otherClarityScaled = otherClarity * 2;

    int thisColor  = this.colorScore();
    int otherColor = other.colorScore();

    int thisQuality  = Math.max(thisClarityScaled, thisColor);
    int otherQuality = Math.max(otherClarityScaled, otherColor);

    // Bessere Qualität (höherer Score) soll nach links
    if (thisQuality > otherQuality) return -1;
    if (thisQuality < otherQuality) return  1;

    // 3. Falls alles gleich: optional z.B. nach stockNumber sortieren
    return this.stockNumber.compareTo(other.stockNumber);
  }
}
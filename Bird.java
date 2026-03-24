public class Bird
{
  String genus;
  String species;
  String commonName;
  int sightings;
  
  public Bird( String genus, String species, String commonName, int sightings)
  {
    this.genus = genus;
    this.species = species;
    this.commonName = commonName;
    this.sightings = sightings;
  }
  
  public void incSightings()
  {
    sightings++ ;
  }
  
  public String toString()
  {
    return genus + " " + species + " (" + commonName + ") seen:" + sightings; 
  }
} 
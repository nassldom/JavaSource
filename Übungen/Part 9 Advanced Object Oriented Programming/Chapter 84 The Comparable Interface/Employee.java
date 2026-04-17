class Employee implements Comparable<Employee>
{
  private String firstName;
  private String lastName;
  private int birthYear;

  String getFirstName()  { return firstName; }
  String getLastName()   { return lastName; }
  int    getBirthYear()  { return birthYear; }
  
  public Employee( String f, String last, int year )
  {
    firstName = f; 
    lastName = last; 
    birthYear = year;
  }
  
  public String toString()
  {
    return firstName + " " + lastName + " (" + birthYear + ")";
  }
  
  public int compareTo( Employee other )
  {
    // 1. Nach Nachname
    int lastCmp = this.getLastName().compareTo(other.getLastName());
    if (lastCmp != 0) {
      return lastCmp;          // Adams < Cohen < Devon < ...
    }

    // 2. Nach Vorname
    int firstCmp = this.getFirstName().compareTo(other.getFirstName());
    if (firstCmp != 0) {
      return firstCmp;
    }

    // 3. Nach Geburtsjahr – ÄLTERE zuerst -> kleineres Jahr = „kleiner“
    return this.getBirthYear() - other.getBirthYear();
  }
}
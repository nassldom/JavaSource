public class StringDemo2 {
  public static void main(String[] args) {
    String str = new String("    In a Hole    in the ground there lived a Hobbit.   ");
    int lenOriginal = str.length();
    
    String trimmedStr = str.trim();  // Neues Objekt!
    int lenTrimmed = trimmedStr.length();
    
    System.out.println("Original (Länge " + lenOriginal + "): '" + str + "'");
    System.out.println("Trimmed  (Länge " + lenTrimmed + "): '" + trimmedStr + "'");
  }
}
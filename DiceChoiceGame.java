import java.util.*;

public class DiceChoiceGame
{
  public static void main ( String[] args )
  {
    // Declare and Initialize
    final int ENDSCORE = 10;
    Scanner scan = new Scanner( System.in );
    Random rand = new Random();
    int playerScore = 0, compScore = 0;
    int playerToss, compToss;
    
    // Play Rounds until one player reaches ending score
    while ( playerScore<ENDSCORE && compScore<ENDSCORE )
    {
      // Computer's Toss
      compToss = rand.nextInt(6)+1 + rand.nextInt(6)+1 ;        // bound = limit 
      System.out.println("The Computer tosses: " + compToss);
      
      // Player's Toss
      String s = "Toss 1 eleven-sided dice, or 2 six-sided dices (enter 1 or 2)? "; // Demo warum IDE "X" oder "S" vergibt
      System.out.print(s);
      String numDice = scan.nextLine();
      
      if ( numDice.equals("1") )
      {
        playerToss = rand.nextInt(11)+2 ;
        System.out.println("You throw 1 dice and get: " + playerToss );
      }
      else
      {
        playerToss = rand.nextInt(6)+1 + rand.nextInt(6)+1 ;
        System.out.println("You throw 2 dice and get: " + playerToss );
      }
      
      // Determine Winner of Round and Adjust Scores
      if ( playerToss>compToss )
      {
        playerScore = playerScore+1;
        System.out.println("You win the round!");
      }
      else
      {
        compScore = compScore+1;
        System.out.println("You loose the round!");
      }      
      System.out.println("Score: computer " + compScore + ", you " + playerScore + "\n");
    }
    
    // Determine Winner of the Game
    System.out.println("Final Score: computer " + compScore + ", you " + playerScore);
    
    if ( compScore > playerScore ) 
      System.out.println("The Computer Wins!");
    else
      System.out.println("You Win the Game!");

    scan.close();
    
  }
}
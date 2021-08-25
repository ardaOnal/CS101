/**
 * __This is test for DiceGame.___ 
 * @author __Arda Onal___
 * @version __23.11.2019__
 */
public class TestDiceGame
{
   public static void main( String[] args)
   {
      // variables
      DiceGame diceGame;
      
      // program code
      diceGame = new DiceGame();
      
      System.out.println( "The number of rolls to get two 6 rolls is: " + diceGame.play());
      System.out.println( "Done.");
   }
}
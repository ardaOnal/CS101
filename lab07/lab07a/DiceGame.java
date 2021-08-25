/**
 * __This program uses my Dice object to create a DiceGame.___ 
 * @author __Arda Onal___
 * @version __23.11.2019__
 */
public class DiceGame
{
   // properties
   private Dice dice;
   
   // constructors
   public DiceGame()
   {
      dice = new Dice();
   }
   
   // methods
   
   /**
    * This is the play method.
    * @return returns the number of times to get two 6 rolls.
    */
   public int play()
   {
      // variables
      int sum;
      int count;
      
      // program code
      sum = dice.sumOfTwoRolls();
      count = 1;
      
      while ( sum != 12)
      {
         sum = dice.sumOfTwoRolls();
         count++;
      }
      
      return count;
   }
}
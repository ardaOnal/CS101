/**
 * __This program uses my Die object to create another Dice object for a game.___ 
 * @author __Arda Onal___
 * @version __23.11.2019__
 */
public class Dice
{
   // properties
   private Die die1;
   private Die die2;
      
   // constructors
   public Dice()
   {
      die1 = new Die();
      die2 = new Die();
   }
   
   // methods
   
   /**
    * This is a method that rolls 2 dice and adds them.
    * @return returns results from [2,12]
    */
   public int sumOfTwoRolls()
   {
      int result;
      result = die1.roll() + die2.roll();
      return result;
   }
   
   /**
    * This is a method that gets the value of first die.
    * @return returns results from [0,6].
    */
   public int getDie1FaceValue()
   {
      return die1.getFaceValue();
   }
   
   /**
    * This is a method that gets the value of first die.
    * @return returns results from [0,6].
    */
   public int getDie2FaceValue()
   {
      return die2.getFaceValue();
   }
   
   /**
    * This is a method that returns the total of 2 rolls.
    * @return returns results from [2,12].
    */
   public int getDiceTotal()
   {
      return die1.getFaceValue() + die2.getFaceValue();
   }
   
   /**
    * This is toString method.
    * @return returns my object.
    */
   public String toString()
   {
      return "Die1 has value " + getDie1FaceValue() + " and die2 has value " + getDie2FaceValue() + ".";
   }
   
}
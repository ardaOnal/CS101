/**
 * __This program is a Die object to create a game.___ 
 * @author __Arda Onal___
 * @version __23.11.2019__
 */
public class Die
{
   // properties
   private int faceValue;

   // constructors
   public Die()
   {
      faceValue = 0;
   }
 
   // methods
   
   /**
    * This is a method that rolls a die.
    * @return returns results from [1,6]
    */
   public int roll()
   {
      faceValue = (int)(Math.random() * 6) + 1;
      return faceValue;
   }
   
   /**
    * This is a method to get the face value of a die.
    * @return returns value from [1,6]
    */
   public int getFaceValue()
   {
      return faceValue;
   }
   
   /**
    * This is a toString method.
    * @return returns results from [1,6]
    */
   public String toString()
   {
      return "This die's value is " + getFaceValue() + ".";
   }
}
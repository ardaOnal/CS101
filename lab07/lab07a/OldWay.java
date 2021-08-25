/**
 * __This program rolls 2 dice until both of them are 6.___ 
 * @author __Arda Onal___
 * @version __23.11.2019__
 */
public class OldWay
{
   public static void main( String[] args)
   {
      // variables
      int firstDie;
      int secondDie;
      int count;
      
      // program code
      count = 0;
      
      do
      {
         // Rolling dice from 1-6
         firstDie = (int)(Math.random() * 6) + 1;
         secondDie = (int)(Math.random() * 6) + 1;
         
         System.out.println( "Dice rolls:");
         System.out.println( firstDie);
         System.out.println( secondDie);
         System.out.println(); 
         count++;
      } while( firstDie + secondDie != 12);
      
      System.out.println("Congrats, you got 2 six rolls in " + count + " attempts."); 
         
   }
}
/**
 * __This program tests my Die object.___ 
 * @author __Arda Onal___
 * @version __23.11.2019__
 */
public class TestDie
{
   public static void main( String[] args)
   {
      // variables
      Die die1;
      Die die2;
      
      // program code
      die1 = new Die();
      die2 = new Die();
      
      // Testing the first die
      System.out.println( "First Die:");
      System.out.println( "Roll method: " + die1.roll());
      System.out.println( "getFaceValue method: " + die1.getFaceValue());
      System.out.println( die1);
      System.out.println();
      
      // Testing the second die
      System.out.println( "Second Die:");
      System.out.println( "Roll method method: " + die2.roll());
      System.out.println( "getFaceValue: " + die2.getFaceValue());
      System.out.println( die2);  
   }
}
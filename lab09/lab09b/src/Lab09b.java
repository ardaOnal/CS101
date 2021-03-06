import java.util.ArrayList;
import mypackage.Dice;
import mypackage.Die;
/**
 * This program creates a histogram of 1000 dice rolls 
 * @author Arda Onal
 * @version 11.12.2019
 */
public class Lab09b
{
   public static void main( String[] args)
   {
      display();
   }
   
   /**
    * This is a method that gets the list of frequency of 1000 dice rolls.
    * @return returns an arraylist of frequencies.
    */
   private static ArrayList<Integer> getList()
   {
      // variables
      ArrayList<Integer> list;
      Dice dice;
      
      // program code
      list = new ArrayList<Integer>();
      dice = new Dice();
      
      // First, creating an arraylist with 11 numbers.
      for ( int i = 0; i <= 10; i++)
      {
         list.add( 0);
      }
      
      // Setting up the values of roll between 2-12 to 0-10th index in the list.
      for ( int i = 0; i < 1000; i++)
      {
         dice.roll();
         list.set( dice.getDiceTotal() - 2, list.get( dice.getDiceTotal() - 2) + 1 );
      }
      
      return list;
   }
   
   /**
    * This is a method that creates and displays the histogram of 1000 dice rolls.
    */
   private static void display()
   {
      // variables
      ArrayList<Integer> list;
      String table;
      int maxFrequency;
      int starValue;

      // program code
      
      // our new list is equal to the frequency data list from previous method.
      list = getList();
      maxFrequency = 0;
      
      // Setting up the max frequency.
      for ( int i = 0; i < list.size(); i++)
      {
         if ( list.get(i) > maxFrequency)
         {
            maxFrequency = list.get(i);
         }
      }
      
      // Setting up the value of a single star in histogram.
      // it doesnt compile without (int)
      starValue = (int) Math.round( maxFrequency / 10.0);
      
      // Printing out the header of the histogram.
      System.out.println(" Frequency Distribution" +
                   "\n  for 1000 Dice rolls" +
                   "\n  ( max freq is " + maxFrequency + " )");
      
      table = "";
      // First for loop is printing the rows
      for ( int i = 0; i < 10; i++)
      {
         // Second for loop for printing the columns in each row.
         for ( int x = 0; x < 11; x++)
         {
            // Puts a star if there has to be in that position else a space.
            if ( list.get( x) >= ( 10 - i) * starValue )
               table = table + "* ";
            else
               table = table + "  ";
         }
         // going to the next row when the first row is done.
         table = table + "\n";
      }
      
      System.out.println( table);
      System.out.println( "x axis of the histogram shows values between [2-12].");
      System.out.println( "* = " + starValue);
      System.out.println( "Frequencies: " + list);
      
   }
}
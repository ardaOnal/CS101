import java.util.Scanner;

/**
 * This program processes data from a text file and sends the output from a text file to another text file.
 * Arda Onal 21903350
 * 29.10.2019
 */ 
public class Lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      final int N = 99;

      // variables
 
      int n;
      int input;
      double count;
      double sum;
      double average;
      int minimum;
      int maximum;

      // program code
      
      n = 0;
      sum = 0;
      count = 0;
      input = 0;
      minimum = input;
      maximum = input;
      
      while ( n <= N)
      {
         input = scan.nextInt();
         
         if ( input >= maximum)
         {
            maximum = input;
         }
         
         if ( input < minimum)
         {
            minimum = input;
         }
         
         sum = sum + input;
         
         count++;
         n++;
      }
      
      average = sum / count;
      
      System.out.println( "Count of the numbers is " + count + " and the sum is " + sum);
      System.out.println( "The average is: " + average);
      System.out.println( "The maximum value is " + maximum + " and the minimum value is " + minimum);      
      
   }

}
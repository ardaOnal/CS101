import java.util.Scanner;

/**
 * This program processes data from a text file to find average, minimum and the maximum values.
 * Arda Onal 21903350
 * 29.10.2019
 */ 
public class Lab04c
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
      count = 1;
      
      // Getting the first input before the loop to initialize max and min.
      input = scan.nextInt();
      
      sum = sum + input;
      
      minimum = input;
      maximum = input;
      
      while ( n <= N)
      {
         input = scan.nextInt();
         
         if ( input < 0)
         {
            n = 100;
         }
         else
         {
            if ( input >= maximum)
            {
               maximum = input;
            }
            
            if ( input <= minimum)
            {
               minimum = input;
            }
            
            sum = sum + input;
            
            count = count + 1;
            n++;
         }
     
      }
      
      average = (sum) / (count);
      
      System.out.println( "The average is: " + average);
      System.out.println( "The maximum value is " + maximum + " and the minimum value is " + minimum);      
      
   }

}
import java.util.Scanner;

/**
 * This program tests my BigNum class
 * @author Arda Onal
 * @version 17.12.2019
 */ 
public class Lab10b
{
   public static void main( String[] args)
   {
      // variables
      BigNum[] numbers;
      BigNum[] copyNumbers;
      String digits;
      Scanner scan;
      int input;
      int index;
      int redix;
      int randomValue;
      BigNum largest;
      
      // program code
      numbers = new BigNum[10];
      scan = new Scanner( System.in);
      randomValue = 0;
      redix = BigNum.BASE;
      
      // Creating random BigNum's and putting them into array
      for ( int i = 0; i < 10; i++)
      {
         digits = "";
         for ( int j = 0; j < BigNum.SIZE; j++)
         {
            randomValue = (int)( Math.random() * BigNum.BASE);
            if ( randomValue >= 10)
               digits = digits + Character.forDigit( randomValue, redix);
            else
               digits = digits + randomValue;
         }
         numbers[i] = new BigNum( digits);
      }
      
      // Printing every BigNum
      for ( int i = 0; i < numbers.length; i++)
         System.out.println( numbers[i]);

      // Testing isLessThan
      System.out.println( "1st number isLessThan 2nd number: " + numbers[0].isLessThan( numbers[1]));
      
      // Initializing variables for the loop
      copyNumbers = new BigNum[10];
      copyNumbers = numbers.clone();
      largest = new BigNum();
      index = 0;
      
      // Getting the sentinel input.
      System.out.println( "Enter an input to find the greatest number in entered number of BigNum's");
      System.out.println( "Enter a number between (0-10] and negative to stop.");
      input = scan.nextInt();
      
      while ( input <= numbers.length && input > 0)
      {
         // finding the max value.
         for ( int i = 0; i < input; i++)
         {
            if ( largest.isLessThan( numbers[i]))
            {  
               largest = numbers[i]; // Assigning the max value
               index = i; // Finding the index of the max value
            }
         }
         
         // Putting the largest value to input -1 and the value in input - 1 to the index of largest.
         numbers[index] = copyNumbers[input - 1];
         numbers[input - 1] = largest;
         
         // Printing out the new ordered numbers
         for ( int i = 0; i < numbers.length; i++)
            System.out.println( numbers[i]);
         
         // Printing the max value
         System.out.println( "The maximum BigNum in the given number of elements is " + largest + ".");
         
         // Resetting the largest value
         largest = new BigNum();
         
         // Asking for the input once again.
         System.out.println( "To continue, enter a number between (0-10] and negative to stop.");
         input = scan.nextInt();
      }
      System.out.println( "Done.");
   }
}
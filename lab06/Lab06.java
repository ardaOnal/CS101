import java.util.Scanner;

/**
 * This is the lab06 assignment. There are multiple methods to do multiple functions.
 * Arda ?nal 21903350
 * 11.11.2019
 */
public class Lab06
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      
      // variables
      
      double n;
      double x;
      double result;
      double denominator;
      double resultOfTaylor;
      int factorialNumber;
      int firstBinaryInteger;
      int secondBinaryInteger;
      int sumOfBinaries;
      int nTaylor;
      int count;
      String firstBinary;
      String secondBinary;
      String inputSentence;
      String nString;
      String spaces;
      String reversed;
      String taylor;
      String power;
      String factorailTaylor;
      String powerOfX;
      String nThTerm;
      String resultOfTayl;
      char letters;
      
      // program code

      System.out.println( "Welcome!!");
      
      // First Task ( Printing power table)
      n = 0;
      count = 0;
      spaces = "";
      
      System.out.println( "First Task:");
      
      // for loop to print the table
      for ( int a = -1; a < 11; a++)
      {
         for ( int b = 1; b < 5; b++)
         {
            
            n = (int)(power( a, b));
            
            if ( n / 10000 >= 1)
            {
               spaces = "  "; // There are 2 spaces
            }
            
            else if ( n / 1000 >= 1)
            {
               spaces = "   "; // There are 3 spaces
            }
            
            else if ( n / 100 >= 1)
            {
               spaces = "    "; // There are 4 spaces
            }
            
            else if ( n / 10 >= 1)
            {
               spaces = "     "; // There are 5 spaces
            }
            
            else if ( n / 1 >= 1 || n == 0)
            {
               spaces = "      ";   // There are 6 spaces   
            }
            
            else 
            {
               spaces = "     "; // There are 5 spaces for values that are less than 0.
            }
            
            System.out.print( spaces);
            System.out.print( n);
         }
         System.out.println();
      }
      
      // Second Task ( the factorial table)
      
      System.out.println( "Second Task:");
      

      System.out.println( "Factorial value table from 1 to 15: ");
      
      factorialNumber = 15;
      
      // for loop to create the table
      for ( int a = 1; a <= factorialNumber; a++)
      {
         // calculating the factorial values with my method and printing it.
         System.out.print( a + "! = " + factorial( a));
         System.out.println();
      }
      System.out.println();
      
      
      
      // Third Task ( adding 2 binary numbers)
      
      System.out.println( "Third Task:");
      System.out.println( "To add 2 binary values, enter a binary number:");
      firstBinary = scan.next();
      System.out.println( "Enter another binary number:");
      secondBinary = scan.next();
      
      // converting binary strings to integers with my method
      firstBinaryInteger = toDecimal( firstBinary);
      secondBinaryInteger = toDecimal( secondBinary);
      
      sumOfBinaries = firstBinaryInteger + secondBinaryInteger;
      
      // converting the sum of integers to binary and printing the result
      System.out.println( "The result is: " + toBinary( sumOfBinaries));
      
      // Fourth Task ( printing the reverse of a string)
      
      System.out.println( "Fourth Task:");
      System.out.println( "To see the reverse of a sentence or a word, enter a sentence or a word");
      inputSentence = scan.nextLine();
      inputSentence = scan.nextLine();
      
      reversed = "";
      
      System.out.print( "The reversed version is: ");
      
      // for loop to look at each character in the in the input string
      for ( int a = 0; a < inputSentence.length(); a++)
      {
         letters = inputSentence.charAt(a);
         
         // if it reaches to a space, it reverses the word and prints it.
         if ( letters == ' ' )
         {
           System.out.print( reverse( reversed) + " ");
           reversed = "";
         }
         else
         {
            reversed = reversed + letters;    
         }
      }
      System.out.print( reverse( reversed));
                          
      
      System.out.println();

      // Fifth Task
      System.out.println( "Fifth Task:");
      System.out.println( "To calculate sin(x) using Taylor series, enter a degree for x:");
      x = scan.nextDouble();
      
      // The  function of sin has a period of 360 degrees.
      if ( x >= 360)
      {
         x = x - 360;
      }
      
      nTaylor = 0;
      resultOfTaylor = 0;
      spaces = "";
      
      // Converting degrees to radians.
      x = x / 180 * 22 / 7;
      
      // printing the table
      System.out.println( "  n                      -1 to the power of n   (2n+1)!   x to the power of 2n+1      n'th term                Result of Taylor");
      System.out.println( "  -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      
      while ( nTaylor <= 10)
      {
         resultOfTaylor = resultOfTaylor + power( -1, nTaylor) / factorial( (2 * nTaylor) + 1) * power( x, (2 * nTaylor) + 1);
         
         // converting elements of table to string
         power = Double.toString( power( -1, nTaylor));
         factorailTaylor = Double.toString( factorial( (2 * nTaylor) + 1));
         powerOfX = Double.toString( power( x, (2 * nTaylor) + 1));
         nThTerm = Double.toString( power( -1, nTaylor) / factorial( (2 * nTaylor) + 1) * power( x, (2 * nTaylor) + 1));
         resultOfTayl = Double.toString( resultOfTaylor);
         
         System.out.print( "   " + nTaylor);
         
         // counting the number of characters to print spaces properly
         for ( int a = power.length(); a < 25 ; a++)
         {
            System.out.print( " ");
         }
         System.out.print( power);
         
         // counting the number of characters to print spaces properly
         for ( int a = factorailTaylor.length(); a < 25 ; a++)
         {
            System.out.print( " ");
         }
         System.out.print( factorailTaylor);
         
         // counting the number of characters to print spaces properly
         for ( int a = powerOfX.length(); a < 25 ; a++)
         {
            System.out.print( " ");
         }
         System.out.print( powerOfX);
         
         // counting the number of characters to print spaces properly
         for ( int a = nThTerm.length(); a < 25 ; a++)
         {
            System.out.print( " ");
         }
         System.out.print( nThTerm);
         
         // counting the number of characters to print spaces properly
         for ( int a = resultOfTayl.length(); a < 25 ; a++)
         {
            System.out.print( " ");
         }
         System.out.print( resultOfTayl);
        
         System.out.println();
         nTaylor++;
      }
      System.out.println();
      
      // Sixth Task
      System.out.println( "Sixth Task:");
      System.out.println( "To calculate sin(x) more accurately, enter another degree:");
      x = scan.nextDouble();
      
      // The  function of sin has a period of 360 degrees.
      if ( x >= 360)
      {
         x = x - 360;
      }
      
      // Converting degrees to radians.
      x = x / 180.0 * Math.PI;
      
      System.out.println( "The value of sin(x) using my method is: " + sin( x));
      System.out.println( "The real value of sin(x) according to Math.sin function is: " + Math.sin(x));
      
      System.out.println( "Done!!");
   }
 
   // Methods

   /**
    * This method calculates power of 2 inputs.
    * double x is an example input parameter.
    * int y is another example input.
    * returns x to the power of y.
    */
   public static double power( double x, int y)
   {
      // variables 
      double result;
      
      // program code
      result = 1;
      
      for ( int a = 0; a < y; a++)
      {
         result = result * x;
            
      }
      return result;
   }
   
   /**
    * This method factorial of an input integer.
    * int n is an example input parameter.
    * returns n!
    */
   public static long factorial( int n)
   {
      // variables
      int newN;
      long result;
      
      // program code
      result = n;
      newN = n - 1;
      
      for ( int a = 1; a < n; a++)
      {
         result = result * newN;
         newN--;
      }
      return result;
   }
   
   /**
    * This method prints the reverse of a String.
    * String n = "asd" is an example input parameter
    * returns "dsa".
    */
   public static String reverse( String s)
   {
      // variables
      int characterNumber; 
      String result;
      
      // program code
      result = "";
      characterNumber = s.length() - 1;
      
      for ( int a = 0; a < s.length(); a++)
      {
         char character;
         character = s.charAt( characterNumber);
         
         result = result + character;
         
         characterNumber--;
      }
      return result;
   }
   
   /**
    * This method prints the decimal of a String that has a binary number in it.
    * String n = "110" is an example input parameter.
    * returns 6.
    */
   public static int toDecimal( String base2)
   {
      // variables
      int binary;
      int length;
      int result;
      int powerOfTwo;
      char character;
      
      // program code
      length = base2.length() - 1;
      powerOfTwo = 1;
      result = 0;
      
      for ( int a = 0; a < base2.length(); a++)
      {
         character = base2.charAt( a);
         binary = Character.getNumericValue( character);
         
         for ( int b = 0; b < length; b++)
         {
            powerOfTwo = powerOfTwo * 2;
         }
         
         result = result + ( binary * powerOfTwo);
         powerOfTwo = 1;
         length--;
      }
      return result;
   }
   
   /**
    * This method prints the decimal value of a string that has a binary number in it.
    * String n = "110" is an example input parameter.
    * returns 6.
    */
   public static String toBinary( int number)
   {
      // variables
      String binary;
      int remainder;
      
      // program code
      binary = "";
      
      while ( number != 1)
      {
         remainder = number % 2;
         number = number / 2;
         binary = binary + Integer.toString( remainder); 
      }
      binary = binary + "1";
      binary = reverse( binary);
      
      return binary;
   }
   
   /**
    * This method uses the previous term in taylor series to calculate sin(x) more accurately.
    * Double x = 90 is an example input parameter.
    * returns 1.
    */
   public static double sin( double x)
   {
      // variables
      double sum;
      double term;

      // program code
      sum = 0;
      term = 1;
      
      for ( int n = 1; term != 0.0; n++)
      {
         term = term * x / n;
         
         // if statements determine when the value is + or - according to taylor series.
         if ( n % 4 == 1)
         {
            sum = sum + term;
         }
         
         if ( n % 4 == 3)
         {
             sum =  sum - term;
         }
      }
      return sum;
   }
   
}
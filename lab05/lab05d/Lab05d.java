import java.util.Scanner;
/**
 * This program calculates pi with series.
 * Arda ?nal 21903350
 * 05.11.2019
 */
public class Lab05d
{
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in);
      
      // constants
      
      final double PI = Math.PI;
      
      // variables
      
      int inputNumber;
      double divisor;
      double divisor2;
      double formula;
      double pi;
      double piNew;
      double error;
      
      // program code
      
      inputNumber = 0;
      pi = 0;
      formula = 0;
      divisor = 1;
      divisor2 = 3;
      
      System.out.println( "To begin with, enter an integer to calculate series up to that many times: ");
      inputNumber = scan.nextInt();
      
      // for loop that uses the series formula without accuracy input from user.
      
      for ( int x = 0; x < inputNumber; x++)
      {
         formula = ( 4.0 / ( divisor)) - (4.0 / ( divisor2));
         pi = pi + formula;
         
         divisor = divisor + 4;
         divisor2 = divisor2 + 4;
      }
      
      // for loop that uses the error accuracy of the user
      
      System.out.println( "Enter an error accuracy that is less than 1 for computing: ");
      error = scan.nextDouble();
      
      piNew = 0;
      formula = 0;
      divisor = 1;
      divisor2 = 3;
      
      while ( PI - piNew > error)
      {
         formula = ( 4.0 / ( divisor)) - (4.0 / ( divisor2));
         piNew = piNew + formula;
         
         divisor = divisor + 4;
         divisor2 = divisor2 + 4;
      }
      
      System.out.println( "The value of pi is " + PI + " according to Math.PI function");
      System.out.println( "The value of pi according to the series formula without accuracy is: " + pi);
      System.out.println( "The value of pi with accuracy is " + piNew);
   }
}
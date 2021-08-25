import java.util.Scanner;

/**
 * A program that computes the sum, difference, product, quotient and the remainder of that divison of 2 values. 
 * Arda Önal 21903350
 * @version_1 16.10.2019
 */ 
public class Lab02c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      
        
      // variables
      
      int number1;
      int number2;
      int sum;
      int difference;
      int product;
      int division;
      int remainder;
      int max_value;
      

      //Math.max and Math.min does not work unless i write these
      number1 = 0;
      number2 = 0;
      
      // program code
      
      System.out.println( "Hello, welcome to my simple calculator.");
      System.out.println( "This program allows you to find the sum, difference, product, quotient and the remainder of that division.");
      System.out.println( "To start, please enter a number: ");
      number1 = scan.nextInt();
      System.out.println( "Enter another number: ");
      number2 = scan.nextInt();
      
      
      sum = number1 + number2;
      difference = number1 - number2;
      product = number1 * number2;
      division = number1 / number2;
      remainder = number1 % number2;
      max_value = Math.max( number1, number2);
      
     
      System.out.println( "The sum of the 2 values that you entered is: " + sum);
      System.out.println( "The difference of the 2 values that you entered is: " + difference);                    
      System.out.println( "The product of the 2 values that you entered is: " + product);
      System.out.println( "The quotient of the 2 values that you entered is: " + division);
      System.out.println( "The remainder of the divsion of the 2 values that you entered is: " + remainder);
      System.out.println( "The greater number between the 2 values that you entered is: " + max_value);
      
     
   }

}
import java.util.Scanner;

/**
 * This program prints a triangle shape using ch characters having a base of width characters. 
 * Arda Onal 21903350
 * 29.10.2019
 */ 
public class Lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      
      int width;
      int count;
      char ch;
      String stringCH;

      // program code
      
      System.out.println("Please enter a character: ");
      ch = scan.next().charAt(0);
      System.out.println("Please enter an integer: ");
      width = scan.nextInt();
      
      count = 0;
      
      stringCH = Character.toString(ch);
      
      while ( count < width)
      {
         System.out.println(stringCH);
         stringCH = stringCH + ch;
         count++;
      }
      
      System.out.println( "Second Task: ");
      
      double d;
      d = 0.1;
      while ( d <= 1.0 )
      {
         System.out.println( d);
         d = d + 0.1;
      }
      System.out.println( d + " <- final value after loop!");
     
   }

}
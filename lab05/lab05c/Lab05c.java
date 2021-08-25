import java.util.Scanner;
/**
 * This is a simple calculator program.
 * Arda Önal 21903350
 * 05.11.2019
 */
public class Lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      // constants 
      
      final String ADD = "+";
      final String MINUS = "-";
      final String PRODUCT = "*";
      final String DIVIDE = "/";
      
      // variables
      
      double result;
      double number;
      String value;
      String operator;
      String ender;
      String quit;
      
      // program code
      
      System.out.println( "Welcome to simple calculator.");
      System.out.println( "You can do math operations by writing a function and a number with a space in between.");
      System.out.println( "If you want to quit type quit or q.");
      System.out.println( "If you want to clear type quit or c.");
      
      // Initializing the variables
      result = 0;
      quit = "Quit";
      ender = "";
      
      // the while loop for calculator
      
      while ( ender != quit)
      {

         System.out.println( "------------------");
         System.out.println( "[ " + result + " ]");
         System.out.println( "------------------");
         System.out.println( "  +,-,*,/ value");
         System.out.println( "  Clear");
         System.out.println( "  Quit");
         
         // Getting the operation input from the user.
         System.out.println( "Select one: ");
         operator = scan.next();
         
         if ( operator.equalsIgnoreCase( "quit") || operator.equalsIgnoreCase( "q"))
         {
            ender = quit; // Program ends with this.
         }
         
         else if ( operator.equalsIgnoreCase( "clear") || operator.equalsIgnoreCase( "c"))
         {
            result = 0;
         }
         
         else if ( !operator.equalsIgnoreCase( "clear") && !operator.equalsIgnoreCase( "c") && !operator.equalsIgnoreCase( "quit") && !operator.equalsIgnoreCase( "q") && !operator.equals( ADD) && !operator.equals( MINUS) && !operator.equals( PRODUCT) && !operator.equals( DIVIDE)) 
         {
            System.out.println( "Error: Please select one of the operations.");
         }
         
         else 
         {
            // Getting the value input to do the operations.
            value = scan.next();
            
            // Converting string to double to do the operations.
            number = Double.valueOf( value);
            
            if ( operator.equals( DIVIDE) && number == 0)
            {
               System.out.println( "Undefined");
               result = result / number;
               
            }
            
            else if ( operator.equals( PRODUCT))
            {
               result = result * number;
            }
            
            else if ( operator.equals( ADD))
            {
               result = result + number;
            }
            
            else if ( operator.equals( MINUS))
            {
               result = result - number;
            }
            
            else if ( operator.equals( DIVIDE))
            {
               result = result / number;
            }

         }
         
      }
      
      System.out.println( "Done");
   }
}
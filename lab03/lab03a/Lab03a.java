import java.util.Scanner;
/**
 * This program print the values from 1 to 50 and it also allows to sum values using a for loop!
 * Arda ?nal 21903350
 * 23/10/2019 
 */  
 
public class Lab03a
{
    public static void main ( String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        //variables
        int oddNumbers;
        int evenNumbers;
        int n;
        int total_using_loop;
        int sum_using_formula;

        
        //initializing variables
        oddNumbers = 0;
        evenNumbers = 0;
        total_using_loop = 0;
        
        //program code
        
        //getting an integer from the user
        System.out.println( "Enter an integer to calculate the sum from 1 to the value that you entered: ");
        n = scan.nextInt();
        
        if ( n < 0)
        {
           System.out.println( " Enter a positive integer.");
        }
        
        else
        {
          //the for loop
          for ( int x = 0; x <= 50; x++ )
          {
            
             if ( x>=12 && x<=25)
             {
                System.out.print( x);
             }
             else
             {
                System.out.print( x + " out of range 12-25");
             }
             
             if (x % 5 == 0)
             {
                System.out.println( " Hi Five ");
             }
             
             else if (x % 2 == 0)
             {
                System.out.println( " Hi Two ");
             }
             
             else if (x % 3 == 0 || x % 7 == 0)
             {
                System.out.println( " Hi Three or Seven ");
             }
             
             else
             {
                System.out.println( " Hi Others ");
             }
             
             
             if ( x % 2 == 1)
             {
                oddNumbers++;
             }
             
             else
             {
                evenNumbers++;
             }
             
             if ( x <= n)
             {
                total_using_loop = total_using_loop + x;
             }
            
            
          }
          
          //calculating the sum using the formula
          sum_using_formula = n * ( n + 1) / 2;
          
          //Printing out the values
          System.out.println( "Number of even values is: " + evenNumbers);
          System.out.println( "Number of odd values is: " + oddNumbers);
          System.out.println( "The sum of the numbers between 1 and " + n + " is " + total_using_loop + " which is calculated by the for loop.");
          System.out.println( "The sum of the numbers that is calculated by the formula n(n + 1)/2 is " + sum_using_formula);

        }
    }
}

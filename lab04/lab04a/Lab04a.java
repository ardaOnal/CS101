import java.util.Scanner;

/**
 * This program uses the while loop to print out combinations of values from an input to another number. 
 * Arda Onal 21903350
 * 29.10.2019
 */ 
public class Lab04a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      
      int n;
      int count;
      int newN;
      int newN2;
      int squaredNumbers;
      int numbersPrinted;
      double k;
      double decimal;
      
      // program code
      
      newN = 0;
      newN2 = 0;
      squaredNumbers = 0;
      numbersPrinted = 0;
      
      System.out.println( "Please enter a positive integer: ");
      n = scan.nextInt();
   
      
      if ( n < 0)
      {
         System.out.println( "Make sure that the number that you entered is positive!");
      }
      
      else
      {
         count = 0;
         
         System.out.println( "First Task: ");
         
         while ( count < n)
         {
            System.out.print( count + " ");
            count++;
         }
         
         System.out.println();
         System.out.println( "Second Task: ");
         count = 0;
         
         while ( count < n)
         {
             
            System.out.print( count + " ");
            count++;
            
            if ( count % 5 == 0 && count != n)
            {
               System.out.println();
               
            }
             
         }
         
         System.out.println();
         System.out.println( "Third Task: ");
         count = 0;
         
         //I have to save the value of n so i created a variable new_n. If I don't do this, the value of n becomes 0 after printing values from n to 0.
         newN = n;
         
         while ( newN >= count)
         {
           
            System.out.print( newN + " ");
            newN--;
            
         }
         
         System.out.println();
         System.out.println( "Fourth Task: ");
         count = n * ( -1);
         
         while ( count <= n)
         {
            if ( n % 2 == 0)
            {
               System.out.print( count + " ");
               count = count + 2;
            }
            
            else 
            {
               count = count + 1;
                  
               while ( count <= n - 1)
               {
                  System.out.print( count + " ");
                  count = count + 2;
               }
            }
            
         }
         
         System.out.println();
         System.out.println( "Fifth Task: ");
         count = 0;
         numbersPrinted = 0;
         
         while ( count <= n)
         {
            if ( count % 2 == 0)
            {
               squaredNumbers = count;
               squaredNumbers = squaredNumbers * squaredNumbers;
               System.out.print( squaredNumbers + " ");
               count = count + 2;
               numbersPrinted = numbersPrinted + 1;
            }

            if ( count % 10 == 0 )
            {
               System.out.println( " ");
            }
            
         }
         
         System.out.println();
         System.out.println( "Sixth Task: ");
         count = 2;
         numbersPrinted = 1;
         
         //I have to save the value of n so i created a variable new_n_2.
         newN2 = n;
         
         while ( newN2 > count)
         {
            if ( (newN2 % 3 == 0 || newN2 % 4 == 0 ) && newN2 % 12 != 0)
            {
               System.out.print( newN2 + " ");
               numbersPrinted++; 
            }   
               
            if ( numbersPrinted % 6 == 0)
            {
               System.out.println();
            }
            
            
            newN2 = newN2 - 1;
            
         }
         
         System.out.println();
         System.out.println( "Seventh Task: ");
         count = 2;
         
         while ( count <= n)
         {
            if ( n % count == 0)
            {
               System.out.print( count + " ");
               
            }

            count++;
            
         }
         
         System.out.println();
         System.out.println( "Eighth Task: ");
         count = 1;
         k = n;
         
         while (k > 0)
         {
            decimal = (1 / k);
            decimal = Math.round( decimal * 100.0) / 100.0;
            
            if ( decimal > 0.01)
            {
               System.out.print( decimal + " ");
            }
            
            k--;
            
         }
         
      }
       
   }

}
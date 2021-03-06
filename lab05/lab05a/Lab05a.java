import java.util.Scanner;
/**
 * This program prints a rectangle with a hole inside.
 * Arda ?nal 21903350
 * 04.11.2019
 */ 
public class Lab05a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      
      int width;      
      int height;
      int thickness;
      int middleHeight;
      int middleWidth;
      char question;
      
      // program code
      
      System.out.println( "This program prints a rectangular shape with a hole inside!");
      
      question = 'Y';
      
      while ( question == 'Y' || question == 'y')
      {
         // Getting an input value for height.
         System.out.println( "Please enter a height: ");
         height = scan.nextInt();
         
         if ( height <= 0)
         {
            System.out.println( "Height must be greater than 0.");
         }
         
         else 
         {
            // Getting an input value for width.
            System.out.println( "Please enter a width: ");
            width = scan.nextInt();
            
            if ( width <= 0)
            {
               System.out.println( "Width must be greater than 0.");
            }
            
            else 
            {
               // Getting an input value for thickness.
               System.out.println( "Please enter a thickness for the walls: ");
               thickness = scan.nextInt();
               
               if ( thickness <= 0)
               {
                  System.out.println( "Thickness must be greater than 0.");
               }
               
               else
               {
                  // Calculating the height and the width of the middle section
                  middleHeight = height - ( 2 * thickness);
                  middleWidth = width - ( 2 * thickness);
                  
                  // If there is not a hole in the middle.
                  if ( middleHeight <= 0 || middleWidth <= 0)
                  {
                     for ( int y = 0; y < height; y++)
                     {
                        for ( int a = 0; a < width; a++)
                        {
                           System.out.print( "*");
                        }
                        
                        System.out.println();
                     }
                     
                     System.out.println( " Oops... no hole!");
                  }
                  
                  // If there is a hole in the middle.
                  else 
                  {
                     // Printing the first section without the hole.
                     for ( int y = 0; y < thickness; y++)
                     {
                        for ( int x = 0; x < width; x++)
                        {
                           System.out.print( "*");
                        }
                        System.out.println();
                     }
                     
                     // Printing the second section with the hole in the middle.
                     for ( int z = 0; z < middleHeight; z++)
                     {
                        for ( int a = 0; a < thickness; a++)
                        {
                           System.out.print( "*");
                        }
                        
                        for ( int a = 0; a < middleWidth; a++)
                        {
                           System.out.print( " ");
                        }
                        
                        for ( int a = 0; a < thickness; a++)
                        {
                           System.out.print( "*");
                        }
                        
                        System.out.println();
                        
                     }
                     
                     // Printing the first section without the hole.
                     for ( int y = 0; y < thickness; y++)
                     {
                        for ( int x = 0; x < width; x++)
                        {
                           System.out.print( "*");
                        }
                        
                        System.out.println();
                     }
                     
                     
                  }
               }
            }
            
            System.out.println( "If you want to build another rectangle write 'Y' or 'y' else write something else."); 
            question = scan.next().charAt(0);
         }
      }
      
      System.out.println( "Goodbye.....");
   }
}
import java.util.Scanner;

/**
 * This is my lab02d project. This program computes and then reports the maximum number of flowers that can be planted in a triangular-shaped garden.
 * Arda Önal 21903350
 * Version 2 16.10.2019
 */ 
public class Lab03b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      
      final int FLOWERS = 17;

      // variables
      
      double side1;
      double side2;
      double side3;
      double semi_peremiter;
      double area;
      double maxflower;
      double rounded_maxflower;

      // program code
      System.out.println( "Welcome to my program.");
      System.out.println( "This program allows you to find the maximum number of flowers that can be planted in a triangle shaped garden.");
      System.out.println( "To start, please enter a value for the first side.");
      side1 = scan.nextDouble();
      System.out.println( "Enter another value for the seconds side.");
      side2 = scan.nextDouble();
      System.out.println( "Enter another value for the third side.");
      side3 = scan.nextDouble();
      
      if ( side1 < 0)
      {
         System.out.println( "Make sure that the sides are positive values.");
      }
        
      else if ( side2 < 0)
      {
         System.out.println( "Make sure that the sides are positive values.");
      }
      
      else if ( side3 < 0)
      {
         System.out.println( "Make sure that the sides are positive values.");
      }
      
      else if ( side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1)
      {
         System.out.println( "Enter values that can form a triangle!");
      }
      
      else
      {
      
         semi_peremiter = ( side1 + side2 + side3) / 2;
         area = Math.sqrt( semi_peremiter * ( semi_peremiter - side1) * ( semi_peremiter - side2) * ( semi_peremiter - side3));
         maxflower = area * FLOWERS;
         rounded_maxflower = Math.floor( maxflower);
      
         System.out.println( "The triangle with the area " + area + " can have " +  rounded_maxflower + " number of flowers inside at max.");
      
      }
   }

}
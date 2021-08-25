import java.util.Scanner;

/**
 * __This is my lab02d project. This program computes and then reports the maximum number of flowers that can be planted in a triangular-shaped garden.__
 * @author _Arda Önal 21903350
 * @date __16.10.2019__
 */ 
public class Lab02d
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
      
      semi_peremiter = ( side1 + side2 + side3) / 2;
      area = Math.sqrt( semi_peremiter * ( semi_peremiter - side1) * ( semi_peremiter - side2) * ( semi_peremiter - side3));
      maxflower = area * FLOWERS;
      rounded_maxflower = Math.floor( maxflower);
      
      System.out.println( "The triangle with the area " + area + " can have " +  rounded_maxflower + " number of flowers inside at max.");
      
   }

}
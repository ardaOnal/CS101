
/**
 * This program tests my BigNum class
 * @author Arda Onal
 * @version 17.12.2019
 */ 
public class Lab10a
{
   public static void main( String[] args)
   {
      // variables
      BigNum b1;
      BigNum b2;
      BigNum b3;
      BigNum b4;
      BigNum b5;

      // program code
      System.out.println( "Start...");
      
      b1 = new BigNum();
      b2 = new BigNum( "F110");
      b3 = new BigNum( b2);
      b4 = new BigNum( "A11");
      b5 = new BigNum( "F110");
      
      // Testing toString
      System.out.println( "Testing .toString()");
      System.out.println( "b1 = " + b1);
      System.out.println( "b2 = " + b2);
      System.out.println( "b3 = " + b3);
      System.out.println( "b4 = " + b4);
      System.out.println( "b5 = " + b5);
      System.out.println();
      
      // Testing is zero for a number with 0.
      System.out.println( "Testing .isZero()");
      if ( b1.isZero())
         System.out.println( "isZero() method works! (testing for b1.isZero())");
      else
         System.out.println( "isZero() method does not work.");
      
      // Testing isZero for a number that is not 0.
      if ( b2.isZero())
         System.out.println( "isZero() method does not work.");
      else
         System.out.println( "isZero() method works! (testing for b2.isZero())");
      System.out.println();
      
      // Testing .equals for an object and its clone is equal
      System.out.println( "Testing .equals()");
      if ( b2.equals( b3))
         System.out.println( "b2 is equal to b3 which is a clone object.");
      
      // Testing .equals for 2 different numbers
      if ( b1.equals( b2))
         System.out.println( "b1 should not be equal to b2. (ERROR)");
      System.out.println();
      
      // Testing shift method.
      System.out.println( "Testing .shift()");
      b3.shift( true);
      System.out.println( "Shift left is true b3 = " + b3);
      b3.shift( false);
      System.out.println( "Shift left is false b3 = " + b3);
      System.out.println();
      
      // Testing add method
      System.out.println( "Testing .add()");
      System.out.println( "b2 = " + b2);
      System.out.println( "b3 = " + b3);
      System.out.println( "Overflow from b2.add( b3) = " + b2.add( b3));
      System.out.println( "b2 = " + b2);
      System.out.println( "Overflow from b4.add( b5) = " + b4.add( b5));
      System.out.println( "b4 = " + b4);
      System.out.println();
      
      System.out.println( "End.");
   }

}
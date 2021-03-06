
/**
 * This program creates an object which holds digits of a number in an array.
 * @author Arda Onal
 * @version 17.12.2019
 */ 
public class BigNum
{
   // properties
   public final static int SIZE = 8;
   public final static int BASE = 16;
   public int[] digits;
   
   // constructors
   public BigNum()
   {
      digits = new int[SIZE];
      for ( int k : digits)
         k = 0;
   }
   
   public BigNum( String s)
   {
      // variables
      int digit;
      
      // program code
      digits = new int[SIZE];
      
      // for loop to put the digits of the number entered to an array.
      for ( int i = 0; i < s.length(); i++)
      {
         // converting every single character of input string to integer
         digit = Character.getNumericValue( s.charAt( s.length() - i - 1));
         // characters of input string is added into array named digits.
         digits[i] = digit;
      }
      
      // If the size is greater than digit number, it puts 0 to remaining spaces.
      if ( SIZE > s.length())
      {
         for ( int i = s.length(); i < SIZE; i++)
         {
            digits[i] = 0;
         }
      }
   }
   
   public BigNum( BigNum bigNum)
   {
      this.digits = bigNum.digits.clone();
   }
   
   // methods
   
   /**
    * This is the toString method.
    * @return return the digits of the BigNum.
    */ 
   public String toString()
   {
      String s;
      s = "";
      
      for ( int i = 0; i < digits.length; i++)
      {
         if ( digits[i] >= 10)
            s = (char)(55 + digits[i]) + " " + s;
         else
            s = digits[i] + " " + s;
      }
      return s;
   }
   
   /**
    * This method checks if the digits of the objects are equal.
    * @param BigNum is an example parameter
    * @return returns true or false
    */ 
   public boolean equals( BigNum other)
   {
      // variables
      boolean equality ;
      
      // program code
      equality = true;
      
      // If it gets false once, it remains false because of &&
      for ( int i = 0; i < SIZE; i++)
         equality = ( equality && this.digits[i] == other.digits[i]);
      
      return equality;
         
   }
   
   /**
    * This method checks if the number is zero
    * @return returns true or false
    */ 
   public boolean isZero()
   {
      for ( int i = 0; i < SIZE; i++)
      {
         if ( digits[i] != 0)
            return false;
      }
      return true;
   }
   
   /**
    * This method checks if the number is zero
    * @param true or false is an example input.
    */ 
   public void shift( boolean left)
   {
      int[] x;
      x = digits.clone();
      
      if ( left)
      {
         for ( int i = 0; i < SIZE - 1; i++)
         {
            digits[i + 1] = x[i];
         }
         digits[0] = 0;
      }
      else
      {
         for ( int i = 0; i < SIZE - 1; i++)
         {
            digits[i] = x[i + 1];
         }
         digits[SIZE - 1] = 0;
      }
   }
   
   /**
    * This adds two bignums together
    * @param BigNum is an example parameter
    * @return returns 1 if there is an overflow, else returns 0
    */
   public int add( BigNum other)
   {
      int overflow;
      overflow = 0;
      
      for ( int i = 0; i < SIZE; i++)
      {
         int digitSum;
         digitSum = this.digits[i] + other.digits[i] + overflow; // Adds two digits together.
         
         // If the sum of the digits are greater than base-1, overflow becomes one and gets added to next digitsum.
         if ( digitSum > BASE - 1)
         {
            overflow = 1;
            digitSum = digitSum - BASE;
            this.digits[i] = digitSum;
         }
         else
         {
            overflow = 0;
            this.digits[i] = digitSum;
         }
      }
      return overflow;
   }
   
   /**
    * This compares the values of 2 BigNums
    * @param BigNum is an example parameter
    * @return returns true or false
    */
   public boolean isLessThan( BigNum other)
   {
      // Starting from the most significant digit.
      for ( int i = BigNum.SIZE - 1; i >= 0; i--)
      {
         if ( this.digits[i] < other.digits[i])
            return true;
         else if ( this.digits[i] > other.digits[i])
            return false;
      }
      // If they are equal, it returns false.
      return false;
   }

}
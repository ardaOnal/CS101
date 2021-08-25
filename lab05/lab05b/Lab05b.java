import java.util.Scanner;
/**
 * This program creates rows and columns according to the number that the user enters.
 * Arda Onal 21903350
 * 04.11.2019
 */
public class Lab05b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      // constants
      
      final String THREE_SPACES = "   ";
      final String TWO_SPACES = "  ";
      final String ONE_SPACE = " ";
      
      // variables
      
      int row;
      int column;
      int startingColumn;
      int startingRow;
      int multiple;
      int count;
      int cellNumber;
      int rowNumber;
      String block;
      String spaces;
      
      // program code
      
      System.out.println( "Please enter the number of rows:");
      row = scan.nextInt();
      
      System.out.println( "Please enter the number of columns:");
      column = scan.nextInt();
      
      startingColumn = 1;
      startingRow = 1;
      count = 0;
      spaces = "";
      block = "";
      
      // Row & Column Numbers Table
      
      System.out.println( "Row & Column Numbers Table:");
      
      for ( startingRow = 1; startingRow <= row ; startingRow++)
      {
            
         for ( startingColumn = 1; startingColumn <= column; startingColumn++)
         {
               
            block = Integer.toString( startingRow) + "," + Integer.toString( startingColumn);
            
            // Counting the number of characters in a block.
            for( int i = 0; i < block.length(); i++) 
            {    
               if( block.charAt( i) != ' ')    
                  count++;    
            }    
               
            if ( count == 3)
            {
               spaces = THREE_SPACES;
            }
               
            else if ( count == 4)
            {
               spaces = TWO_SPACES;
            }
               
            else if ( count == 5)
            {
               spaces = ONE_SPACE;
            }
               
            System.out.print( spaces);
            System.out.print( block);
               
            count = 0;
               
         }

         System.out.println();
      }
      
      // Multiplication table
      
      startingColumn = 1;
      startingRow = 1;
      count = 0;
      spaces = "";
      block = "";
      
      System.out.println( "Multiplication Table:");
      
      for ( startingRow = 1; startingRow <= row ; startingRow++)
      {
            
         for ( startingColumn = 1; startingColumn <= column; startingColumn++)
         {
            multiple = startingColumn * startingRow;   
            block = Integer.toString( multiple); 
            
            // Counting the number of characters in a block.
            for( int i = 0; i < block.length(); i++) 
            {    
               if( block.charAt( i) != ' ')    
                  count++;    
            }    
               
            if ( count == 1)
            {
               spaces = THREE_SPACES;
            }
               
            else if ( count == 2)
            {
               spaces = TWO_SPACES;
            }
               
            else if ( count == 3)
            {
               spaces = ONE_SPACE;
            }
               
            System.out.print( spaces);
            System.out.print( multiple);
               
            count = 0;
               
         }

         System.out.println();
      }
      
      // Cell Number Table
      
      startingColumn = 1;
      startingRow = 1;
      count = 0;
      cellNumber = 0;
      spaces = "";
      block = "";
      
      System.out.println( "Cell Number Table:");
      
      for ( startingRow = 1; startingRow <= row ; startingRow++)
      {
            
         for ( startingColumn = 1; startingColumn <= column; startingColumn++)
         {
              
            block = Integer.toString( cellNumber); 
            
            // Counting the number of characters in a block.
            for( int i = 0; i < block.length(); i++) 
            {    
               if( block.charAt( i) != ' ')    
                  count++;    
            }    
               
            if ( count == 1)
            {
               spaces = THREE_SPACES;
            }
               
            else if ( count == 2)
            {
               spaces = TWO_SPACES;
            }
               
            else if ( count == 3)
            {
               spaces = ONE_SPACE;
            }
               
            System.out.print( spaces);
            System.out.print( cellNumber);
               
            count = 0;
            cellNumber++;  
         }

         System.out.println();
      }
      
      // Row Number Table
      
      startingColumn = 1;
      startingRow = 1;
      count = 0;
      rowNumber = 1;
      spaces = "";
      block = "";
      
      System.out.println( "Row Number Table:");
      
      for ( startingRow = 1; startingRow <= row ; startingRow++)
      {
            
         for ( startingColumn = 1; startingColumn <= column; startingColumn++)
         {
            if ( rowNumber == startingRow)
            {
               System.out.print( rowNumber + ",");
               
               rowNumber++;
            }
            
            else if ( startingColumn == column)
            {
               System.out.print( "-");
            }
            
            else
            {
               System.out.print( "-,");
            }
               
             
         }

         System.out.println();
      }
      
      System.out.println( "Done!!");
      
    }  
}
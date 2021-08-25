/**
 * __This is a library book object constructor class___ 
 * @author __Arda Onal___
 * @version __24.11.2019__
 */ 
public class LibraryBook 
{
   // properties
   private String title;
   private String author;
   private String dueDate;
   private int timesLoaned;

   // constructors
   public LibraryBook( String title, String author)
   {
      this.title = title;
      this.author = author;
      dueDate = "";
      timesLoaned = 0;
   }
   
   // methods
   
   /**
    * This is the toString method.
    * @return returns my object.
    */
   public String toString()
   {
      // variables
      String result;
      
      // program code
      result = "The book " + title + " is written by " + author + ".";
      
      if ( onLoan())
      {
         result = result + " Its due date is " + dueDate + ".";
      }
      else
      {
         result = result + " The book is not on loan.";
      } 
      
      if ( timesLoaned > 0)
      {
         result = result + " The number of total loans is " + timesLoaned + ".";
      }
      
      return result;
   }
   
   /**
    * This method loans a book.
    * @param newDate is a parameter. Example: 11.12.2019
    */
   public void loanBook( String newDate)
   {
      dueDate = newDate; 
      timesLoaned++;
   }
   
   /**
    * This method returns the book.
    */
   public void returnBook()
   {
      dueDate = "";
   }
   
   /**
    * This method returns the times loaned.
    * @return returns the time loaned.
    */
   public int getTimesLoaned()
   {
      return timesLoaned;
   }
   
   /**
    * This method checks if the book is on loan.
    * @return returns true or false.
    */
   public boolean onLoan()
   {
      if ( !dueDate.equals( ""))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}
package mypackage;
/**
 * This is a library book object constructor class
 * @author Arda Onal
 * @version 02.12.2019
 */ 
public class LibraryBook 
{
   // properties
   private String title;
   private String author;
   private String dueDate;
   private int timesLoaned;

   // constructors
   public LibraryBook( String theTitle, String theAuthor)
   {
      title = theTitle;
      author = theAuthor;
      dueDate = "";
      timesLoaned = 0;
   }
   
   public LibraryBook( LibraryBook otherBook)
   {
      title = otherBook.title;
      author = otherBook.author;
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
   
   /**
    * This method checks if the books are equal.
    * @return returns true or false.
    */
   public boolean equals( LibraryBook otherBook)
   {
      return (title.equals( otherBook.title) && author.equals( otherBook.author));
   }
   
   /**
    * This method checks if the books title are the same.
    * @return returns true or false.
    */
   public boolean hasSameTitle( LibraryBook otherBook)
   {
      return title == otherBook.title;
   }
   
   /**
    * This method checks if the books author are the same.
    * @return returns true or false.
    */
   public boolean hasSameAuthor( LibraryBook otherBook)
   {
      return author == otherBook.author;
   }
   
   /**
    * This gets the title
    * @return returns the title.
    */
   public String getTitle()
   {
      return title;
   }

}
package mypackage;
/**
 * This is a library  object with 4 library book properties.
 * @author Arda Onal
 * @version 02.12.2019
 */
public class Library 
{
   // properties
   private LibraryBook b1;
   private LibraryBook b2;
   private LibraryBook b3;
   private LibraryBook b4;
   
   // constructors
   public Library()
   {
      b1 = null;
      b2 = null;
      b3 = null;
      b4 = null;
   }
   
   // methods
   
   /**
    * This method checks if the library is empty.
    * @return Returns true or false.
    */
   public boolean isEmpty()
   {
      // if there is no book in the library
      if ( b1 == null && b2 == null && b3 == null && b4 == null)
         return true;
      else
         return false;
   }
   
   /**
    * This method checks if the library is full.
    * @return Returns true or false.
    */
   public boolean isFull()
   {
      // if all 4 spaces are taken
      if ( b1 != null && b2 != null && b3 != null && b4 != null)
         return true;
      else
         return false;
   }
   
   /**
    * This is the toString method.
    * @return Returns my object.
    */
   public String toString()
   {
      // Prints the library according to the books.It only prints existing books.
      if ( isEmpty())
         return "The library is empty";
      else if ( b1 != null && b2 == null)
         return "The library:\n1st Book:" + b1;
      else if ( b1 != null && b2 !=null && b3 == null)
         return "The library:\n1st Book:" + b1 + "\n2nd Book:" + b2;
      else if ( b1 != null && b2 !=null && b3 != null && b4 == null)
         return "The library:\n1st Book:" + b1 + "\n2nd Book:" + b2 + "\n3rd Book:" + b3;
      else 
         return "The library:\n1st Book:" + b1 + "\n2nd Book:" + b2 + "\n3rd Book:" + b3 + "\n4th Book:" + b4;
   }
   
   /**
    * This method adds a book to library if the library is not full.
    * @param title is an example parameter.
    * @param author is another example parameter.
    */
   public void add( String title, String author)
   {
      // If the library is full, it does not add the book.
      if ( b1 != null && b2 != null && b3 != null && b4 != null)
      {
         System.out.println( "Library is full.");
      }
      
      // Adding book to the first empty space.
      if ( b1 == null)
      {
         b1 = new LibraryBook( title, author);
      }
      else if ( b1 != null && b2 == null)
      {
         b2 = new LibraryBook( title, author);
      }
      else if ( b1 != null && b2 != null && b3 == null)
      {
         b3 = new LibraryBook( title, author);
      }
      else if ( b1 != null && b2 != null && b3 != null && b4 == null)
      {
         b4 = new LibraryBook( title, author);
      }
   }
   
   /**
    * This method removes a book from the library.
    * @param LibraryBook is an example parameter.
    * @return Returns false if book is not in the library, else returns true.
    */
   public boolean remove( LibraryBook book)
   {
      if ( b1.equals( book))
      {
         b1 = null;
         return true;
      }
      else if ( b2.equals( book))
      {
         b2 = null;
         return true;
      }
      else if ( b3.equals( book))
      {
         b3 = null;
         return true;
      }
      else if ( b4.equals( book))
      {
         b4 = null;
         return true;
      }
      else
      {
         System.out.println( "The book is not in the library.");
         return false;
      }
   }
   
   /**
    * This method finds the book by a user entered title.
    * @param titleName is an example parameter.
    * @return Returns LibraryBook if it matches.
    */
   public LibraryBook findByTitle( String title)
   {
      // If the user entered title equals the books title, returns the book.
      if ( b1 != null && b1.getTitle().equals( title))
      {
         return b1;
      }
      else if ( b2 != null && b2.getTitle().equals( title))
      {
         return b2;
      }
      else if ( b3 != null && b3.getTitle().equals( title))
      {
         return b3;
      }
      else if ( b4 != null && b4.getTitle().equals( title))
      {
         return b4;
      }
      else 
      {
         return null;
      }
   }

}
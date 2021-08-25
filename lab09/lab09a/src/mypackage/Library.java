package mypackage;
import java.util.ArrayList;
/**
 * This is a library  object with 4 library book properties.
 * @author Arda Onal
 * @version 11.12.2019
 */
public class Library 
{
   // properties
   private ArrayList<LibraryBook> list;
      
   // constructors
   public Library()
   {
      list = new ArrayList<LibraryBook>();
   }
   
   // methods
   
   /**
    * This method checks if the library is empty.
    * @return Returns true or false.
    */
   public boolean isEmpty()
   {
      // if there is no book in the library
      if ( list.size() == 0 )
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
      // variables
      String result;
      
      // Prints the library according to the books.It only prints existing books.
      result = "The Library:";
      if ( isEmpty())
         return "The library is empty";
      else 
      {
         for ( int i = 0; i < list.size(); i++)
         {
            result = result + "\n" + list.get(i);
         }
         return result;
      }
   }
   
   /**
    * This method adds a book to library.
    * @param title is an example parameter.
    * @param author is another example parameter.
    */
   public void add( String title, String author)
   {
      list.add( new LibraryBook( title, author));
   }
   
   /**
    * This method removes a book from the library.
    * @param LibraryBook is an example parameter.
    * @return Returns false if book is not in the library, else returns true.
    */
   public boolean remove( LibraryBook book)
   {
      for ( int i = 0; i < list.size(); i++)
      {
         if ( list.get(i).equals( book))
         {
            list.remove(i);
            return true;
         }
      }
      return false;
   }
   
   /**
    * This method finds the book by a user entered title.
    * @param titleName is an example parameter.
    * @return Returns LibraryBook if it matches.
    */
   public LibraryBook findByTitle( String title)
   {
      for ( int i = 0; i < list.size(); i++)
      {
         if ( list.get(i).getTitle().equals( title))
         {
            return list.get(i);
         }
      }
      return null;
   }

}
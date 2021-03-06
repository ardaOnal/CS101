import java.util.Scanner;
import mypackage.Library;
import mypackage.LibraryBook;

/**
 * This program tests my library object.
 * @author Arda Onal
 * @version 02.12.2019
 */ 
public class LibraryTest
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      Library library;
      LibraryBook book;
      boolean exiter;
      boolean bookMenuExit;
      String input;
      String title;
      String author;
      String dueDate;

      // program code

      // Initializations
      library = new Library();
      book = null;
      exiter = true;

      while ( exiter)
      {
         // Printing the main menu.
         System.out.println( "*******************************");
         System.out.println( "*          MAIN MENU          *");
         System.out.println( "*                             *");
         System.out.println( "*       Useable Commands      *");
         System.out.println( "*                             *");
         System.out.println( "*   To find a book:   find    *");
         System.out.println( "*   To show library:  show    *");
         System.out.println( "*   To add a book:    add     *");
         System.out.println( "*   To exit:          exit    *");
         System.out.println( "*******************************");
         
         // Getting the input.
         input = scan.next();
         // If input is exit.
         if ( input.equals( "exit"))
         {
            exiter = false;
         }
         // If input is add.
         else if ( input.equals( "add"))
         {
            System.out.println( "To add a book, write: title and the author");
            title = scan.next();
            author = scan.next();
            library.add( title, author);
            if ( !library.isFull())
               System.out.println( "The book " + title + " is added to the library.");
            else
               System.out.println( "Library is full.");
         }
         // If input is show, prints the library.
         else if ( input.equals( "show"))
         {
            if ( library.isEmpty())
            {
               System.out.println( "The library is empty.");
            }
            else
            {
               System.out.println( library);
            }
         }
         // If input is find. Checks if the book exists.
         else if ( input.equals ( "find"))
         {
            System.out.println( "To find a book, enter a title:");
            title = scan.next();
            // Checks if the new title input matches a title in the library.
            book = library.findByTitle( title);
            
            if ( book == null)
            {
               System.out.println( "There is no such book!");
            }
            else
            {
               // If book exists, printing the new book menu.
               bookMenuExit = true;
               while ( bookMenuExit)
               {
                  System.out.println();
                  System.out.println( book);
                  System.out.println( "********************************");
                  System.out.println( "*        BOOK OPERATIONS       *");
                  System.out.println( "*                              *");
                  System.out.println( "*        Useable Commands      *");
                  System.out.println( "*                              *");
                  System.out.println( "*   To loan a book:     loan   *");
                  System.out.println( "*   To return a book:   return *");
                  System.out.println( "*   To remove a book:   remove *");
                  System.out.println( "*   To go to main menu: exit   *");
                  System.out.println( "********************************");
                  
                  input = scan.next();
                  
                  // Book Operations
                  // If input is exit.
                  if ( input.equals( "exit"))
                  {
                     bookMenuExit = false;
                  }
                  // If input is remove.
                  else if ( input.equals( "remove"))
                  {
                     library.remove( book);
                     book = null;
                     System.out.println( "The book has been removed.");
                     bookMenuExit = false;
                  }
                  // If input is return.
                  else if ( input.equals( "return"))
                  {
                     book.returnBook();
                     System.out.println( "The book has been returned.");
                  }
                  // If input is loan.
                  else if ( input.equals( "loan"))
                  {
                     System.out.println( "To loan the book, enter dueDate:");
                     dueDate = scan.next();
                     book.loanBook( dueDate);
                     System.out.println( "The book is loaned due to " + dueDate);
                  }
                  // If input is not loan,return,remove,exit.
                  else
                  {
                     System.out.println( "Enter a valid input.");
                  }
               }
            }
         }
         // If the input is not exit,find,show,add
         else
         {
            System.out.println( "Enter a valid input.");
         } 
      }
      
      System.out.println( "Done.");
   }

}
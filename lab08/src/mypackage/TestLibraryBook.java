package mypackage;
/**
 * This program tests the library book object
 * @author Arda Onal
 * @version 02.12.2019
 */
public class TestLibraryBook
{
   public static void main( String[] args)
   {
      // variables
      LibraryBook libraryBook1;
      LibraryBook libraryBook2;
      LibraryBook libraryBook3;

      // program code
      System.out.println( "Start...");
      
      // Initializing the objects.
      libraryBook1 = new LibraryBook( "Harry Potter", "J.K. Rowling");
      libraryBook2 = new LibraryBook( "Ince Memed", "Yasar Kemal");
      libraryBook3 = new LibraryBook( "Harry Potter", "J.K. Rowling");
      
      System.out.println( libraryBook1);
      System.out.println( libraryBook2);
      System.out.println( libraryBook3);
      
      // Testing the onLoan method.
      System.out.println( "Is book1 on loan ? " + libraryBook1.onLoan());
      System.out.println();
      
      // Loaning the book
      libraryBook1.loanBook( "27.12.2019");
      System.out.println( libraryBook1);
      System.out.println( "Is book on loan ? " + libraryBook1.onLoan());
      System.out.println();
      
      // Loaning the book one more time.
      libraryBook1.loanBook( "12.01.2020");
      System.out.println( libraryBook1);
      System.out.println( "Is book on loan ? " + libraryBook1.onLoan());
      // Testing the getTimesLoaned method.
      System.out.println( "The number of times loaned is " + libraryBook1.getTimesLoaned() + ".");
      System.out.println();
      
      // Returning the book.
      libraryBook1.returnBook();
      System.out.println( libraryBook1);
      System.out.println( "Is book on loan ? " + libraryBook1.onLoan());
      System.out.println( "The number of times loaned is " + libraryBook1.getTimesLoaned() + ".");
      System.out.println();
      
      // LAB08
      System.out.println( "Lab08:");
      
      // comparing two references to two different objects
      System.out.println( "Comparing two different objects.");
      System.out.println( "using == : ");
      if ( libraryBook1 == libraryBook2)
         System.out.println( "They are equal!");
      else
         System.out.println( "They are not equal!");
      
      System.out.println( "using .equals method: ");
      if ( libraryBook1.equals(libraryBook2))
         System.out.println( "They are equal!");
      else
         System.out.println( "They are not equal!");
      System.out.println();
      
      // comparing two references to single object
      System.out.println( "Comparing two references to single object.");
      libraryBook2 = libraryBook1;
      System.out.println( "using == : ");
      if ( libraryBook1 == libraryBook2)
         System.out.println( "They are equal!");
      else
         System.out.println( "They are not equal!");
      
      System.out.println( "using .equals method: ");
      if ( libraryBook1.equals(libraryBook2))
         System.out.println( "They are equal!");
      else
         System.out.println( "They are not equal!");
      System.out.println();
      
      // Comparing two references to two different objects with same properties.
      System.out.println( "Comparing two references to two different objects with same properties.");
      if ( libraryBook1 == libraryBook3)
         System.out.println( "They are equal!");
      else
         System.out.println( "They are not equal!");
      
      System.out.println( "using .equals method: ");
      if ( libraryBook1.equals(libraryBook3))
         System.out.println( "They are equal!");
      else
         System.out.println( "They are not equal!");
      System.out.println();
      
      // Testing the copy constructor
      System.out.println( "Testing the copy constructor:");
      libraryBook2 = new LibraryBook( "Ince Memed", "Yasar Kemal");
      libraryBook3 = new LibraryBook( libraryBook2);
      
      System.out.println( "Book 2 = " + libraryBook2);
      System.out.println( "Book 3 = " + libraryBook3);
      System.out.println();
      
      // Testing hasSameTitle && hasSameAuthor methods.
      System.out.println( "Testing hasSameTitle && hasSameAuthor methods.");
      System.out.println( "Book 1 = " + libraryBook1);
      System.out.println( "Book 2 = " + libraryBook2);
      System.out.println( "Book 3 = " + libraryBook3);
      // Testing hasSameTitle
      System.out.println( "hasSameTitle method: ");
      System.out.println( "Book3 vs Book2: " + libraryBook2.hasSameTitle( libraryBook3));
      System.out.println( "Book3 vs Book1: " + libraryBook1.hasSameTitle( libraryBook3));
      // Testing hasSameAuthor
      System.out.println( "hasSameAuthor method: ");
      System.out.println( "Book3 vs Book2: " + libraryBook2.hasSameAuthor( libraryBook3));
      System.out.println( "Book3 vs Book1: " + libraryBook1.hasSameAuthor( libraryBook3));
      
      System.out.println( "End.");
   }

}
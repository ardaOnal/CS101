/**
 * __This program tests the library book object___ 
 * @author __Arda Onal___
 * @version __24.11.2019__
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
      libraryBook2 = new LibraryBook("Ince Memed", "Yasar Kemal");
      libraryBook3 = new LibraryBook("Arda's Book", "Arda Onal");
      
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
      
      System.out.println( "End.");
   }
}
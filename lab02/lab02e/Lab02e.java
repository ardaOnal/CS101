import java.util.Scanner;

/**
 * This program creates a webpage for each employee working for a company. 
 * @author Arda �nal 21903350
 * @date 16.10.2019
 */ 
public class Lab02e
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      
      String name;
      int age;
      int salary;
      String comments;

      // program code
      
      
      name = scan.nextLine();
      age = scan.nextInt();
      salary = scan.nextInt();
      comments = scan.nextLine();
      comments = scan.nextLine();
      
      
      
      
      System.out.println( "<!DOCTYPE html> <html> <head> <title>" + name + "'s Home Page</title> </head> <body> <hr> <h1>" + name + "</h1> <p>Age: " + age + "</p> <p>Salary: " + salary + "</p> <p>Comments: " + comments + "</p> <hr> </body> </html>");
     


    
   }

}
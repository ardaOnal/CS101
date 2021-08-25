import java.util.Scanner;
import java.nio.file.*;
import java.io.*;

/**
 * This program creates a webpage for each employee working for a company.
 * Arda Onal 21903350
 * Version 2 16.10.2019
 */
public class Lab03c
{
    public static void main( String[] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner( System.in);
        PrintStream originalStdOut = System.out;

        // constants
        
        final int FIXED_AMOUNT = 100;
        final double TAX_MID = 0.15;
        final double TAX_MIN = 0.05;
        final double TAX_MAX = 0.25;
        final String HTML = "<html>";
        final String DOC_HTML = "<!DOCTYPE html>";
        final String HEAD = "<head>";
        final String HEAD_WITH_SLASH = "</head>";
        final String TITLE = "<title>";
        final String TITLE_WITH_SLASH = "</title>";
        final String BODY = "<body>";
        final String HR = "<hr>";
        final String H1 = "<h1>";
        final String H1_WITH_SLASH = "</h1>";
        final String P = "<p>";
        final String P_WITH_SLASH = "</p>";
        final String BODY_WITH_SLASH = "</body>";
        final String HTML_WITH_SLASH = "</html>";
           
        
        // variables

        String name;
        int age;
        int salary;
        double net_salary;
        String comments;
        String taxRate;


        // program code

        System.out.println( "Enter your name: ");
        name = scan.nextLine();
        
        System.out.println( "Enter your age: ");
        age = scan.nextInt();
        
        System.out.println( "Enter your salary: ");
        salary = scan.nextInt();
        
        System.out.println( "Enter any further comments: ");
        comments = scan.nextLine();
        comments = scan.nextLine();
        
        //calculating net salary
        net_salary = salary - 100 - (salary - 100) * TAX_MID;
        taxRate = "15%";


        if ( salary < 1000)
        {
            net_salary = salary - FIXED_AMOUNT - (salary - FIXED_AMOUNT) * TAX_MIN;
            taxRate = "5%";
        }

        if ( salary > 5000 && salary < 10000)
        {
            net_salary = salary - FIXED_AMOUNT - (salary - FIXED_AMOUNT) * TAX_MAX;
            taxRate = "25%";
        }

        if ( age < 0)
        {
            System.out.println( "Please enter a positive value for age.");
        }

        else if ( salary < 0)
        {
            System.out.println( "Please enter a positive value for salary.");
        }

        else if ( salary > 10000)
        {
            System.out.println( "Enter a salary that is less then 10000.");
        }

        else if ( Files.exists ( Paths.get ( name + ".jpg") ) )
        {
            System.setOut( new PrintStream( "magic.htm" ) );


            System.out.println( DOC_HTML);
            System.out.println( HTML);
            System.out.println( HEAD);
            System.out.println( TITLE + name + "'s Home Page" + TITLE_WITH_SLASH);
            System.out.println( HEAD_WITH_SLASH);
            System.out.println( BODY);
            System.out.println( HR);
            System.out.println( "<img src=\"" + name + ".jpg\">");
            System.out.println( H1 + name + H1_WITH_SLASH);
            System.out.println( P + "Age: " + age + P_WITH_SLASH);
            System.out.println( P + "Salary{" + taxRate + " tax}: " + net_salary + P_WITH_SLASH);
            System.out.println( P + "Comments: " + comments + P_WITH_SLASH);
            System.out.println (HR);
            System.out.println( BODY_WITH_SLASH);
            System.out.println(  HTML_WITH_SLASH);
        }

        else
        {
            System.setOut( new PrintStream( "magic.htm" ) );

            System.out.println( DOC_HTML);
            System.out.println( HTML);
            System.out.println( HEAD);
            System.out.println( TITLE + name + "'s Home Page" + TITLE_WITH_SLASH);
            System.out.println( HEAD_WITH_SLASH);
            System.out.println( BODY);
            System.out.println( HR);
            System.out.println( H1 + name + H1_WITH_SLASH);
            System.out.println( P + "Age: " + age + P_WITH_SLASH);
            System.out.println( P + "Salary{" + taxRate + " tax}: " + net_salary + P_WITH_SLASH);
            System.out.println( P + "Comments: " + comments + P_WITH_SLASH);
            System.out.println (HR);
            System.out.println( BODY_WITH_SLASH);
            System.out.println(  HTML_WITH_SLASH);
           

        }

        System.out.close();
        System.setOut( originalStdOut);
        System.out.println( "Webpage created.");

    }

}
/**
 * Program to display a formatted Digital Identity Card on the console.
 * Concepts Covered: Escape Sequences (\n, \t), Text Formatting, Output Statements
 */
public class DigitalIdCard {

    public static void main(String[] args) {
        // ID Card Border and Header
        System.out.println("==================================================");
        System.out.println("|\t\t DIGITAL ID CARD                 |");
        System.out.println("|\t\t GLA UNIVERSITY                  |");
        System.out.println("==================================================");
        
        // Student Personal Details
        System.out.println("|\t Name        :\t Gopal Ji Tomar          |");
        System.out.println("|\t Father's Name:\t Mr. S. P. Tomar         |");
        System.out.println("|\t Date of Birth:\t 28/10/2000              |");
        System.out.println("|\t Blood Group :\t B+                      |");
        
        // Divider line inside the card
        System.out.println("|------------------------------------------------|");
        
        // Contact Details
        System.out.println("|\t Mobile No.  :\t +91 9876543210          |");
        System.out.println("|\t Email       :\t gopal.tomar@gla.ac.in   |");
        System.out.println("|\t Address     :\t Mathura, U.P. - 281406  |");
        
        // ID Card Footer
        System.out.println("==================================================");
    }
}
package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); // creating a scanner object for using methods

        System.out.println("Please put your first name"); // this is what I want user to put
        String firstName = scan.next(); //storing the first name from user

        System.out.println("Please put your last name");
        String lastName = scan.next();

        System.out.println("Users put first name = " + firstName); //printing my object/variable
        System.out.println("The last name user put = " + lastName); //printing my object/variable

        System.out.println("The first and last name of user is " + firstName + " " + lastName);

    }
}

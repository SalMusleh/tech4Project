package scanner;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = scan.next();

        System.out.println("What is your last name?");
        String lastName = scan.next();

        System.out.println("The users full name is: " + firstName +" "+ lastName);

        /*
        Pseudo Code:
        1. Create an object
        2. Print out the Question
        3. Get the address by the nextLine() method amd store it
        4. Print out the user's address
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is you address?");

        String address = scanner.nextLine();

        System.out.println("The user's address is: " + address);

        /*
        Write a java program that asks user to enter
        3 numbers and print the sum of those 3 numbers
         */

        System.out.println("Enter 3 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("The sum of the 3 numbers user input = "
                    + (num1 + num2 + num3));





    }
}

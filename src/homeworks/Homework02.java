package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your first name?");
        String firstName = scan.nextLine();

        System.out.println("What's your last name?");
        String lastName = scan.nextLine();

        System.out.println("What's your age?");
        int age = scan.nextInt();

        System.out.println("What's your email address?");
        String emailAddress = scan.next();

        System.out.println("What's your phone number?");
        long phoneNumber = scan.nextLong();

        System.out.println("whats your address?");
        String address = scan.next();
        address = address + scan.nextLine();

        System.out.println("User who joined this program is " + firstName +" " + lastName +". "
                + firstName + "'s age is " + age + ". " + firstName + "'s email address is "
                + emailAddress + ", phone number " + phoneNumber + " and address is " + address);


        System.out.println("---Task 2---");

        System.out.println("What's your favorite book?");
        String favBook = scan.next();
        favBook = favBook + scan.nextLine();

        System.out.println("What's you favorite color?");
        String favColor = scan.next();

        System.out.println("Whats you favorite number?");
        int favNumber = scan.nextInt();

        System.out.println("User's favorite book is: " + favBook );
        System.out.println("User's favorite color is: " + favColor );
        System.out.println("User's favorite number is: " + favNumber);





    }

}

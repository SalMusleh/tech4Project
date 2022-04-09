package scanner;

import java.util.Scanner;

public class ScannerNextLineProblem {
    public static void main(String[] args) {

        /*
        name         --> next()
        age          --> nextInt()
        myBrainOk    --> nextBoolean()
        fav quote    --> nextLine()
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Whats your name?");
        String name = userInput.next();

        System.out.println("Whats your age?");
        int age = userInput.nextInt();

        System.out.println("Is your brain fried?");
        boolean myBrainOk = userInput.nextBoolean();

        System.out.println("Whats your address?");
        userInput.nextLine();
        String address = userInput.nextLine();

        System.out.println("User name is = " + name + ".\nUsers age is = " + age
                + ". \nIs user's  brain OK? = " + myBrainOk +
                 ". \nUser's address is = " + address);

        int number = 10; //declaration and assignment

        System.out.println(" Number is = " + number);

        number = 20; // re-assignment

        System.out.println("Number is + " + number);



    }
}

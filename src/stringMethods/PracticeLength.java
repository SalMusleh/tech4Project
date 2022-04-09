package stringMethods;

import java.util.Scanner;

public class PracticeLength {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter their favorite book name and quote and store answers of user in different Strings
        Finally, print the length of those Strings with proper message
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your favorite book");
        String favoriteBook = scan.nextLine();

        System.out.println("Please enter your favorite quote");
        String favoriteQuote = scan.nextLine();

        System.out.println("The length of \"" + favoriteBook +"\" is = " + favoriteBook.length());
        System.out.println("The length of \"" + favoriteQuote +"\" is = " + favoriteQuote.length());

    }
}

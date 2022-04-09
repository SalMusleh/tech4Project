package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeSubstring {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a sentence (multiple words)
        Find and print the first and the last words from the given sentence with below messages

        Test data1:
        I like Java

        Expected output:
        The first word is = I
        The last word is = Java

        Test data2:
        Today is Sunday

        Expected output:
        The first word is = Today
        The last word is = Sunday
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter a sentence");
        String sentence = scan.nextLine();

        String firstWord = sentence.substring(0,sentence.indexOf(' '));
        String lastWord = sentence.substring(sentence.lastIndexOf(' ') + 1);
        System.out.println("first word = " + firstWord);
        System.out.println("last word = " + lastWord);


        System.out.println("\nTeachers Example\n");


        String sentence1 = ScannerHelper.getAStringFromUser(); //Enter a sentence

        String first = sentence1.substring(0, sentence1.indexOf(' '));
        String last = sentence1.substring(sentence1.lastIndexOf(' ')+1);

        System.out.println("The first word is = '" + first + "'");
        System.out.println("The last word is = '" + last + "'");

    }
}

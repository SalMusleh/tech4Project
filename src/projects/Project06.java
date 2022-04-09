package projects;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Project06 {
    public static void main(String[] args) {
        System.out.println("----------TASK1----------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a Sentence");
        String str = scan.nextLine().trim();
        int words = 0;

        if (str.contains(" ")) {
            for (int i = 0; i <= str.length() - 1; i++) {
                if (Character.isSpaceChar(str.charAt(i))) {
                    words++;
                }
            }
            System.out.println("This sentence has " + (words + 1) + " words.");
        } else System.out.println("This sentence does not have multiple words");

        System.out.println("----------TASK2----------");
        System.out.println("Enter a word");
        String word = scan.nextLine();
        String reversed = "";
        if (word.isEmpty()) System.out.println("This word does not have 1 or more characters");
        else
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
        if (reversed.equals(word)) {
            System.out.println("This word is palindrome");
        } else System.out.println("This word is not palindrome");

        System.out.println("----------TASK3----------");
        System.out.println("Write a Sentence");
        String sentence = scan.nextLine();
        int aCounter = 0;
        if (sentence.isEmpty()) System.out.println("This sentence does not have any characters");
        else
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'A') {
                    aCounter++;

                }
            }
        System.out.println("This sentence has "+ aCounter +" a or A letters.");

        System.out.println("----------TASK4----------");
        System.out.println("Enter a positive number");
        int posNum = scan.nextInt();
        for (int i = 1; i <= posNum; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

    }
}

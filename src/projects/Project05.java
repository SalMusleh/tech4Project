package projects;

import utilities.ScannerHelper;
import utilities.StringHelper;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Project05 {
    public static void main(String[] args) {
        System.out.println("----------TASK1----------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a String");
        String str = scan.nextLine();

        if(str.length() >= 8) {
            System.out.println(str.substring(str.length() - 4) + str.substring(4, str.length() - 4) + str.substring(0, 4));
        }
        else System.out.println("This String does not have 8 characters");


        System.out.println("----------TASK2----------");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Write a sentence");
        String sentence = scan1.nextLine().trim();

        if(sentence.contains(" ")){
            System.out.println(sentence.substring(sentence.lastIndexOf(" ") + 1) + sentence.substring(sentence.indexOf(" "),
                    sentence.lastIndexOf(" ")+ 1) + sentence.substring(0,sentence.indexOf(" ")));
        }
        else System.out.println("This sentence does not have 2 or more words to swap");


        System.out.println("----------TASK3----------");

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Write a string");
        String sentence1 = scan1.nextLine();

        sentence1 = sentence1.replace("idiot", "nice").replace("stupid", "nice");
        System.out.println(sentence1);

        System.out.println("----------TASK4----------");

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan3.nextLine();

        if (name.length() < 2)System.out.println("Invalid input!!!");
        else System.out.println(StringHelper.getMiddle(name));

        System.out.println("----------TASK5----------");

        Scanner scan4 = new Scanner(System.in);
        System.out.println("Please enter a country");
        String country = scan4.nextLine();

        if(country.length() >= 5) {
            System.out.println(country.substring(2, country.length() - 2));
        }
        else System.out.println("Invalid input!!!");

        System.out.println("----------TASK6----------");

        Scanner scan5 = new Scanner(System.in);
        System.out.println("Please Enter your full address");
        String address = scan.nextLine();

        System.out.println(address.replace('a', '*')
                .replace('e', '#').replace('i','+')
                .replace('o', '@').replace('u', '@')
                .replace('A', '*').replace('E', '#')
                .replace('I','+').replace('O', '@').replace('U', '@'));

        System.out.println("----------TASK7----------");

        int randomNumber1 = (int)(Math.random() * 26);
        int randomNumber2 = (int)(Math.random() * 26);

        for(int i = randomNumber1; i < randomNumber2; i++) {
            if (i % 5 != 0) System.out.println(i);
            }
    }
}

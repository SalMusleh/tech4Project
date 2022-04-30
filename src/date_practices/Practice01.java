package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter their date of year
        Then calculate their age and print with the message below

        EXPECTED OUTPUT:
        You are {age} years old!

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your year of birth");
        int year = scan.nextInt();

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");

        //System.out.println("you are " + (2022 - year) + " years old");

        System.out.println("You are " + (Integer.parseInt(dateFormat.format(date)) - year) + " years old");






        System.out.println("Hey, please enter your year of birth");
        System.out.println("You are " + (Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())) - new Scanner(System.in).nextInt()) + " years old!");






        Scanner scan1 = new Scanner(System.in);
        System.out.println("Hey, please enter your year of birth");
        int YOB = scan.nextInt();

        Date date1 = new Date();
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy");

        int currentYear = Integer.parseInt(dateFormat1.format(date1));

        System.out.println("You are " +  (currentYear - YOB) + " years old!");

    }
}

package homeworks;

import utilities.StringHelper;

import java.util.Locale;
import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("\n------------TASK-1------------\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = scan.nextLine();
        if(s1.isEmpty()) System.out.println("Length is zero");
        else {
            System.out.println("The length is = " + s1.length());
            System.out.println("First char is = " + s1.charAt(0));
            System.out.println("Last char is = " + s1.charAt(s1.length() - 1));
        }
        s1 = s1.toLowerCase();
        if(s1.contains("a")||s1.contains("e")||s1.contains("i")||s1.contains("o")||s1.contains("u"))System.out.println("This String has vowel");
        else System.out.println("This string does not have a vowel");

        System.out.println("\n------------TASK-2------------\n");
        System.out.println("Please enter a String");
        String s2 = scan.nextLine();

        if (s2.length() < 3){
            System.out.println("Length is less than 3");
        }
        else s2 = (s2.length() % 2 == 0) ? ("" + s2.charAt(s2.length()/2-1) + s2.charAt(s2.length()/2)) : "" + s2.charAt(s2.length()/2);
        System.out.println(s2);

        System.out.println("\n------------TASK-3------------\n");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a String");
        String s3 = scan.nextLine();

        if (s3.length() < 4) {
            System.out.println("INVALID INPUT");
        }
        else System.out.println("The first 2 characters are = " + s3.substring(0, 2));
        System.out.println("The last 2 characters are = " + s3.substring(s3.length()-2));
        System.out.println("The other characters are = " + s3.substring(2, s3.length()-2));

        System.out.println("\n------------TASK-4------------\n");
        System.out.println("Please enter a string");
        String str = scan.next();

        if (str.length() < 2){
            System.out.println("Length is less than 2");
        }
        else System.out.println((str.substring(0, 2) == str.substring(str.length()-2)));

        System.out.println("\n------------TASK-5------------\n");
        scan.nextLine();
        System.out.println("Please enter a string");
        String str2 = scan.nextLine();
        System.out.println("Please enter another String");
        String str3 = scan.nextLine();

        if (str2.length() < 2 || str3.length() < 2){
            System.out.println("INVALID INPUT");
        }
        else System.out.println(str2.substring(1,str2.length()-1) + str3.substring(1,str3.length()-1));

        System.out.println("\n------------TASK-6------------\n");
        scan.nextLine();
        System.out.println("Please enter a string");
        String str4 = scan.nextLine();

        if (str4.length() < 4) {
            System.out.println("INVALID INPUT");
        }
        else System.out.println(str4.startsWith("xx") && str4.endsWith("xx"));


    }
}

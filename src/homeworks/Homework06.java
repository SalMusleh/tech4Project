package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args){

        System.out.println("----------TASK1----------\n");
        String s1 = "5", s2 = "10";
        int s1NumValue = Integer.parseInt(s1), s2NumValue = Integer.parseInt(s2);

        System.out.println("Sum of " + s1 + " and " + s2 + " is = " + (s1NumValue + s2NumValue));
        System.out.println("Product of " + s1 + " and " + s2 + " is = " + (s1NumValue * s2NumValue));
        System.out.println("Division of " + s1 + " and " + s2 + " is = " + (s1NumValue / s2NumValue));
        System.out.println("Subtraction of " + s1 + " and " + s2 + " is = " + (s1NumValue - s2NumValue));
        System.out.println("Remainder of " + s1 + " and " + s2 + " is = " + (s1NumValue % s2NumValue));

        System.out.println("\n----------TASK2----------\n");
        String s3 = "200", s4 = "-50";
        int num1Int = Integer.parseInt(s3);
        int num2Int = Integer.parseInt(s4);

        System.out.println("The greatest value is = "+ Math.max(num1Int,num2Int));
        System.out.println("The smallest value is = "+ Math.min(num1Int,num2Int));
        System.out.println("The average is = "+ (num1Int + num2Int) /2);
        System.out.println("The absolute difference is = "+(Math.abs(num1Int - num2Int)));

        System.out.println("\n----------TASK3----------\n");
        double dailySave = (3 * 0.25) + 0.10 + (2 * 0.05) + 0.01;

        System.out.println((int)(24 / dailySave) + " days");
        System.out.println((int)(168 / dailySave) + " days");
        System.out.println("$" + (5 * 30 * dailySave));

        System.out.println("\n----------TASK4----------\n");
        double moneySaved = 1250;
        double moneySavedEveryDay = 62.5;

        System.out.println((int)(moneySaved/moneySavedEveryDay));


        System.out.println("\n----------TASK5----------\n");
        double newCar = 14265;
        int newCarInt = (int) newCar;
        double option1PaymentPerMonth = 475.50;
        int option1PaymentPerMonthInt = (int) option1PaymentPerMonth;
        double option2PaymentPerMonth = 951;
        int option2PaymentPerMonthInt = (int) option2PaymentPerMonth;

        System.out.println("Option 1 will take " + (newCarInt/option1PaymentPerMonthInt) + " months" +
                "\nOption 2 will take " + (newCarInt/option2PaymentPerMonthInt) + " months");


        System.out.println("\n----------TASK6----------\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = input.nextInt(), num2 = input.nextInt();

        double division = (double)num1 / (double)num2;

        System.out.println(division);
    }
}

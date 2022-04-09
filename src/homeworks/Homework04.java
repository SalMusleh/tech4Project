package homeworks;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("\nTask 1\n");

        System.out.println("Please enter 2 numbers");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.println("The average of the given 2 numbers is: " + (number1 + number2) / 2);

        System.out.println("\nTask 2\n");

        System.out.println("Please enter 2 numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("The product of the given 2 numbers is: " + (num1 * num2));

        System.out.println("\nTask 3\n");
        System.out.println("Please enter 3 numbers");
        int sqr1 = scan.nextInt();
        int sqr2 = scan.nextInt();
        int sqr3 = scan.nextInt();
        System.out.println("The " + sqr1 + " multiplied with " + sqr1 + " is = " + (sqr1 * sqr1));
        System.out.println("The " + sqr2 + " multiplied with " + sqr2 + " is = " + (sqr2 * sqr2));
        System.out.println("The " + sqr3 + " multiplied with " + sqr3 + " is = " + (sqr3 * sqr3));

        System.out.println("\nTask 4\n");
        System.out.println("Please enter 2 numbers");
        int rem1 = scan.nextInt();
        int rem2 = scan.nextInt();
        System.out.println("The remainder of " + rem1 +" % " + rem2 + " = " + (rem1%rem2));

        System.out.println("\nTask 5\n");
        System.out.println("Please enter 5 numbers");
        int avg1 = scan.nextInt();
        int avg2 = scan.nextInt();
        int avg3 = scan.nextInt();
        int avg4 = scan.nextInt();
        int avg5 = scan.nextInt();
        System.out.println("The average of the given 5 numbers is: " + ( avg1+avg2+avg3+avg4+avg5 ) / 5);

        System.out.println("\nTask 6\n");
        System.out.println("Please enter 1 number");
        int multi1 = scan.nextInt();
        System.out.println(multi1 + " * 1 = " + (multi1*1));
        System.out.println(multi1 + " * 2 = " + (multi1*2));
        System.out.println(multi1 + " * 3 = " + (multi1*3));
        System.out.println(multi1 + " * 4 = " + (multi1*4));
        System.out.println(multi1 + " * 5 = " + (multi1*5));
        System.out.println(multi1 + " * 6 = " + (multi1*6));
        System.out.println(multi1 + " * 7 = " + (multi1*7));
        System.out.println(multi1 + " * 8 = " + (multi1*8));
        System.out.println(multi1 + " * 9 = " + (multi1*9));
        System.out.println(multi1 + " * 10 = " + (multi1*10));

        System.out.println("\nTask 7\n");
        System.out.println("Please enter measurement of one side of the square:");
        int side1 = scan.nextInt();
        System.out.println("The perimeter of the square = " + (side1 * 4));
        System.out.println("The area of the square = " + (side1 * side1));
    }
}

package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nTask 1\n");

        System.out.println("Please enter 2 numbers");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.println("The number1 entered by user = " + number1);
        System.out.println("The number2 entered by user = " + number2);
        System.out.println("The sum of number 1 and 2 entered by user = "+ (number1 + number2));

        System.out.println("\nTask 2\n");

        System.out.println("Please enter 2 numbers");
        double number3 = scan.nextDouble();
        double number4 = scan.nextDouble();
        System.out.println("The number3 entered by user = " + number3);
        System.out.println("The number4 entered by user = " + number4);
        System.out.println("The division of number 1 and 2 entered by user = "+ (number3 / number4));

        System.out.println("\nTask 3\n");

        int one = -10 + 7 * 5;
        System.out.println("1. " + one);

        int two = (72+24) % 24;
        System.out.println("2. " + two);

        int three = 10 + -3*9 / 9;
        System.out.println("3. " + three);

        int four = 5 + 18 / 3 * 3 - (6 % 3);
        System.out.println("4. " + four);

        System.out.println("\ntask 4\n");

        System.out.println("Please enter two floating numbers: ");
        double input1 = scan.nextDouble();
        double input2 = scan.nextDouble();
        System.out.println("The sum of the given numbers is = " + (input1 + input2));
        System.out.println("The product of the given numbers is = " + (input1 * input2));
        System.out.println("The subtraction of the given numbers is = " + (input1 - input2));
        System.out.println("The division of the given numbers is = " + (input1 / input2));
        System.out.println("The remainder of the given numbers is = " + (input1 % input2));

        System.out.println("\nTask 5\n");

        double width = 7.5;
        double height = 10.5;
        System.out.println("The area of the rectangle = " + (width * height));

        System.out.println("\nTask 6\n");

        double salary = 90000;
        System.out.println("A software engineer in test can earn " + (salary * 3) + " in 3 years.");

    }
}

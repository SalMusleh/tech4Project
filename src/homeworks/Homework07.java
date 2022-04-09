package homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {


        System.out.println("\n\nTask1\n\n");

        int rand1 = 0 + (int) (Math.random() * 11);
        System.out.println("Number 1 = " + rand1);
        int rand2 = 0 +  (int) (Math.random() * 11);
        System.out.println("Number 2 = " + rand2);
        int rand3 = 0 + (int) (Math.random() * 11);
        System.out.println("Number 3 = " + rand3);
        int rand4 = 0 + (int) (Math.random() * 11);
        System.out.println("Number 4 = " + rand4);

        int num1 = Math.abs(rand1-5);
        int num2 = Math.abs(rand2-5);
        int num3 = Math.abs(rand3-5);
        int num4 = Math.abs(rand4-5);

        System.out.println("Absolute difference of " + rand1 + " with 5 is = " + num1);
        System.out.println("Absolute difference of " + rand2 + " with 5 is = " + num2);
        System.out.println("Absolute difference of " + rand3 + " with 5 is = " + num3);
        System.out.println("Absolute difference of " + rand4 + " with 5 is = " + num4);

        int ab = Math.max(num1, num2);
        int cd = Math.max(num3, num4);
        int all = Math.max(ab, cd);

        System.out.println("Greatest number is = " + all);

        int ba = Math.min(num1, num2);
        int dc = Math.min(num3, num4);
        int all2 = Math.min(ba, dc);

        System.out.println("Smallest number is = " + all2);

        System.out.println("\n\nTask2\n\n");

        int random1 = -50 + (int) (Math.random() * 51);
        System.out.println("Number 1 = " + random1);
        int random2 = -50 + (int) (Math.random() * 51);
        System.out.println("Number 2 = " + random2);
        int random3 = -50 + (int) (Math.random() * 51);
        System.out.println("Number 3 = " + random3);
        int random4 = -50 + (int) (Math.random() * 51);
        System.out.println("Number 4 = " + random4);
        int random5 = -50 + (int) (Math.random() * 51);
        System.out.println("Number 5 = " + random5);
        int random6 = -50 + (int) (Math.random() * 51);
        System.out.println("Number 6 = " + random6);
        int random7 = -50 + (int) (Math.random() * 51);
        System.out.println("Number 7 = " + random7);
        int random8 = -50 + (int) (Math.random() * 51);
        System.out.println("Number 8 = " + random8);

        int aa = Math.max(Math.max(random1, random2), Math.max(random3, random4));
        int bb = Math.max(Math.max(random5, random6), Math.max(random7, random8));
        int overall = Math.max(aa, bb);

        System.out.println("Greatest number is = " + overall);

        int aA = Math.min(Math.max(random1, random2), Math.max(random3, random4));
        int bB = Math.min(Math.max(random5, random6), Math.max(random7, random8));
        int overall2 = Math.min(aA, bB);

        System.out.println("Smallest number is = " + overall2);

        System.out.println("Average of 8 numbers is = " + (random1+random2+random3+random4+
                random5+random6+random7+random8));
        System.out.println("Absolute difference between smallest and greatest is = " +
                Math.abs(overall - overall2));

        if (random3 > 0) {
            System.out.println("3rd number is positive = true");
        }else {
            System.out.println("3rd number is negative = false");
        }if (random5 > 0 ) {
            System.out.println("5th number is positive = true");
        } else {
            System.out.println("5th number is negative = false");
        }

        System.out.println("\n\nTask3\n\n");

        Scanner ask = new Scanner(System.in);

        System.out.println("Enter 7 numbers between 0 and 50: ");
        int number1 = 0 + (int)(Math.random() * 51);
        System.out.println("Number 1 = " + number1);
        int number2 = 0 + (int)(Math.random() * 51);
        System.out.println("Number 2 = " + number2);
        int number3 = 0 + (int)(Math.random() * 51);
        System.out.println("Number 3 = " + number3);
        int number4 = 0 + (int)(Math.random() * 51);
        System.out.println("Number 4 = " + number4);
        int number5 = 0 + (int)(Math.random() * 51);
        System.out.println("Number 5 = " + number5);
        int number6 = 0 + (int)(Math.random() * 51);
        System.out.println("Number 6 = " + number6);
        int number7 = 0 + (int)(Math.random() * 51);
        System.out.println("Number 7 = " + number7);

        int max = Math.max(Math.max(number1, number2), Math.max(number3, number4));
        int max1 = Math.max(Math.max(number5, number6),number7);
        int maxOver = Math.max(max, max1);

        System.out.println("Greatest number is = " + maxOver);

        int min = Math.min(Math.min(number1, number2), Math.min(number3, number4));
        int min1 = Math.min(Math.max(number5, number6),number7);
        int minOver = Math.min(min, min1);

        System.out.println("Smallest number is = " + minOver);

        System.out.println("Average of 7 numbers is = " + (number1+number2+number3+number4+number5+number6+number7) / 7);

        if (number1 >= 10){
            System.out.println("First number is greater than or equal to 10 = true");
        }else {
            System.out.println("First number is greater than or equal to 10 = false");
        }
        if (number7 <= 40){
            System.out.println("Last number is less then or equal to 40 = true");
        }else {
            System.out.println("Last number is less then or equal to 40 = false");
        }
        if (number1 + number7 > 25){
            System.out.println("Both first and last numbers are greater than 25 = true");
        }else {
            System.out.println("Both first and last numbers are greater than 25 = false");
        }
        if (number1+number2+number3+number4+number5+number6+number7 == (0|50)){
            System.out.println("At least on of those numbers is 0 or 50 = true");
        }else {
            System.out.println("At least on of those numbers is 0 or 50 = false");
        }

        System.out.println("\n\nTask4\n\n");        int one = 0 + (int)(Math.random() * 101);
        System.out.println(one);
        int two = 0 + (int)(Math.random() * 101);
        System.out.println(two);
        int three = 0 + (int)(Math.random() * 101);
        System.out.println(three);

        if (one + two + three > 25){
            System.out.println("True");
        }
        if (one + two + three <= 25){
            System.out.println("false");
        }

        System.out.println("\n\nTask5\n\n");
        System.out.println("Enter a number between 1 and 7 both included: ");
        int day = ask.nextInt();

        switch (day) {
            case 1:
                System.out.println("This number entered returns MONDAY");
                break;
            case 2:
                System.out.println("This number entered returns TUESDAY");
                break;
            case 3:
                System.out.println("This number entered returns WEDNESDAY");
                break;
            case 4:
                System.out.println("This number entered returns THURSDAY");
                break;
            case 5:
                System.out.println("This number entered returns FRIDAY");
                break;
            case 6:
                System.out.println("This number entered returns SATURDAY");
                break;
            case 7:
                System.out.println("This number entered returns SUNDAY");
                break;
            default:
                System.out.println("This is not representing a day");
        }

        System.out.println("\n\nTask6\n\n");

        System.out.println("Enter a number between -10 and 10 both included:");
        int uno = ask.nextInt();

        if (uno > 0){
            System.out.println("Number is POSITIVE");
        }else {
            System.out.println("Number entered is NEGATIVE");
        }
        if (uno == 0){
            System.out.println("Number enter is ZERO");
        }
        if (uno % 2 == 0){
            System.out.println("Number entered is EVEN");
        }else {
            System.out.println("Number entered is ODD");
        }

        System.out.println("\n\nTask7\n\n");
        System.out.println("Tell me your exam results?");

        int exam1 = ask.nextInt();
        int exam2 = ask.nextInt();
        int exam3 = ask.nextInt();

        int avg = (exam1 + exam2 + exam3) / 3;

        if (avg >= 70) {
            System.out.println("YOU PASSED");
        }else {
            System.out.println("YOU FAILED");
        }

        System.out.println("\n\nTask8\n\n");

        System.out.println("Enter 3 numbers");

        int the = ask.nextInt();
        int last = ask.nextInt();
        int stretch = ask.nextInt();

        if (the == last && last == stretch) {
            System.out.println("TRIPLE MATCH");
        } else if (the == last || last == stretch || stretch == the){
            System.out.println("DOUBLE MATCH");
        } else {
            System.out.println("NO MATCH");
        }

    }

}
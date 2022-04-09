package homeworks;

import utilities.MyMethods;
import utilities.RandomNumberGenerator;
import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        System.out.println("TASK1\n");

        int rand1 = RandomNumberGenerator.getRandomNumber(0, 50);
        System.out.println(rand1);

        if (rand1 >= 10 && rand1 <= 25) {
            System.out.println("rand1 is in between 10 and 25");
        } else {
            System.out.println("rand1 is not in between 10 and 25");
        }

        System.out.println("\nTASK2\n");

        int rand2 = RandomNumberGenerator.getRandomNumber(1, 100);

        if (rand2 <= 50){
            System.out.println("1st half is " + rand2);

            if (rand2 <= 25){
                System.out.println(rand2 + " is in 1st quarter");
            }else{
                System.out.println(rand2 + " is in 2nd quarter");
            }

        }else{
            System.out.println("2nd half is " + rand2);

            if (rand2 <= 75){
                System.out.println(rand2 + " is in 3rd quarter");
            }else{
                System.out.println(rand2 + " is in 4th quarter");
            }

        }

        System.out.println("\nTASK3\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter 5 Numbers");
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt(), num4 = scan.nextInt(), num5 = scan.nextInt();

        int points = 0;

        if (num1 >= 1 && num1 <= 10) {
            points += num1 * 5;
        }

        if (num2 >= 1 && num2 <= 10) {
            points += num2 * 4;
        }

        if (num3 >= 1 && num3 <= 10) {
            points += num3 * 3;
        }

        if (num4 >= 1 && num4 <= 10) {
            points += num4 * 2;
        }

        if (num5 >= 1 && num5 <= 10) {
            points += num5;
        }

        System.out.println(points);


    }
}

package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
//        System.out.println("\nTask 1\n");
//        System.out.println("Please enter 3 numbers:");
//        int maxMin1 = scan.nextInt();
//        int maxMin2 = scan.nextInt();
//        int maxMin3 = scan.nextInt();
//        int max = Math.max(Math.max(maxMin1, maxMin2), maxMin3);
//        int min = Math.min(Math.min(maxMin1, maxMin2), maxMin3);
//        System.out.println("Max value = " + max);
//        System.out.println("Min value = " + min);
//
//        System.out.println("\nTask 2\n");
//        System.out.println("Please enter 5 numbers:");
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int num3 = scan.nextInt();
//        int num4 = scan.nextInt();
//        int num5 = scan.nextInt();
//        int max1 = Math.max((Math.max((Math.max(num1, num2)), (Math.max(num3, num4)))), num5);
//        int min1 = Math.min((Math.min((Math.min(num1, num2)), (Math.min(num3, num4)))), num5);
//        System.out.println("Max value = " + max1);
//        System.out.println("Min value = " + min1);
//
//        System.out.println("\nTask 3\n");
//        System.out.println("Please enter 2 numbers:");
//        int abs1 = scan.nextInt();
//        int abs2 = scan.nextInt();
//        System.out.println("The difference between numbers is = " + (Math.abs(abs1-abs2)));

        System.out.println("\n Task 4 \n");
        int random1 = (int)(Math.random() * 50) + 50;
        int random2 = (int)(Math.random() * 50) + 50;
        int random3 = (int)(Math.random() * 50) + 50;
        int sum = random1 + random2 + random3;
        System.out.println("Number 1 = " + random1 + "\n"
                + "Number 2 = " + random2 + "\n" + "Number 3 = " + random3 + "\n" +
                "The sum numbers is = " + sum );

        System.out.println("\n Task 5 \n");
        double alex = 125;
        double mike = 220;
        double alexDif = alex - 25.50;
        double mikeSum = mike + 25.50;
        System.out.println("Alex's money: $"+alexDif);
        System.out.println("Mike's money: $"+mikeSum);

        System.out.println("\n Task 6 \n");
        double saveGoal = 390;
        double perDay = 15.60;
        int days = (int)(saveGoal/perDay);
        System.out.println(days);
    }
}

package mathClass;

import java.util.Scanner;

public class ExerciseMaxAndMin {
    public static void main(String[] args) {
        int  x = 4, y = 67, z = -54;

        Math.max(x, y); // 67

        System.out.println("Max of every number is = " +
                Math.max(Math.max(x, y), z)); // 67, -54

        System.out.println("Min of every number is = " +
                Math.min(Math.min(x, y), z)); // 67, -54

        /*
        write a program which is going to print the max of given 3 numbers
        4, 56, 23
         */

        System.out.println("Max of given 3 numbers are = " + Math.max(Math.max(4, 56), 23));

        /*
        write a program which is going to ask 4 numbers print the max of retrieved 4 numbers.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 4 numbers");
        //int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt(), num4 = scan.nextInt();

        //System.out.println("Max of retrieved 4 numbers = "+ Math.max(Math.max(Math.max(num1, num2),num3),num4));

        System.out.println("Max of retrieved 4 numbers = "+ Math.max(Math.max(Math.max(scan.nextInt(), scan.nextInt()), scan.nextInt()), scan.nextInt()));

        System.out.println("Min of retrieved 4 numbers = "+ Math.min(Math.min(Math.min(scan.nextInt(), scan.nextInt()), scan.nextInt()), scan.nextInt()));


    }
}

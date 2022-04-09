package homeworks;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("\n------------TASK-1------------\n");
        for (int i = 1; i <= 100; i++) {
            if(i % 7 == 0) System.out.print(i + " ");
            if(i % 7 == 0 && i != 98) System.out.print ("- ");
        }
        System.out.println("\n------------TASK-2------------\n");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0 && i % 3 == 0) System.out.print(i + " ");
            if (i % 2 == 0 && i % 3 == 0 && i != 48) System.out.print("- ");
        }
        System.out.println("\n------------TASK-3------------\n");
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) System.out.print(i + " ");
            if (i % 5 == 0 && i != 50) System.out.print("- ");
        }
        System.out.println("\n------------TASK-4------------\n");
        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of "+ i + " is = " + (i * i));
        }
        System.out.println("\n------------TASK-5------------\n");
        int num = 0;
        for (int i = 1; i <= 10; i++) {
            num += i;
        }System.out.println(num);
        System.out.println("\n------------TASK-6------------\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Positive Number");
        int num1 = scan.nextInt();
        scan.nextLine();
        int fact = 1;
        for (int i = 1; i <= num1; i++) {
            fact *= i;
        }
        System.out.println(fact);
        System.out.println("\n------------TASK-7------------\n");
        System.out.println("Enter your first and last name");
        String name = scan.nextLine();
        int vowels = 0;
        for (int i = 0; i < name.length(); i++) {
            if(name.toLowerCase().charAt(i) =='a'|| name.charAt(i) == 'e'||name.charAt(i) =='i'||name.charAt(i) =='o'||name.charAt(i) =='u')vowels++;
        }
        System.out.println("There are "+vowels+" vowel letters in this full name");

        System.out.println("\n------------TASK-8------------\n");
        int number;
        System.out.println("Please enter a number:") ;
        number = scan.nextInt();
        if (number >= 100) {
            System.out.println("This number is already more than 100");
        } else {
            do {
                System.out.println("Please enter a number:");
                int number1 = scan.nextInt();
                number += number1;
            }
            while (number < 100);
            System.out.println("Sum of entered numbers is at least 100");
        }
        System.out.println("\n------------TASK-9------------\n");
        int first = 0;
        int second = 1;
        String result = "";

        System.out.println("Please enter a number: ");
        int numFibonacci = scan.nextInt();

        for (int i = 0; i < numFibonacci; i++) {
            result += first + " - ";
            int sumOfFirstAndSecond = first + second;
            first = second;
            second = sumOfFirstAndSecond;
        }
            System.out.println(result.substring(0, result.length()-3));
            scan.nextLine();
        System.out.println("\n------------TASK-10------------\n");
        System.out.println("Please enter a name:");
        String name1 = scan.nextLine();
        if(name1.toLowerCase().charAt(0) == 'j'){
            System.out.println("End of program");
        } else {
            do {
                System.out.println("Please enter a name: ");
                name1 = scan.nextLine();
            }
            while (name1.toLowerCase().charAt(0) != 'j');
            System.out.println("End of program");
        }
    }
}

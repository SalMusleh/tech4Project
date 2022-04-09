package homeworks;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("\n------------TASK-1------------\n");
        for (int i = 1; i <= 10; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
        System.out.println("\n------------TASK-2------------\n");
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        boolean firstPositive = false;
        boolean firstNegative = false;

        for (int number : numbers) {
            if (number > 0 && !firstPositive) {
                firstPositive = true;
                System.out.println("First Positive number is: " + number);
            } else if (number < 0 && !firstNegative) {
                firstNegative = true;
                System.out.println("First Negative number is: " + number);
            }

            if (firstPositive && firstNegative) break;
        }
        System.out.println("\n------------TASK-3------------\n");
        int[] randNum = new int[5];

        for (int i = 0; i < randNum.length; i++) {
            randNum[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println("Numbers Generated: " + Arrays.toString(randNum));
        for (int rand: randNum) {
            if (rand == 2 || rand == 3){
                System.out.println(true);
            }
            else System.out.println(false);
        }


        System.out.println("\n------------TASK-4------------\n");
        String[] lists = {"banana","orange","Apple"};
        boolean hasApple = false;

        for (String list : lists) {
            if (list.equalsIgnoreCase("apple")) {
                hasApple = true;
                break;
            }
        }
        System.out.println(hasApple);

        System.out.println("\n------------TASK-5------------\n");
        int[] numbers13_1 = {10, 20, 30, 50, 70};
        int[] numbers13_2 = {20, 50, 70, 100, 300};
        String duplicates13 = "";

        for (int j : numbers13_1) {
            for (int k : numbers13_2) {
                if (j == k) {
                    if (!duplicates13.contains(String.valueOf(k))) {
                        duplicates13 += (k + " ");
                        break;
                    }
                }
            }
        }
        if (duplicates13.length() < 1) System.out.println("There is no matching elements");
        System.out.println(duplicates13);

        System.out.println("\n------------TASK-6------------\n");
        String str = "baNana";
        String duplicates = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)){
                    if (!duplicates.contains(String.valueOf(str.charAt(j)))){
                        duplicates += str.charAt(j);

                    }
                }
            }
        }
        System.out.println(duplicates);



    }
}

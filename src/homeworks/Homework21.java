package homeworks;

import java.util.Arrays;

public class Homework21 {
    //////////////////////////////////TASK-1//////////////////////////////////
    public static void fizzBuzz1(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
    //////////////////////////////////TASK-2//////////////////////////////////
    public static String fizzBuzz2(int num){
        String s = "";
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) s = "FizzBuzz";
            else if (i % 3 == 0) s = "Fizz";
            else if (i % 5 == 0) s = "Buzz";
            else s = String.valueOf(num);
        }
        return s;
    }

    //////////////////////////////////TASK-3//////////////////////////////////
    public static int findSumNumbers(String s){
        int sum = 0;
        String temp = "0";
        for (int i = 0; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i))) temp += s.charAt(i);
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }return sum + Integer.parseInt(temp);
    }


    //////////////////////////////////TASK-4//////////////////////////////////
    public static int findBiggestNumber(String str) {
        int largest = Integer.MIN_VALUE;
        String s = str.replaceAll("[^0-9]"," ");
        String[] arr = s.split(" ");
        for (String a : arr) {
            if(!a.isEmpty()){
                if(Integer.parseInt(a) > largest){
                    largest = Integer.parseInt(a);
                    return largest;
                }
            }
        }
        return 0;
    }
    //////////////////////////////////TASK-5//////////////////////////////////
    public static String countSequenceOfCharacters(String str) {
        String s = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (!s.contains(str.charAt(i) + "")) {
                s += str.charAt(i);
                s += count;
                count = 1;
            }
        }
        return s;
    }




    public static void main(String[] args) {
        fizzBuzz1(15);
        System.out.println(fizzBuzz2(15));
        System.out.println(findSumNumbers("ab110 c045d%"));
        System.out.println(findBiggestNumber("avs#$"));
        System.out.println(countSequenceOfCharacters("aaAAa "));
    }
}

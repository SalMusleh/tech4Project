package homeworks;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Homework18 {
    //////////////////////////////////TASK-1//////////////////////////////////
    public static String noSpace(String str) {
        return str.replace(" ", "");
    }

    //////////////////////////////////TASK-2/////////////////////////////////
    public static String replaceFirstLast(String str) {
        if (str.trim().length() < 2)
            return "";
        str = str.trim();
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    //////////////////////////////////TASK-3/////////////////////////////////
    public static boolean hasVowel(String str) {
        boolean hasVowel = false;
        String vowels = "aeouiAEOUI";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) >= 0) {
                hasVowel = true;
                break;
            }
        }
        return hasVowel;
    }

    //////////////////////////////////TASK-4/////////////////////////////////
    public static void checkAge(int yearOfBirth) {
        LocalDateTime currentDate = LocalDateTime.now();
        int currentYear = currentDate.getYear();

        if (yearOfBirth >= currentYear || currentYear - yearOfBirth >= 100) System.out.println("AGE IS NOT VALID");
        else if (currentYear - yearOfBirth >= 16) System.out.println("AGE IS ALLOWED");
        else System.out.println("AGE IS NOT ALLOWED");
    }

    //////////////////////////////////TASK-5/////////////////////////////////
    public static int averageOfEdges(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        return (max + min) / 2;
    }

    //////////////////////////////////TASK-6/////////////////////////////////
    public static String[] noA(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().startsWith("a")) arr[i] = arr[i] = "###";
        }
        return arr;
    }

    //////////////////////////////////TASK-7/////////////////////////////////
    public static int[] no3or5(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 15 == 0) arr[i] = 101;
            else if (arr[i] % 5 == 0) arr[i] = 99;
            else if (arr[i] % 3 == 0) arr[i] = 100;
        }
        return arr;
    }

    //////////////////////////////////TASK-8/////////////////////////////////
    public static int countPrimes(int[] numbers) {
        int primeCounter = 0;

        for (int number : numbers) {
            boolean isPrime = true;
            for (int j = 2; j <= number - 1; j++) {
                if (number <= 1 || number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primeCounter++;
        }
        return primeCounter;
    }

    public static void main(String[] args) {

        System.out.println("\n------------🦙TASK-1🦙------------\n");
        System.out.println(noSpace(""));
        System.out.println(noSpace("Java"));
        System.out.println(noSpace("  Hello  "));
        System.out.println(noSpace(" Hello World  "));
        System.out.println(noSpace("Tech Global"));


        System.out.println("\n------------🦙TASK-2🦙------------\n");
        System.out.println(replaceFirstLast(""));
        System.out.println(replaceFirstLast("A"));
        System.out.println(replaceFirstLast("  A  "));
        System.out.println(replaceFirstLast("Hello"));
        System.out.println(replaceFirstLast("Tech Global"));


        System.out.println("\n------------🦙TASK-3🦙------------\n");
        System.out.println(hasVowel(""));
        System.out.println(hasVowel("Java"));
        System.out.println(hasVowel("1234"));
        System.out.println(hasVowel("ABC"));


        System.out.println("\n------------🦙TASK-4🦙------------\n");
        checkAge(2006);
        checkAge(2005);
        checkAge(2050);
        checkAge(1920);
        checkAge(1800);


        System.out.println("\n------------🦙TASK-5🦙------------\n");
        System.out.println(averageOfEdges(0, 0, 0));
        System.out.println(averageOfEdges(0, 0, 6));
        System.out.println(averageOfEdges(-2, -2, 10));
        System.out.println(averageOfEdges(-3, 15, -3));
        System.out.println(averageOfEdges(10, 13, 20));


        System.out.println("\n------------🦙TASK-6🦙------------\n");
        String[] arr = {"java", "hello", "123", "xyz"};
        System.out.println(Arrays.toString(noA(arr)));

        String[] arr1 = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(arr1)));

        String[] arr2 = {"apple", "appium", "ABC", "Alex", "A"};
        System.out.println(Arrays.toString(noA(arr2)));


        System.out.println("\n------------🦙TASK-7🦙------------\n");
        int[] arr3 = {7, 4, 11, 23, 17};
        System.out.println(Arrays.toString(no3or5(arr3)));

        int[] arr4 = {3, 4, 5, 6};
        System.out.println(Arrays.toString(no3or5(arr4)));

        int[] arr5 = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(arr5)));

        System.out.println("\n------------🦙TASK-8🦙------------\n");
        int[] nums = {-10, -3, 0, 1};
        System.out.println(countPrimes(nums));

        int[] nums1 = {7, 4, 11, 23, 17};
        System.out.println(countPrimes(nums1));

        int[] nums2 = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(nums2));
    }
}

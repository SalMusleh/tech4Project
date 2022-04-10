package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework16 {
    /////////////////////////////////////////////Task1////////////////////////////////////////////
    public static int countWords(String str) {
        str = str.trim();
        int countSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) countSpace++;
        }
        return countSpace + 1;
    }



    /////////////////////////////////////////////Task2////////////////////////////////////////////
    public static int countA(String str) {
        int countA = 0;
        for (int i = 0; i <str.length(); i++) {
            if (str.toUpperCase().charAt(i) == 'A') countA++;
        }
        return countA;
    }


    /////////////////////////////////////////////Task3////////////////////////////////////////////
    public static int countPos(ArrayList<Integer> numbers) {
        int countPos = 0;
        for (int number : numbers) {
            if (number > 0) countPos++;
        }
        return countPos;
    }


    /////////////////////////////////////////////Task4////////////////////////////////////////////
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> nums){
        ArrayList<Integer> noDups = new ArrayList<>();

        for (int num : nums) {
            if (!noDups.contains(num)) noDups.add(num);
        }
        return noDups;
    }


    /////////////////////////////////////////////Task5////////////////////////////////////////////
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> elements){
        ArrayList<String> noDups = new ArrayList<>();

        for (String element : elements) {
            if (!noDups.contains(element)) noDups.add(element);
        }
        return noDups;
    }


    /////////////////////////////////////////////Task6////////////////////////////////////////////
    public static String removeExtraSpaces(String str) {
        str = str.trim();

        String noSpace = "";
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i) != ' ' || str.charAt(i + 1) != ' ') noSpace += str.charAt(i);
        }
        return noSpace;
    }


    /////////////////////////////////////////////Task7////////////////////////////////////////////
    public static int[] add(int[] nums1, int[] nums2) {
        int[] sumArr = nums1.length >= nums2.length ? nums1 : nums2;

        for (int i = 0; i < Math.min(nums1.length, nums2.length); i++) {
            sumArr[i] = nums1[i] + nums2[i];
        }
        return sumArr;
    }

    /////////////////////////////////////////////Task8////////////////////////////////////////////
    public static int findClosestTo10(int[] nums) {
        Arrays.sort(nums);
        int Closest1 = Integer.MIN_VALUE;
        int Closest2 = Integer.MAX_VALUE;

        for(int num : nums){
            if(num < 10 && num > Closest1) Closest1 = num;
            else if(num > 10 && num < Closest2) Closest2 = num;
        }
        if(10 - Closest1 <= Closest2 - 10) return Closest1;
        return Closest2;
    }

    public static void main(String[] args) {
        System.out.println("\n------------🦙TASK-1🦙------------\n");
        System.out.println(countWords("      Java is fun       "));
        System.out.println(countWords("Selenium is the most common UI automation tool. "));


        System.out.println("\n------------🦙TASK-2🦙------------\n");
        System.out.println(countA("TechGlobal is a QA bootcamp"));
        System.out.println(countA("QA stands for Quality Assurance"));


        System.out.println("\n------------🦙TASK-3🦙------------\n");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println(countPos(numbers));
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123));
        System.out.println(countPos(numbers1));

        System.out.println("\n------------🦙TASK-4🦙------------\n");
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println(removeDuplicateNumbers(numbers2));
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(1, 2, 5, 2, 3));
        System.out.println(removeDuplicateNumbers(numbers3));

        System.out.println("\n------------🦙TASK-5🦙------------\n");
        ArrayList<String> elements = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(removeDuplicateElements(elements));
        ArrayList<String> elements1 = new ArrayList<>(Arrays.asList("abc", "xyz", "123", "ab", "abc", "ABC"));
        System.out.println(removeDuplicateElements(elements1));

        System.out.println("\n------------🦙TASK-6🦙------------\n");
        System.out.println(removeExtraSpaces("  I   am      learning     Java     "));
        System.out.println(removeExtraSpaces("Java  is fun    "));

        System.out.println("\n------------🦙TASK-7🦙------------\n");
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(add(arr1, arr2)));

        int[] arr3 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        int[] arr4 = {10, 3, 6, 3, 2};
        System.out.println(Arrays.toString(add(arr3, arr4)));

        System.out.println("\n------------🦙TASK-8🦙------------\n");
        int[] numbers4 = {10, -13, 5, 70, 15, 57};
        System.out.println(findClosestTo10(numbers4));
        int[] numbers5 = {10, -13, 8, 12, 15, -20};
        System.out.println(findClosestTo10(numbers5));
    }
}

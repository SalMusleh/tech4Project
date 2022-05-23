package homeworks;

import java.util.Arrays;
import java.util.Vector;

public class Homework19 {
    //////////////////////////////////TASK-1//////////////////////////////////
    public static String noDigit(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                result = result + str.charAt(i);
            }
        }
            return result;
    }

    //////////////////////////////////TASK-2//////////////////////////////////
    public static String noVowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    //////////////////////////////////TASK-3//////////////////////////////////
    public static int sumOfDigits(String str){
            int sum = 0;
            for(int i=0; i<str.length(); i++){
                if(Character.isDigit(str.charAt(i))){
                    sum+=str.charAt(i)-'0';
                }
            }
            return sum;
        }

    //////////////////////////////////TASK-4//////////////////////////////////
    public static boolean hasUpperCase(String str){
        for(int i=0;i < str.length();i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return true;
            }
        }
            return false;
    }

    //////////////////////////////////TASK-5//////////////////////////////////
    public static int middleInt(int a, int b, int c){
        if ((a < b && b < c) || (c < b && b < a))
            return b;
        else if ((b < a && a < c) || (c < a && a < b))
            return a;
        else
            return c;
    }

    //////////////////////////////////TASK-6//////////////////////////////////
    public static int[] no13(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }

    //////////////////////////////////TASK-7//////////////////////////////////
    public static int[] arrFactorial(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int fact = 1;
            for (int j = 2; j <= arr[i]; j++) {
                fact *= j;
            }
            arr[i] = fact;
        }
        return arr;
    }
    //////////////////////////////////TASK-8//////////////////////////////////
    public static String[] categorizeCharacters(String str) {
        String letters = "";
        String digits = "";
        String specials = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) letters += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) digits += str.charAt(i);
            else if (!Character.isLetterOrDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) specials += str.charAt(i);
        }
        return new String[]{letters, digits, specials};
    }

    public static void main(String[] args) {
        System.out.println("\n------------🦙TASK-1🦙------------\n");
        System.out.println(noDigit(""));
        System.out.println(noDigit("Java"));
        System.out.println(noDigit("123Hello"));
        System.out.println(noDigit("123Hello World149"));
        System.out.println(noDigit("123Tech456Global149"));


        System.out.println("\n------------🦙TASK-2🦙------------\n");
        System.out.println(noVowel(""));
        System.out.println(noVowel("xyz"));
        System.out.println(noVowel("JAVA"));
        System.out.println(noVowel("125$"));
        System.out.println(noVowel("TechGlobal"));


        System.out.println("\n------------🦙TASK-3🦙------------\n");
        System.out.println(sumOfDigits(""));
        System.out.println(sumOfDigits("Java"));
        System.out.println(sumOfDigits("John's age is 29"));
        System.out.println(sumOfDigits("$125.0"));


        System.out.println("\n------------🦙TASK-4🦙------------\n");
        System.out.println(hasUpperCase(""));
        System.out.println(hasUpperCase("java"));
        System.out.println(hasUpperCase("John's age is 29"));
        System.out.println(hasUpperCase("$125.0"));


        System.out.println("\n------------🦙TASK-5🦙------------\n");
        System.out.println(middleInt(1,1,1));
        System.out.println(middleInt(1, 2, 2));
        System.out.println(middleInt(5, 5, 8));
        System.out.println(middleInt(5, 3, 5));
        System.out.println(middleInt(-1, 25, 10));


        System.out.println("\n------------🦙TASK-6🦙------------\n");
        int[] arr1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(no13(arr1)));

        int[] arr2 = {13, 2, 3};
        System.out.println(Arrays.toString(no13(arr2)));

        int[] arr3 = {13, 13, 13, 13, 13};
        System.out.println(Arrays.toString(no13(arr3)));

        System.out.println("\n------------🦙TASK-7🦙------------\n");
        int[] arr4 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arrFactorial(arr4)));

        int[] arr5 = {0, 2, 4, 1};
        System.out.println(Arrays.toString(arrFactorial(arr5)));

        int[] arr6 = {5, 0, 6};
        System.out.println(Arrays.toString(arrFactorial(arr6)));

        System.out.println("\n------------🦙TASK-8🦙------------\n");
        System.out.println(Arrays.toString(categorizeCharacters("   ")));
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%")));

    }
}

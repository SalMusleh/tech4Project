package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {
    //////////////////////////////////TASK-1//////////////////////////////////
    public static boolean hasLowerCase(String str){
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) return true;
        }
        return false;
    }
    //////////////////////////////////TASK-2//////////////////////////////////
    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers){
        ArrayList<Integer> newList = new ArrayList<>();

        for (int number : numbers) {
            if(number != 0) newList.add(number);
        }
        return newList;
    }
    //////////////////////////////////TASK-3//////////////////////////////////
    public static int[][] numberAndSquare(int[] numbers){
        int[][] squared = new int[numbers.length][2];
        for(int i = 0; i < numbers.length; i++){
            squared[i][0] = numbers[i];
            squared[i][1] = numbers[i] * numbers[i];

        }
        return squared;
    }

    //////////////////////////////////TASK-4//////////////////////////////////
    public static boolean containsValue(String[] arr, String str) {
        for (String s1 : arr) {
            if (str.equals(s1))
                return true;
        }
        return false;
    }
    //////////////////////////////////TASK-5//////////////////////////////////
    public static String reverseSentence(String str){
        String[] str1 = str.split(" ");
        if(str1.length < 2) return "There is not enough words!";
        else {
            str1[0] = (str1[0].charAt(0) + "").toLowerCase() + str1[0].substring(1);
            str1[str1.length -1] = (str1[str1.length - 1].charAt(0) + "").toUpperCase() + str1[str1.length - 1].substring(1);
            String reverse = "";
            for(int i = str1.length - 1; i >= 0; i--){
                reverse += str1[i] + " ";
            }
            return reverse.substring(0,reverse.length()-1);
        }
    }
    //////////////////////////////////TASK-6//////////////////////////////////
    public static String removeStringSpecialsDigits(String str){
        String str1 = "";
        for(int i = 0; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i)) && (Character.isLetter(str.charAt(i))) || Character.isWhitespace(str.charAt(i))) str1 += str.charAt(i);
        }
        return str1;
    }
    //////////////////////////////////TASK-7//////////////////////////////////
    public static String[] removeArraySpecialsDigits(String[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i].replaceAll("[^a-zA-Z ]","");
        }
        return arr;
    }
    //////////////////////////////////TASK-8//////////////////////////////////
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> s1, ArrayList<String> s2){
        ArrayList<String> arr1 = new ArrayList<>();
        for(int i = 0; i < s1.size(); i++){
            for(int j = 0; j < s2.size(); j++){
                if(!arr1.contains(s1.get(i)) && s1.get(i).equals(s2.get(j))) arr1.add(s1.get(i));
            }
        }
        return arr1;
    }
    //////////////////////////////////TASK-9//////////////////////////////////
    public static ArrayList<String> noXInVariables(ArrayList<String> str){
        ArrayList<String> arr2 = new ArrayList<>();

        for (String s : str) {
            if(!s.toLowerCase().equals("x")){
                s = s.replaceAll("[xX]","");
                arr2.add(s);
            }
        }
        return arr2;
    }


    public static void main(String[] args) {
        System.out.println("\n------------🦙TASK-1🦙------------\n");
        System.out.println(hasLowerCase(""));
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("125$"));
        System.out.println(hasLowerCase("Hello"));


        System.out.println("\n------------🦙TASK-2🦙------------\n");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        System.out.println(noZero(nums));
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(1);
        nums1.add(10);
        System.out.println(noZero(nums1));
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.add(0);
        nums3.add(1);
        nums3.add(10);
        System.out.println(noZero(nums3));
        ArrayList<Integer> nums4 = new ArrayList<>();
        nums4.add(0);
        nums4.add(0);
        nums4.add(0);
        System.out.println(noZero(nums4));

        System.out.println("\n------------🦙TASK-3🦙------------\n");
        int[] num1 = {1,2,3};
        System.out.println(Arrays.deepToString(numberAndSquare(num1)));
        int[] num2 = {0,3,6};
        System.out.println(Arrays.deepToString(numberAndSquare(num2)));
        int[] num3 = {1,4};
        System.out.println(Arrays.deepToString(numberAndSquare(num3)));

        System.out.println("\n------------🦙TASK-4🦙------------\n");
        String[] str1 = {"abc", "foo", "java"};
        String st1 = "hello";
        System.out.println(containsValue(str1,st1));
        String[] str2 = {"abc", "def", "123"};
        String st2 = "Abc";
        System.out.println(containsValue(str2,st2));
        String[] str3 = {"abc", "def", "123", "Java", "Hello"};
        String st3 = "123";
        System.out.println(containsValue(str3,st3));

        System.out.println("\n------------🦙TASK-5🦙------------\n");
        System.out.println(reverseSentence("Hello"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));

        System.out.println("\n------------🦙TASK-6🦙------------\n");
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));

        System.out.println("\n------------🦙TASK-7🦙------------\n");
        String[] str4 = {"123Java", "#$%is", "fun"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(str4)));
        String[] str5 = {"Selenium", "123$%", "###"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(str5)));
        String[] str6 = {"Selenium", "123#$Cypress"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(str6)));

        System.out.println("\n------------🦙TASK-8🦙------------\n");
        ArrayList<String> str7 = new ArrayList<>();
        str7.add("Java");
        str7.add("is");
        str7.add("fun");
        ArrayList<String> str8 = new ArrayList<>();
        str8.add("Java");
        str8.add("C#");
        str8.add("Python");
        System.out.println(removeAndReturnCommons(str7,str8));

        ArrayList<String> str9 = new ArrayList<>();
        str9.add("Java");
        str9.add("C#");
        str9.add("C#");
        ArrayList<String> str10 = new ArrayList<>();
        str10.add("Python");
        str10.add("C#");
        str10.add("C++");
        System.out.println(removeAndReturnCommons(str9,str10));

        System.out.println("\n------------🦙TASK-9🦙------------\n");
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("abc");
        arr1.add("123");
        arr1.add("#$%");
        System.out.println(noXInVariables(arr1));

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("xyz");
        arr2.add("123");
        arr2.add("#$%");
        System.out.println(noXInVariables(arr2));

        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("x");
        arr3.add("123");
        arr3.add("#$%");
        System.out.println(noXInVariables(arr3));

        ArrayList<String> arr4 = new ArrayList<>();
        arr4.add("xyXyxy");
        arr4.add("Xx");
        arr4.add("ABC");
        System.out.println(noXInVariables(arr4));

    }
}

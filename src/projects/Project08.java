package projects;

import java.util.ArrayList;
import java.util.Iterator;

public class Project08 {
    /////////////////////////////////////////////Task1////////////////////////////////////////////
    public static int countMultipleWords(String[] words){
        int multiWords = 0;
        for (String word : words) {
            if (word.trim().contains(" ")) multiWords++;
        }
        return multiWords;
    }

    /////////////////////////////////////////////Task2////////////////////////////////////////////
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){

        numbers.removeIf(element -> element < 0);
        return numbers;
    }

    /////////////////////////////////////////////Task3////////////////////////////////////////////
    public static boolean validatePassword(String passwords) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpec = false;
        boolean hasDigit = false;
        if (passwords.length() > 7 && passwords.length() < 17 && !passwords.contains(" ")) {
            for (Character c : passwords.toCharArray()) {
                if (Character.isUpperCase(c)) hasUpper = true;
                else if (Character.isDigit(c)) hasDigit = true;
                else if (Character.isLowerCase(c)) hasLower = true;
                else if (!(Character.isDigit(c) && Character.isLetter(c))) hasSpec = true;
            }
        } else return false;

        return hasLower && hasUpper && hasSpec && hasDigit;
    }
    /////////////////////////////////////////////Task4////////////////////////////////////////////
    public static boolean validateEmailAddress(String email) {
        int atCounter = 0, beforeAt = 0, afterAt = 0, afterDot = 0;
        boolean dotCounter = false;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') atCounter++;
            else if (email.charAt(i) == '.' && atCounter == 1) dotCounter = true;
            if (atCounter == 0) beforeAt++;
            else if (atCounter == 1 && !dotCounter && email.charAt(i) != '@') afterAt++;
            else if (atCounter == 1 && dotCounter && email.charAt(i) != '.') afterDot++;
    }
        return (atCounter == 1 && beforeAt > 1 && afterAt > 1 && afterDot > 1 && !email.contains(" "));
    }
    public static void main(String[] args) {
        System.out.println("\n------------🦙TASK-1🦙------------\n");
        String[] multi = {"foo", "", " ", "foo bar", "java is fun", " ruby"};
        System.out.println(countMultipleWords(multi));

        System.out.println("\n------------🦙TASK-2🦙------------\n");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(-5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(-10);
        numbers.add(-78);
        numbers.add(0);
        numbers.add(15);
        System.out.println(removeNegatives(numbers));

        System.out.println("\n------------🦙TASK-3🦙------------\n");
        System.out.println(validatePassword(""));
        System.out.println(validatePassword("abcd"));
        System.out.println(validatePassword("abcd1234"));
        System.out.println(validatePassword("Abcd1234"));
        System.out.println(validatePassword("Abcd123!"));

        System.out.println("\n------------🦙TASK-4🦙------------\n");
        System.out.println(validateEmailAddress("a@gmail.com"));
        System.out.println(validateEmailAddress("abc@g.com"));
        System.out.println(validateEmailAddress("abc@gmail.c"));
        System.out.println(validateEmailAddress("abc@@gmail.com"));
        System.out.println(validateEmailAddress("abcd@gmail.com"));

    }
}

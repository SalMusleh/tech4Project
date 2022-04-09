package homeworks;

import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {
        System.out.println("\n------------TASK-1------------\n");
        int[] arr = { 0, -4, -7, 0, 5, 10, 45, 45};
        String dupl = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dupl += arr[j];

                }
            }break;
        }
        if (dupl.length() > 0) System.out.println(dupl);
        else System.out.println("There is no duplicate");

        System.out.println("\n------------TASK-2------------\n");
        String[] words = {"Z", "abc", "z", "123", "#"};
        String duplic = "";

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    duplic += words[j];
                }
            } break;
        }
        if (duplic.length() > 0) System.out.println(duplic);
        else System.out.println("There is no duplicate");
        System.out.println("\n------------TASK-3------------\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
        System.out.println("\n------------TASK-4------------\n");
        String[] words5 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        String duplicate = "";
        for (int i = 0; i < words5.length; i++) {
            for (int j = i + 1; j < words5.length; j++) {
                if (words5[i].equalsIgnoreCase(words5[j])) {
                    if(!duplicate.contains(words5[j])){
                        duplicate += words5[j] + "\n";
                    }
                }
            }
        }
        if (duplicate.length() > 0) System.out.println(duplicate);
        else System.out.println("There is no duplicate");

        System.out.println("\n------------TASK-5------------\n");
        String[] words1 = {"abc", "foo", "bar"};
        String reverse = "";
        for (int i = words1.length - 1; i >= 0; i--){
            reverse += words1[i];
        }
            System.out.print(reverse);

        System.out.println("\n------------TASK-6------------\n");
        String words3 = "Java is fun";
        String[] words2 = words3.split(" ");
        String reversedString = "";
        for (int i = 0; i < words2.length; i++) {
            String word = words2[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(reversedString);

    }
}

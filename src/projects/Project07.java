package projects;

import java.util.Arrays;
import java.util.Scanner;

public class Project07 {
    /////////////////////////////////////////////Task1////////////////////////////////////////////
    public static void findGreatestAndSmallestWithSort(int[] nums) {
        Arrays.sort(nums);
        int greatest = nums[nums.length-1];
        int smallest = nums[0];

        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + greatest);
    }
/////////////////////////////////////////////Task2////////////////////////////////////////////
    public static void findGreatestAndSmallest(int[] nums) {

        int greatest = nums[0];
        int smallest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            greatest = Math.max(nums[i], greatest);
            smallest = Math.min(nums[i], smallest);
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + greatest);
    }
/////////////////////////////////////////////Task3////////////////////////////////////////////
    public static void findSecondGreatestAndSmallestWithSort(int[] nums) {
       Arrays.sort(nums);
       int secondGreatest = nums[nums.length-2];
       int secondSmallest = nums[nums[1]];

        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);

    }
    /////////////////////////////////////////////Task4////////////////////////////////////////////
    public static void findSecondGreatestAndSmallest(int[] nums) {
        int greatest = nums[0];
        int smallest = nums[0];
        int secondGreatest = nums[0];
        int secondSmallest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            greatest = Math.max(greatest, nums[i]);
            smallest = Math.min(smallest, nums[i]);
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < greatest && nums[i] > secondGreatest){
                secondGreatest = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < secondSmallest && nums[i] != smallest){
                secondSmallest = nums[i];
            }
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
    }


    public static void main(String[] args) {
        System.out.println("\n------------🦙TASK-1🦙------------\n");
        int[] numbers = {10, 7, 7, 10, -3, 10, -3};
        Project07.findGreatestAndSmallestWithSort(numbers);

        System.out.println("\n------------🦙TASK-2🦙------------\n");
        Project07.findGreatestAndSmallest(numbers);

        System.out.println("\n------------🦙TASK-3🦙------------\n");
        int[] numbers2 = {10, 5, 6, 7, 8, 5, 15, 15};
        Project07.findSecondGreatestAndSmallestWithSort(numbers2);

        System.out.println("\n------------🦙TASK-4🦙------------\n");
        Project07.findSecondGreatestAndSmallest(numbers2);

        System.out.println("\n------------🦙TASK-5🦙------------\n");

        String[] elements = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};

        for (int i = 0; i <= elements.length - 2; i++) {
            for (int j = i + 1; j <= elements.length - 1 ; j++) {
                if (elements[i].equals(elements[j])) System.out.println(elements[i]);
            }
        }

        System.out.println("\n------------🦙TASK-6🦙------------\n");
        String[] words = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        String mostCountWord = "";
        int mostCountedTimes = 0;

        for (int i = 0; i < words.length-1; i++) {
            String word = words[i];
            int countOfWord = 0;

            for (int j = 0; j < words.length-1; j++) {
                if (words[j].equals(word))
                    countOfWord++;
            }
                if (countOfWord > mostCountedTimes) {
                    mostCountWord = word;
                    mostCountedTimes = countOfWord;
                }
            }
            System.out.println(mostCountWord);
        }
    }


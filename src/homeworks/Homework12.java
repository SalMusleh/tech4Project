package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("\n------------TASK-1------------\n");
        int[] ints = new int[10];
        ints[2] = 23;
        ints[4] = 12;
        ints[7] = 34;
        ints[9] = 7;
        ints[6] = 15;
        ints[0] = 89;

        System.out.println(ints[3]);
        System.out.println(ints[0]);
        System.out.println(ints[9]);
        System.out.println(Arrays.toString(ints));

        System.out.println("\n------------TASK-2------------\n");
        String[] str = new String[5];
        str[1] = "abc";
        str[4] = "xyz";
        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        System.out.println("\n------------TASK-3------------\n");
        int[] numbers = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n------------TASK-4------------\n");
        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("\n------------TASK-5------------\n");
        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(dogs));
        Arrays.sort(dogs);
        System.out.println(Arrays.binarySearch(dogs, "Pluto") >= 0);

        System.out.println("\n------------TASK-6------------\n");
        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        boolean hasCats = false;

        for (String cat : cats) {
            if (cat.equals("Garfield")) {
            } else if (cat.equals("Felix")) {
                hasCats = true;
                break;
            }
        }
        System.out.println(hasCats);

        System.out.println("\n------------TASK-7------------\n");
        double[] doubles = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(doubles));
        System.out.println(doubles[0]);
        System.out.println(doubles[1]);
        System.out.println(doubles[2]);
        System.out.println(doubles[3]);
        System.out.println(doubles[4]);

        System.out.println("\n------------TASK-8------------\n");
        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(chars));

        int countLetter = 0;

        for (int i = 0; i < chars.length; i++) {
            if(Character.isLetter(chars[i])) countLetter++;
        }
        int countUpper = 0;

        for (int i = 0; i < chars.length; i++) {
            if(Character.isUpperCase(chars[i])) countUpper++;
        }
        int countLower = 0;

        for (int i = 0; i < chars.length; i++) {
            if(Character.isLowerCase(chars[i])) countLower++;
        }
        int countDigit = 0;

        for (int i = 0; i < chars.length; i++) {
            if(Character.isDigit(chars[i])) countDigit++;
        }
        int countSpecial = 0;

        for (int i = 0; i < chars.length; i++) {
            if(!Character.isLetterOrDigit(chars[i]) && !Character.isWhitespace(chars[i]))
                countSpecial++;
        }

        System.out.println("Letters = " + countLetter);
        System.out.println("Uppercase Letters = " + countUpper);
        System.out.println("Lowercase Letters = " + countLower);
        System.out.println("Digits = " + countDigit);
        System.out.println("Special Characters = " + countSpecial);

        System.out.println("\n------------TASK-9------------\n");
        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(objects));

        int countUpperCase = 0;
        int countLowerCase = 0;

        for (String object : objects) {
            if (object.charAt(0) >= 'A' && object.charAt(0) <= 'Z')
            countUpperCase++;
            if (object.charAt(0) >= 'a' && object.charAt(0) <= 'z')
                countLowerCase++;
        }
        int countBOrP = 0;

        for (int i = 0; i < objects.length; i++) {
            if((objects[i].toUpperCase().startsWith("B") || objects[i].toUpperCase().startsWith("P")))
                countBOrP++;
        }
        int countBookOrPen = 0;

        for (int i = 0; i < objects.length; i++) {
            if ((objects[i].toLowerCase().contains("book") || objects[i].toLowerCase().contains("pen")))
                countBookOrPen++;
        }
        System.out.println("Elements starts with uppercase = "+ countUpperCase);
        System.out.println("Elements starts with lowercase = "+ countLowerCase);
        System.out.println("Elements starts with B or P = "+ countBOrP);
        System.out.println("Elements having \"book\" or \"pen\" = "+ countBOrP);

        System.out.println("\n------------TASK-10------------\n");
        int[] nums = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int moreThan10 = 0;
        int lessThan10 = 0;
        int tens = 0;
        System.out.println(Arrays.toString(nums));
        for (int num : nums) {
            if (num > 10) moreThan10++;
            else if (num < 10) lessThan10++;
            else tens++;
        }
        System.out.println("Elements that are more than 10 = "+ moreThan10);
        System.out.println("Elements that are less than 10 = "+ lessThan10);
        System.out.println("Elements that are 10 = "+ tens);

        System.out.println("\n------------TASK-11------------\n");
        int[] firstArr = {5, 8, 13, 1, 2};
        int[] secondArr = {9, 3, 67, 1, 0};
        String first = Arrays.toString (firstArr);
        String second = Arrays.toString (secondArr);
        System.out.println("1st array is = " + first);
        System.out.println("2nd array is = " + second);
        ArrayList<Integer> greatest = new ArrayList<>();
        for (int i = 0; i < firstArr.length; i++) {
            greatest.add(Math.max(secondArr[i], firstArr[i]));
        }
        System.out.println("3rd array is =" + greatest);
    }
}

package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {

        System.out.println("\n----------------TASK-1----------------\n");
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n----------------TASK-2----------------\n");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n----------------TASK-3----------------\n");
        ArrayList<Integer> numbers1 = new ArrayList<>();

        numbers1.add(23);
        numbers1.add(-34);
        numbers1.add(-56);
        numbers1.add(0);
        numbers1.add(89);
        numbers1.add(100);

        System.out.println(numbers1);
        Collections.sort(numbers1);
        System.out.println(numbers1);

        System.out.println("\n----------------TASK-4----------------\n");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n----------------TASK-5----------------\n");
        ArrayList<String> marvel = new ArrayList<>();
        marvel.add("Spider Man");
        marvel.add("Iron Man");
        marvel.add("Black Panther");
        marvel.add("Deadpool");
        marvel.add("Captain America");

        System.out.println(marvel);
        System.out.println(marvel.contains("Wolverine"));

        System.out.println("\n----------------TASK-6----------------\n");
        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");

        Collections.sort(avengers);
        System.out.println(avengers);
        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));

        System.out.println("\n----------------TASK-7----------------\n");
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('x');
        chars.add('$');
        chars.add('%');
        chars.add('9');
        chars.add('*');
        chars.add('+');
        chars.add('F');
        chars.add('G');

        System.out.println(chars);
        for(Character element : chars) {
            System.out.println(element);
        }

        System.out.println("\n----------------TASK-8----------------\n");
        ArrayList<String> objects = new ArrayList<>();
        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");

        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);
        int countM = 0;

        for (String object : objects) {
            if(object.charAt(0) == 'M' || object.charAt(0) == 'm') countM++;
        }
        System.out.println(countM);

        int countAorE = 0;

        for (String object : objects) {
            object = object.toLowerCase();
            if(object.contains("a") || object.contains("e")) countAorE++;
        }
        System.out.println(objects.size() - countAorE);

        System.out.println("\n----------------TASK-9----------------\n");
        ArrayList<String> kitchens = new ArrayList<>();
        kitchens.add("Plate");
        kitchens.add("spoon");
        kitchens.add("fork");
        kitchens.add("Knife");
        kitchens.add("cup");
        kitchens.add("Mixer");

        System.out.println(kitchens);
        int countU = 0;

        for (String kitchen : kitchens) {
            if(Character.isUpperCase(kitchen.charAt(0))) countU++;
        }

        System.out.println("Elements starts with uppercase = " + countU);

        int countL = 0;

        for (String kitchen : kitchens) {
            if(Character.isLowerCase(kitchen.charAt(0))) countL++;
        }

        System.out.println("Elements starts with lowercase = " + countL);

        int countP = 0;

        for (String kitchen : kitchens) {
            if(kitchen.contains("P") || kitchen.contains("p")) countP++;
        }
        System.out.println("Elements having P or p = " + countP);

        int countStartOrEndP = 0;

        for (String kitchen : kitchens) {
            kitchen = kitchen.toLowerCase();
            if(kitchen.charAt(0) == 'p') countStartOrEndP++;
            if(kitchen.charAt(kitchen.length()-1) == 'p') countStartOrEndP++;
        }

        System.out.println("Elements starting or ending with P or p = " + countStartOrEndP);

        System.out.println("\n----------------TASK-10----------------\n");
        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers2.add(3);
        numbers2.add(5);
        numbers2.add(7);
        numbers2.add(10);
        numbers2.add(0);
        numbers2.add(20);
        numbers2.add(17);
        numbers2.add(10);
        numbers2.add(23);
        numbers2.add(56);
        numbers2.add(78);
        System.out.println(numbers2);

        int countDividedBy10 = 0;

        for (int number2 : numbers2) {
            if(number2 % 10 == 0) countDividedBy10++;
        }
        System.out.println("Elements that can be divided by 10 = " + countDividedBy10);

        int countEvenAndGreaterThan15 = 0;

        for (int number2 : numbers2) {
            if(number2 % 2 == 0 && number2 > 15) countEvenAndGreaterThan15++;
        }
        System.out.println("Elements that are even and greater than 15 = " + countEvenAndGreaterThan15);

        int countOddAndLessThan20 = 0;

        for (int number2 : numbers2) {
            if(number2 % 2 == 1 && number2 < 20) countOddAndLessThan20++;
        }
        System.out.println("Elements that are odd and less than 20 = " + countOddAndLessThan20);

        int countLessThan15OrGreaterThan50 = 0;

        for (int number2 : numbers2) {
            if(number2 < 15) countLessThan15OrGreaterThan50++;
            if(number2 > 50) countLessThan15OrGreaterThan50++;
        }
        System.out.println("Elements that are less than 15 or greater than 50 = " + countLessThan15OrGreaterThan50);
    }
}

package collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Exercise01_remove_duplicates {
    public static void main(String[] args) {
       /*
        Create an ArrayList and store below elements
        Computer
        Phone
        Mouse
        Mouse
        Phone
        Pen

        From above list, remove all duplicates and print the unique elements

        EXPECTED RESULT:
        [Computer, Phone, Mouse, Pen]
         */
        System.out.println("\n-------First way - not preferred--------\n");


        ArrayList<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Phone");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Phone");
        objects.add("Pen");

        // Create an empty list to store unique values
        System.out.println("My list before removing duplicates = " + objects);

        List<String> uniques = new ArrayList<>();

        for (String object : objects) {
            if(!uniques.contains(object)) {
                uniques.add(object);
            }
        }

        System.out.println("My list after removing duplicates = " + uniques);

        System.out.println("\n-------Second way - using collections--------\n");

        //TreeSet -> Computer, Mouse, Pen, Phone    //Use this if you want it to remove duplicates and sort
        //HashSet -> no prediction
        //LinkedHashSet is the one I need for this task
        LinkedHashSet<String> myUniques = new LinkedHashSet<>(objects);
        System.out.println(myUniques);

        System.out.println(new LinkedHashSet<>(objects));

    }
}

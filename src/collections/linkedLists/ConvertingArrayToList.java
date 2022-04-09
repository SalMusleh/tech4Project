package collections.linkedLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertingArrayToList {
    public static void main(String[] args) {

        /*
        Create a List and store below data - countries

        USA
        Brasilia
        Argentina
        France
        Belgium
        Germany
        Portugal

        Print your list

        RESULT:
        [USA, Brasilia, Argentina, France, Belgium, Germany, Portugal]
         */

        String[] countries = {"USA", "Brasilia", "Argentina", "France", "Belgium", "Germany", "Portugal"};

        //WAY - 1 to convert Array to List (ArrayList or LinkedList)
        List<String> countries1 = new ArrayList<>(Arrays.asList(countries));
        List<String> countries2 = new LinkedList<>(Arrays.asList(countries));
        System.out.println(countries1);
        System.out.println(countries2);

        //WAY-2 to convert Array to List (ArrayList or LinkedList)
        List<String> countries3 = new ArrayList<>();
        List<String> countries4 = new LinkedList<>();

        System.out.println(countries3);
        System.out.println(countries4);

        //3rd way - manual way
        System.out.println("\n--------Way-3 of converting Array to List-------\n");
        int[] numbers = {1, 2, 3, 4, 5};

        List<Integer> numbersList = new LinkedList<>(); // or ArrayList

        for(int i : numbers){
            numbersList.add(i);
        }

        System.out.println(numbersList);

    }
}

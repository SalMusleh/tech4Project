package homeworks;

import java.util.*;

public class Homework22 {
    //////////////////////////////////TASK-1//////////////////////////////////
    public static int[] fibonacciSeries(int n) {
        int[] arr = new int[n];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;

    }

    //////////////////////////////////TASK-2//////////////////////////////////
    public static int fibonacciSeries2(int n) {
        int[] arr = new int[n];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }

    //////////////////////////////////TASK-3//////////////////////////////////
    public static int[] findUniques(int[] a1, int[] a2) {
        List<Integer> allElements = new ArrayList<>();
        for (int i : a1) {
            allElements.add(i);
        }
        for (int i : a2) {
            allElements.add(i);
        }
        Arrays.sort(a1);
        Arrays.sort(a2);

        Set<Integer> uniquesSet = new LinkedHashSet<>(allElements);
        uniquesSet.removeIf(element -> Arrays.binarySearch(a1, element) >= 0 && Arrays.binarySearch(a2, element) >= 0);

        List<Integer> uniquesList = new ArrayList<>(uniquesSet);

        int[] uniques = new int[uniquesList.size()];
        for (int i = 0; i < uniquesList.size(); i++) {
            uniques[i] = uniquesList.get(i);

        }
        return uniques;

    }
    //////////////////////////////////TASK-4//////////////////////////////////
    public static boolean isPowerOf3(int number) {
        if (number < 1) {
            return false;
        }
        while (number % 3 == 0) {
            number /= 3;
        }
        return number == 1;
    }

    //////////////////////////////////TASK-5//////////////////////////////////
    public static int firstDuplicate(int[] arr) {
        int result = 0;
        if (arr.length == 0) return -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                result = arr[i];
                break;
            } else result = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("\n------------🦙TASK-1🦙------------\n");
        System.out.println(Arrays.toString(fibonacciSeries(7)));

        System.out.println("\n------------🦙TASK-2🦙------------\n");

        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(7));

        System.out.println("\n------------🦙TASK-3🦙------------\n");

        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{})));
        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{1, 2, 3, 2})));
        System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));
        System.out.println(Arrays.toString(findUniques(new int[]{8, 9}, new int[]{9, 8, 9})));

        System.out.println("\n------------🦙TASK-4🦙------------\n");

        System.out.println(isPowerOf3(1));
        System.out.println(isPowerOf3(2));
        System.out.println(isPowerOf3(3));
        System.out.println(isPowerOf3(81));

        System.out.println("\n------------🦙TASK-5🦙------------\n");

        System.out.println(firstDuplicate(new int[]{1, 2, 2, 3}));
        System.out.println(firstDuplicate(new int[]{1, 2, 3, 3, 4, 1}));
        System.out.println(firstDuplicate(new int[]{1}));
        System.out.println(firstDuplicate(new int[]{}));

    }
}
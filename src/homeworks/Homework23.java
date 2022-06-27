package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {

    //////////////////////////////////TASK-1//////////////////////////////////
    public static Map<Integer, String> parseData(String str){

        String[] words = str.replaceAll("[{}]", " ").trim().split(" ");
        Map<Integer, String> pairs = new TreeMap<>();
        for (int i = 0; i < words.length - 1; i++) {
            pairs.put(Integer.parseInt(words[i]), words[i + 1]);
            i ++;
        }
        return pairs;
    }

    //////////////////////////////////TASK-2//////////////////////////////////
    public static double calculateTotalPrice1(Map<String, Integer> fruitQuantity){
        Map<String, Double> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 2.00);
        fruitPrices.put("Orange", 3.29);
        fruitPrices.put("Mango", 4.99);
        fruitPrices.put("Pineapple", 5.25);

        double totalPrice = 0.0;

        for (String s : fruitQuantity.keySet()) {
            totalPrice += fruitQuantity.get(s) * fruitPrices.get(s);
        }
        return totalPrice;
    }

    //////////////////////////////////TASK-3//////////////////////////////////
    public static double calculateTotalPrice2(Map<String, Integer> fruitQuantity) {
        Map<String, Double> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 2.00);
        fruitPrices.put("Orange", 3.29);
        fruitPrices.put("Mango", 4.99);

        double totalPrice = 0;

        if (fruitQuantity.get("Mango") >= 3) fruitQuantity.put("Mango", fruitQuantity.get("Mango") - (fruitQuantity.get("Mango") / 3));
        for (String s : fruitQuantity.keySet()) {
            if (s.equals("Apple")){
                if (fruitQuantity.get("Apple") % 2 == 1) totalPrice += (fruitQuantity.get("Apple") - 1) * 1.5 + 2;
                else totalPrice += fruitQuantity.get("Apple") * 1.5;
            }
            else totalPrice += fruitPrices.get(s) * fruitQuantity.get(s);
        }

        return totalPrice;

    }

    public static void main(String[] args) {
        System.out.println("\n------------🦙TASK-1🦙------------\n");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        System.out.println("\n------------🦙TASK-2🦙------------\n");
        Map<String, Integer> fruitsTask2 = new HashMap<>();
        fruitsTask2.put("Apple", 2);
        fruitsTask2.put("Pineapple", 1);
        fruitsTask2.put("Orange", 3);
        System.out.println(calculateTotalPrice1(fruitsTask2));

        System.out.println("\n------------🦙TASK-3🦙------------\n");
        Map<String, Integer> fruitsTask3 = new HashMap<>();
        fruitsTask3.put("Apple", 4);
        fruitsTask3.put("Mango", 8);
        fruitsTask3.put("Orange", 3);
        System.out.println(calculateTotalPrice2(fruitsTask3));

    }
}

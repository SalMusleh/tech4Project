package stringMethods;

public class _01_valueOf {
    public static void main(String[] args) {
        /*
        Method Task: Convert given variable to a String
        -it is static - you can call it with its class name
        -it is a return type, and it returns a String
        -it takes different arguments as it is an overloaded method and converts given args to a String
         */

        int i = 5;

        String num = String.valueOf(i); // num = 5

        System.out.println(i + i); //10
        System.out.println(num + num); //55


    }
}

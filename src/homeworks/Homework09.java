package homeworks;

import utilities.ScannerHelper;

public class Homework09 {
    public static void main(String[] args) {
        System.out.println("TASK1\n");

        String name = ScannerHelper.getANameFromUser();
        System.out.println("The length of the name is = " + name.length());
        System.out.println("First character in the name is = " + name.charAt(0));
        System.out.println("Last character in the name is = " + name.charAt(name.length()-1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0, 3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));
        if(name.toUpperCase().startsWith("A")){
            System.out.println("You are in the club !");
        }
        else{
            System.out.println("Sorry, you are not in the club");
        }

        System.out.println("\nTASK2\n");

        String address = ScannerHelper.getAStringFromUser();
        if(address.toUpperCase().contains("CHICAGO")) System.out.println("You are in the club");
        else if (address.toUpperCase().contains("DES PLAINES")) System.out.println("You are welcome to join the club");
        else System.out.println("You are not in the club");

        System.out.println("\nTASK3\n");

        String color = ScannerHelper.getAStringFromUser();
        if (color.toUpperCase().contains("RED") && color.toUpperCase().contains("GREEN"))System.out.println("Green and Red are in the list");
        else if(color.toUpperCase().contains("GREEN")) System.out.println("Green is in the list");
        else if (color.toUpperCase().contains("RED"))System.out.println("Red is in the list");
        else System.out.println("Green and red are not in the list");

        System.out.println("\nTASK4\n");

        String str = "   Java is FUN   ";

        String str1 = (str.toLowerCase().substring(3, 7));
        System.out.println("The first word in the str is = " + str1);
        String str2 = (str.toLowerCase().substring(8, 10));
        System.out.println("The second word in the str is = " + str2);
        String str3 = (str.toLowerCase().substring(11, 14));
        System.out.println("The third word in the str is = " + str3);
    }
}
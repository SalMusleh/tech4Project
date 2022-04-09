package operator.shortHandAssignmentOperators;

public class ShortHandAssignment {
    public static void main(String[] args) {

        int age = 5;
        System.out.println(age);

        // reassign
        age += 3; //  age = age + 3; oldAge -> 5 + 3
        System.out.println(age);

        age -= 2; // --> 6
        System.out.println(age);

        age *= 2; // --> 12
        System.out.println(age);

        age /= 3; // --> 4
        System.out.println(age);

        age %= 3; // --> 1
        System.out.println(age);


        int johnsAge = 5;

        //Please find the age of John for 5 years later

        //int johnsAge5YearsLater = johnsAge + 5;  ==
        //johnsAge = johnsAge + 5;

        johnsAge += 5; // 10

        System.out.println(johnsAge);


        String name = "Alex"; // Alexander

        //String name2 = name + "an";
        //name = name + "an";
        name += "an"; // Alexan
        name += "d"; // Alexand
        name += "e"; //Alexande
        name += "r"; //Alexander

        System.out.println(name); // Alexan



    }
}

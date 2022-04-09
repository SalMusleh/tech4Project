package scanner;

import java.util.Scanner;

public class learningScannerPrimitiveMethods {
    public static void main(String[] args){
        //how to use Scanner methods
        // 1.Create an object of scanner (import the class as well)
        // ClassName/DataType VariableName/objectName = new ClassName/DataType(if its needed)
        // 2. variableName/objectName.methodName(if it is needed parameter);

        Scanner collect = new Scanner(System.in);

        System.out.println("what is your age?");

        int usersAge = collect.nextInt();

        System.out.println("The Users age is: " + usersAge);

        System.out.println("\n");

        System.out.println("What is your account balance?");

        double accountBalance = collect.nextDouble();

        System.out.println("User's account balance is: $"+ accountBalance);


        System.out.println("Are you Understanding this Java class today?");
        boolean understand = collect.nextBoolean();

        System.out.println("The user's answer is: "+ understand);



    }
}

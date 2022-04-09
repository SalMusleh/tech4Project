package utilities;

public class Calculator {

    /*
    what do we need to create a method
    1. A proper name
    2. Decide its accessibility level (public)
    3. Decide its accessibility way (you want to call it with class name or with object name)
        static -> call it with class name
        non-static -> call it with object name
    4. Decide if it returns something or not
        if it returns -> then decide what it returns
        if it does not return -. then put void
    5. Does it take any argument
        if it takes, then decide what arguments it takes and how many arguments it takes

        Note: if your method is not void meaning it is return type, you Must use return keyword in the body
        of the method
        Note: if your method returns an int, then the variable used next to return keyword in the body Must be an int
        Note: Every  method must have a body that runs a task
        Note: We can have multiple methods sharing the same name in the same class only if they have different arguments.
        Different arguments could be either the number of arguments are different or the types of arguments are different

        Note: Do not ever create a method inside another method
     */

    public static int divide(int num1, int num2){ // 15, 2 ->7
        return num1 / num2;
    }

    public static double divide(double num1, double num2){
        return num1 / num2;
    }


    //Create a method that finds the sum of 2 int numbers and returns it

    public static int findSumOf2(int n1, int n2){
        return n1 + n2;
    }

    //Create a method that finds the sum of 2 double numbers and returns it

    public static double findSumOf2(double n1, double n2){
        return n1 + n2;
    }

    //Create a method that finds the absolute difference of 2 int numbers and returns it

    public static int findAbsOf2(int n1, int n2){
        //return Math.abs(n1 - n2);
        return (n1 > n2)? n1 - n2: n2 - n1;
    }

    //Create a method that finds the absolute difference of 2 double numbers and returns it

    public static double findAbsOf2(double n1, double n2){
        if (n1 > n2){
            // n1 - n2
            return n1 - n2;
        }else {
            // n2 - n1
            return n2 - n1;
        }
    }

    //Create a method that finds the product of 2 int numbers and returns it

    public static int findProductOf2(int n1, int n2){
        return n1 * n2;
    }

    //Create a method that finds the product of 2 double numbers and returns it
    public static double findProductOf2(double n1, double n2) {
        return n1 * n2;

    }
}


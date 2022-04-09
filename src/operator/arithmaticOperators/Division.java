package operator.Division;

public class Division {
    public static void main(String[] args) {


        double number1 = 5;
        double number2 = 3;

        //addition
        double sum = number1 + number2; // 8

        //subtraction
        double sub = number1 - number2;  // 2

        //multiplication
        double times = number1 * number2; // 15

        //division
        double div = number1 / number2;

        //remainder
        double remainder = number1 % number2; // 5 - (3*2) = 2

        System.out.println("Addition is = " + sum);
        System.out.println("subtraction is = " + sub);
        System.out.println("multiplication is = " + times);
        System.out.println("division is = " + div);
        System.out.println("remainder is = " + remainder);

        double num1 = 15;
        double num2 = 3;
        int num3 = 4;
        int num4 = 10;

        double divsion = num1 / num2;
        double divisionByInt = num1 / num3;
        double divisionByDouble =  num4 / num2;

        System.out.println("num1 / num2 = " + divsion);
        System.out.println("num1 / num3 = " + divisionByInt);
        System.out.println("num4 / num2 = " + divisionByDouble);





    }
}
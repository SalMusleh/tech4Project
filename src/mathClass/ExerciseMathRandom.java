package mathClass;

public class ExerciseMathRandom {
    public static void main(String[] args) {
        /*
        Create a program  which is generating a random number between 45 - 98
        and print it out

        (int) (Math.random() * ( end point -startPoint + 1) + startPoint)
         */

        int rand = (int) (Math.random() * 54) + 45;
        System.out.println(rand);

        System.out.println((int)(Math.random() * 54 + 45)); //better way

        /*
        Create a program  which is generating two random numbers between 67 - 85
        and print it out the number1 and number2 and max and min.

        (int) (Math.random() * ( end point -startPoint + 1) + startPoint)
         */

        int random1 = (int)(Math.random() * 19 + 67);
        int random2 = (int)(Math.random() * 19 + 67);

        System.out.println("First number is = " + random1 + "\nThe second number is = " + random2
                + "\nThe max of the two numbers is = " + Math.max(random1, random2)
                + "\nThe min of the two numbers is = " + Math.min(random1, random2));







    }
}

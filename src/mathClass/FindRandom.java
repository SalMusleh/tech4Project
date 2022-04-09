package mathClass;

public class FindRandom {
    public static void main(String[] args) {

        double rand = Math.random();// 0.0 ----- 0.9999

        double rand0And10 = (int)(Math.random() * 11); // 0.0 - 10.0

        int rand0And20 = (int)(Math.random() * 21); // 0 - 20

        System.out.println(rand);
        System.out.println(rand0And10);
        System.out.println(rand0And20);

        // create a random number between 10 and 20
        int randBetween10And20 = (int)(Math.random() * 11) + 10;// between 10-20
        System.out.println(randBetween10And20);

        // create a random number between 103 - 346 included take that as an int
        // get the difference --> 346 -103 = 243 add + 1
        // multiply it by 243 + 1 = 244
        // add the starting pointy to the equation
        // random * (end point - start point + 1) +start point

        int randBetween103And246 =(int) (Math.random() * 244) + 103;

        System.out.println(randBetween103And246);

        // create a random number between -50 and 50
        // random * (end point - Start point + 1) + start point
        // (random * ((101) - 50)

        int randBetween_50And50 = (int)(Math.random() * 101) - 50;
        System.out.println(randBetween_50And50);


    }
}

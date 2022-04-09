package mathClass;

public class FindSqrt {
    public static void main(String[] args) {

        int a =  36;
        int b = 49;
        int c = 16;
        double d = 56.2;

        System.out.println("sqrt a = "+ Math.sqrt(a));
        System.out.println("sqrt b = "+ Math.sqrt(b));
        System.out.println("sqrt c = "+ Math.sqrt(c));
        System.out.println("sqrt d = "+ Math.sqrt(d));

        System.out.println(
                "sqrt a = " + Math.sqrt(a) +
                        "\nsqrt b = " + Math.sqrt(b) +
                        "\nsqrt c = " + Math.sqrt(c) +
                        "\nsqrt d = " + Math.sqrt(d));


        Math.sqrt(6 - 10 + 4 + 1 + 65 - 34 * 12 / 23 % 12);
        //6 - 10 + 4 + 1 + 65 - 34 * 12 / 23 % 12
        //6, 4
    }
}

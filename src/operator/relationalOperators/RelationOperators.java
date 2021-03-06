package operator.relationalOperators;

public class RelationOperators {
    public static void main(String[] args) {

        int a = 4;
        int b = 10;

        boolean isAEqualToB = a == b;    // a is EQUAL to b
        boolean isNotAEqualToB = a != b; // a is NOT EQUAL to b

        System.out.println("a = b : " + isAEqualToB);
        System.out.println("a != b : " + isNotAEqualToB);

        boolean isAGreaterThanB = a > b;
        boolean isASmallerThanB = a < b;
        boolean isAGreaterOrEqualThanB = a >= b;
        boolean isASmallerOrEqualThanB = a <= b;

        System.out.println("a > b : " + isAGreaterThanB);
        System.out.println("a < b : " + isASmallerThanB);
        System.out.println("a >= b : " + isAGreaterOrEqualThanB);
        System.out.println("a <= b : " + isASmallerOrEqualThanB);

    }
}

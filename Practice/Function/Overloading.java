package Practice.Function;

public class Overloading {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // overloading using different parameters
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // overloading using different datatypes
    public static float sum(float num1, float num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 4));
        System.out.println(sum(2.0f, 3.0f));

    }
}

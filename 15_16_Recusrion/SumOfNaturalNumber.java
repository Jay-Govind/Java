import java.util.*;

public class SumOfNaturalNumber {

    public static int sumOfNaturalNumber(int num) {
        if (num == 1) {
            return num;
        }
        int sum = num + sumOfNaturalNumber(num - 1);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int sum = sumOfNaturalNumber(num);
        System.out.print("Sum of first " + num + " natural numbers : " + sum);

        sc.close();
    }
}

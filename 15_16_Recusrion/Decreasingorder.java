import java.util.*;

public class Decreasingorder {
    public static void decreasingOrder(int num) {
        if (num == 0)
            return;

        System.out.print(num + " ");
        decreasingOrder(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        decreasingOrder(num);

        sc.close();
    }
}
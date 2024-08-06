import java.util.*;

public class IncreasingOrder {

    public static void increasingOrder(int num) {
        if (num == 1) {
            increasingOrder(num - 1);
            return;
        }

        increasingOrder(num - 1);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        increasingOrder(num);

        sc.close();
    }
}

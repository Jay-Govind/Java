import java.util.*;

public class oddEven {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // Logic
        if (num % 2 == 0) {
            System.out.print("Number is even");
        } else {
            System.out.print("Number is odd");
        }

        sc.close();
    }
}

import java.util.*;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // Logic --> Ternary
        String result = ((num % 2) == 0) ? "Number is even" : "Number is odd";
        System.out.println(result);

        sc.close();
    }
}

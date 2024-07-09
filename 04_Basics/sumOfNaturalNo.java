import java.util.*;

public class sumOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        // Logic
        int counter = 1;
        int sum = 0;
        while (counter <= num) {
            sum = sum + counter;
            counter++;
        }
        System.out.println("Sum of natural numbers : " + sum);
        
        sc.close();
    }
}

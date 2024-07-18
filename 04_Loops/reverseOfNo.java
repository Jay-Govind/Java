import java.util.*;

public class reverseOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        // Logic
        for (int counter = num; counter > 0; counter--) {
            System.out.print(counter + " ");
        }

        sc.close();
    }
}

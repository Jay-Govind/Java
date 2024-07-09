import java.util.*;

public class naturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        // Logic
        int counter = 1;
        while (counter <= num) {
            System.out.print(counter + " ");
            counter++;
        }

        sc.close();
    }
}

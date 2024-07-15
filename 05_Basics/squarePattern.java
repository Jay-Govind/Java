import java.util.*;

public class squarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        // Logic
        for (int rowNo = 1; rowNo <= rows; rowNo++) {
            for (int colNo = 1; colNo <= rows; colNo++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }

        sc.close();
    }
}

package Practice.patternPrinting;
import java.util.*;

public class hollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of rows/columns : ");
        int num = sc.nextInt();

        // Logic
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (row == 1 || row == num || col == 1 || col == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
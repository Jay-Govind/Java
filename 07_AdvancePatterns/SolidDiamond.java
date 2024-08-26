import java.util.*;

public class SolidDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines : ");
        int lines = sc.nextInt();

        // upper half diamnod pattern
        for (int i = 1; i <= lines; i++) {
            // spaces
            for (int j = 1; j <= lines - i; j++) {
                System.out.print("  ");
            }

            // star
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower half diamnod pattern
        for (int i = lines - 1; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= lines - i; j++) {
                System.out.print("  ");
            }

            // star
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}

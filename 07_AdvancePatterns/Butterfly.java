import java.util.*;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();

        int current_line = 1;
        int total_lines = (2 * num);
        int space = (total_lines - (2 * current_line));

        // logic
        while (current_line <= total_lines) {
            if (current_line <= num) {
                for (int col = 1; col <= current_line; col++) {
                    System.out.print("* ");
                }
                for (int col = 1; col <= space; col++) {
                    System.out.print("  ");
                }
                for (int col = 1; col <= current_line; col++) {
                    System.out.print("* ");
                }
                System.out.println();
                current_line++;
                space -= 2;
            } else {
                for (int col = total_lines; col >= current_line; col--) {
                    System.out.print("* ");
                }
                for (int col = 1; col <= space; col++) {
                    System.out.print("  ");
                }
                for (int col = total_lines; col >= current_line; col--) {
                    System.out.print("* ");
                }
                System.out.println();
                current_line++;
                space += 2;

            }

        }

        sc.close();
    }
}
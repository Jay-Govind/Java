import java.util.*;

public class Triangle01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();

        for (int current_line = 1; current_line <= num; current_line++) {
            for (int current_col = 1; current_col <= current_line; current_col++) {
                if ((current_line + current_col) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

// Output
/*
 * Enter the number of lines : 5
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 */
import java.util.*;

public class lowerNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();

        // logic
        for (int row = num; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

// output
// Enter the number of lines : 5
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
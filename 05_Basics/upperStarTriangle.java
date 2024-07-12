import java.util.*;

public class upperStarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();

        // Logic
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}

// Output
// Enter the number of lines : 5
// *
// * *
// * * *
// * * * *
// * * * * *
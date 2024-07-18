import java.util.*;

public class UpperNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Input
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();

        // logic 
        for ( int row =1; row <= num; row++) {
            for ( int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}   

// Output
// Enter the number of lines : 5
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5    
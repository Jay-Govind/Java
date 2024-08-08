import java.util.*;

public class TilingProblem {
    public static int tilingProblem(int num) {
        // Base
        if (num == 0 || num == 1) {
            return 1;
        }

        // vertical selection
        int verticalTiles = tilingProblem(num - 1);

        // horizontal selection
        int horizontalTiles = tilingProblem(num - 2);

        int totalWays = verticalTiles + horizontalTiles;
        return totalWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int ways = tilingProblem(num);
        System.out.print("The total number of ways : " + ways);

        sc.close();
    }
}

// Permutation and Combination ( n_C_r )

package Practice.Function;

import java.util.*;

public class Arrangement {

    public static int factorial(int num) {
        int fact = 1;

        if (num < 0) {
            fact = -1;
        } else if (num == 0) {
            fact = 1;
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of items : ");
        int n = sc.nextInt();

        System.out.print("Enter the number of items to be selection : ");
        int r = sc.nextInt();

        int nFact = factorial(n);
        int rFact = factorial(r);
        int n_rFact = factorial(n - r);

        int nCr = nFact / (rFact * n_rFact);
        System.out.print("The number of selection of " + r + " items from " + n + " is " + nCr);

        sc.close();
    }
}

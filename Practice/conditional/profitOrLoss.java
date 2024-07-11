package Practice.conditional;

import java.util.*;

public class profitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the price of item : ");
        int cp = sc.nextInt();
        System.out.print("Enter the selling price of item : ");
        int sp = sc.nextInt();

        // Logic
        if (cp == sp) {
            System.out.println("| Neither Profit noe Loss |");
        } else {
            System.out.println((cp > sp) ? "| Loss |" : "| Profit |");
        }
        sc.close();
    }
}

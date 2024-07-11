package Practice.conditional;

import java.util.*;

public class isTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side : ");
        int side1 = sc.nextInt();
        System.out.print("Enter the second side : ");
        int side2 = sc.nextInt();
        System.out.print("Enter the third side : ");
        int side3 = sc.nextInt();

        boolean isTriangle = false;

        if (side1 + side2 > side3) {
            if (side1 + side3 > side2) {
                if (side2 + side3 > side1) {
                    isTriangle = true;
                }
            }
        }

        System.out.println(isTriangle ? "| Valid Triangle |" : "| Not a Valid Triangle |");
        
        sc.close();
    }
}

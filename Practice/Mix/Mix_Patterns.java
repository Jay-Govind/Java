package Practice.Mix;

import java.util.Scanner;

public class Mix_Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // upperStarPattern(sc);
        // lowerStarPattern(sc);
        // invertedUpperStarPattern(sc);
        // invertedLowerStarPattern(sc);
        numberPattern(sc);

        sc.close();
    }

    // *
    // * *
    // * * *
    // * * * *
    public static void upperStarPattern(Scanner sc) {
        System.out.print("Enter the number of lines: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * * * *
    // * * *
    // * *
    // *
    public static void lowerStarPattern(Scanner sc) {
        System.out.print("Enter the number of lines: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // - - - *
    // - - * *
    // - * * *
    // * * * *
    public static void invertedUpperStarPattern(Scanner sc) {
        System.out.print("Enter the number of lines: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int k = 0; k < num - i - 1; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * * * *
    // - * * *
    // - - * *
    // - - - *
    public static void invertedLowerStarPattern(Scanner sc) {
        System.out.print("Enter the number of lines: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = num; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

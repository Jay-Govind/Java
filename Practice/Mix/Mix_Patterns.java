package Practice.Mix;

import java.util.Scanner;

public class Mix_Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // upperStarPattern(sc);
        // lowerStarPattern(sc);
        // invertedUpperStarPattern(sc);
        // invertedLowerStarPattern(sc);
        // numberPattern(sc);
        // invertedNumberPattern(sc);
        // alphabetPattern(sc);
        // characterPattern(sc);

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

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    public static void numberPattern(Scanner sc) {
        System.out.print("Enter the nubmer of lines: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void invertedNumberPattern(Scanner sc) {
        System.out.print("Enter the number of line : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // A
    // A B
    // A B C
    // A B C D
    public static void alphabetPattern(Scanner sc) {
        System.out.print("Enter the number of lines: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    // A
    // B C
    // D E F
    // G H I J
    public static void characterPattern(Scanner sc) {
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();
        char ch = 'A';
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

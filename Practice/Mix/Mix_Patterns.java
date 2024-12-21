package Practice.Mix;

import java.util.Scanner;

public class Mix_Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // starPattern(sc);
        // invertedStar(sc);

        sc.close();
    }

    // *
    // * *
    // * * *
    // * * * *
    public static void starPattern(Scanner sc) {
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
    public static void invertedStar(Scanner sc) {
        System.out.print("Enter the number of lines: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

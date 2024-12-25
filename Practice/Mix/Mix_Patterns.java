package Practice.Mix;

import java.util.Scanner;

public class Mix_Patterns {

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

    // . . . *
    // . . * *
    // . * * *
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
    // . * * *
    // . . * *
    // . . . *
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

    // * * * *
    // * * * *
    // * * * *
    // * * * *
    public static void squarePattern(Scanner sc) {
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * * * *
    // * . . *
    // * . . *
    // * * * *
    public static void hollowSquarePattern(Scanner sc) {
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // * * * * *
    // * * * * *
    // * * * * *
    public static void rectanglePattern(Scanner sc) {
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * * * *
    // * . . *
    // * * * *
    public static void hollowRectanglePattern(Scanner sc) {
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    public static void zeroOneTrianglePattern(Scanner sc) {
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    public static void floydTrianglePattern(Scanner sc) {
        System.out.print("Enter the numbetr of lines : ");
        int num = sc.nextInt();
        int counter = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // . . . . * * * * *
    // . . . * * * * *
    // . . * * * * *
    // . * * * * *
    // * * * * *
    public static void solidRhombusPattern(Scanner sc) {
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < num; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // . . . . * * * * *
    // . . . * . . . *
    // . . * . . . *
    // . * . . . *
    // * * * * *
    public static void hollowRhombusPattern(Scanner sc) {
        System.out.print("Ente the number 0f lines : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < num; k++) {
                if (i == 0 || i == num - 1 || k == 0 || k == num - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // . . . . *
    // . . . * * *
    // . . * * * * *
    // . * * * * * * *
    // * * * * * * * * *
    // . * * * * * * *
    // . . * * * * *
    // . . . * * *
    // . . . . *
    public static void diamondPattern(Scanner sc) {
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();

        // upper part
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower part
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Butterfly pattern
    // * . . . . . . . . *
    // * * . . . . . . * *
    // * * * . . . . * * *
    // * * * * . . * * * *
    // * * * * * * * * * *
    // * * * * * * * * * *
    // * * * * . . * * * *
    // * * * . . . . * * *
    // * * . . . . . . * *
    // * . . . . . . . . *
    public static void butterflyPattern(Scanner sc) {
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();

        // upper part
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (num - i); k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower part
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (num - i); k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // . . . . 1
    // . . . 2 . 2
    // . . 3 . 3 . 3
    // . 4 . 4 . 4 . 4
    // 5 . 5 . 5 . 5 . 5
    public static void numberPyramidPattern(Scanner sc) {
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + "   ");
            }
            System.out.println();
        }

    }

    // . . . . 1
    // . . . 2 1 2
    // . . 3 2 1 2 3
    // . 4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5
    public static void palindromePattern(Scanner sc) {
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }

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
        // squarePattern(sc);
        // hollowSquarePattern(sc);
        // rectanglePattern(sc);
        // hollowRectanglePattern(sc);
        // zeroOneTrianglePattern(sc);
        // floydTrianglePattern(sc);
        // solidRhombusPattern(sc);
        // hollowRhombusPattern(sc);
        // diamondPattern(sc);
        // butterflyPattern(sc);
        // numberPyramidPattern(sc);
        // palindromePattern(sc);

        sc.close();
    }
}

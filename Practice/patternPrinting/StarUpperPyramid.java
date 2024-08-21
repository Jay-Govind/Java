package Practice.patternPrinting;

import java.util.*;

public class StarUpperPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines : ");
        int lines = sc.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = i; j < lines; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}

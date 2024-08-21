package Practice.patternPrinting;

import java.util.*;

public class CharacterUpperyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines : ");
        int lines = sc.nextInt();

        for (int i = 0; i < lines; i++) {
            char ch = 'A';
            for (int j = i; j < lines; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
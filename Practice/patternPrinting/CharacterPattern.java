package Practice.patternPrinting;

import java.util.*;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines : ");
        int lines = sc.nextInt();

        char ch = 'A';

        for (int i = 0; i < lines; i++) {

            for (int j =0; j <=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
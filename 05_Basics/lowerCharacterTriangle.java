import java.util.Scanner;

public class lowerCharacterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = 'A';

        // Input
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();

        // Logic
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}

// output
// Enter the number of lines : 5
// A
// B C
// D E F
// G H I J
// K L M N O
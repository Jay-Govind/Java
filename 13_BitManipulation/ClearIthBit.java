import java.util.*;

public class ClearIthBit {

    public static long clearIthBit(int num, int position) {
        long bitMask = (~0) << position;
        return num & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter the position to be cleared : ");
        int position = sc.nextInt();

        // Decimal Form
        System.out.println("After clearing bit from " + position + " position : " + clearIthBit(num, position));

        // Binary Form
        System.out.println("After clearing bit from " + position + " position : "
                + Long.toBinaryString(clearIthBit(num, position)));

        sc.close();
    }
}
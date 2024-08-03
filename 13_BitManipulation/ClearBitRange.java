import java.util.*;

public class ClearBitRange {

    public static long clearBitRange(long num, int start, int end) {
        long bitMask = (~0) << (end + 1);
        bitMask = bitMask | (1 << start) - 1;

        return num & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Enter the starting position : ");
        int start = sc.nextInt();
        System.out.print("Enter the ending position : ");
        int end = sc.nextInt();

        // Decimal Form
        System.out.println(
                "After clearing bit from " + start + " to " + end + " position : " + clearBitRange(num, start, end));

        // Binary Form
        System.out.println("After clearing bit from " + start + " to " + end + " position : "
                + Long.toBinaryString(clearBitRange(num, start, end)));

        sc.close();
    }
}

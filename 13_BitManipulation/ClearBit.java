import java.util.*;

public class ClearBit {

    public static long clearIthBit(int num, int position) {
        long bitMask = ~(1L << position);
        return num & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Enter the position to be cleared : ");
        int position = sc.nextInt();

        // print in decimal
        System.out.println("After clearing bit at " + position + " position : " + clearIthBit(num, position));

        // print in binay form
        System.out.println(
                "After clearing bit at " + position + " position : " + Long.toBinaryString(clearIthBit(num, position)));

        sc.close();
    }
}

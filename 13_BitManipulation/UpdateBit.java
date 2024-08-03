import java.util.*;

public class UpdateBit {

    public static long updateIthBit(long num, int position, int value) {
        // 1st way
        // long bitMask = 1L << position;

        // if (value == 0) {
        //     return num & ~bitMask;
        // } else {
        //     return num | bitMask;
        // }

        // 2nd way
        num = num & ~(1L << position);
        long bitMask = (long)value << position;
        return num | bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        long num = sc.nextLong();

        System.out.print("Enter the position to be updated : ");
        int position = sc.nextInt();

        System.out.print("Enter the value to be updated : ");
        int value = sc.nextInt();

        // print in decimal
        System.out.println("After updating bit at " + position + " position : " + updateIthBit(num, position, value));

        // print in binary form
        System.out.println("After updating bit at " + position + " position : "
                + Long.toBinaryString(updateIthBit(num, position, value)));
        sc.close();
    }
}

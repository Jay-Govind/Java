import java.util.*;

public class Get {

    public static int getIthBit(long num, int position) {
        long bitMask = 1L << position;

        // if ((num & bitMask) == 0) {
        //     return 0;
        // } else {
        //     return 1;
        // }

        return ((num & bitMask) == 0) ? 0 : 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        long num = sc.nextLong();

        System.out.print("Enter the position : ");
        int position = sc.nextInt();

        String result = "Bit at " + position + " position is : " + getIthBit(num, position);

        System.out.println(result);
        sc.close();
    }
}

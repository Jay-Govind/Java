import java.util.*;

public class SetBit {

    public static long setIthBit(int num, int position) {
        int bitMask = 1 << position;
        return num | bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Enter the position to be set : ");
        int position = sc.nextInt();

        // print in decimal
        System.out.println("After setting bit at " + position + " position : " + setIthBit(num, position));

        // print in binay form
        System.out.println(
                "After setting bit at " + position + " position : " + Long.toBinaryString(setIthBit(num, position)));
                
        sc.close();
    }
}

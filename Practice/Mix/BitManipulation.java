package Practice.Mix;

import java.util.*;

public class BitManipulation {

    // Check if a number is even or odd
    public static boolean isEven(int num) {
        return (num & 1) == 0;
    }

    // Get the value of a bit at a given position
    public static int getBit(int num, int pos) {
        return (num >> pos) & 1; // or
        // return num & (1 << pos);
    }

    // Set the value of a bit at a given position
    public static int setBit(int num, int pos) {
        return num | (1 << pos);
    }

    // Clear the value of a bit at a given position
    public static int clearBit(int num, int pos) {
        return num & ~(1 << pos);
    }

    // Update the value of a bit at a given position
    public static int updateBit(int num, int pos, int value) {
        // 1st way
        if (value == 0) {
            return num & ~(1 << pos); // clear the bit
        } else {
            return num | (1 << pos); // set the bit
        }

        // 2nd way
        // num = num & ~(1 << pos); // clear the bit
        // int bitMask = value << pos;
        // return num | bitMask;
    }

    // Clear the last `i` bits
    public static int clearIBits(int num, int i) {
        return num & (~0 << i);
    }

    // Clear the range of bits
    public static int clearRangeBits(int num, int start, int end) {
        // left part
        int left = (~0) << (end + 1);
        // right part
        int right = (1 << start) - 1;
        // bitmask
        int bitMask = left | right;
        return num & bitMask;
    }

    // Check if a number is a power of 2
    public static boolean powerOf2(int num) {
        return (num & (num - 1)) == 0;
    }

    // Count the number of set bits
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num >>= 1;
        }
        return count;
    }

    // Fast Exponentiation
    public static int fastExpo(int base, int power) {
        int ans = 1;
        while (power > 0) {
            if ((power & 1) != 0) {
                ans *= base;
            }
            base *= base;
            power >>= 1;
        }
        return ans;
    }

    // Swap the bits of a number
    public static void swapBits(int num1, int num2) {
        System.out.println("Before swapping : " + num1 + " " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After swapping : " + num1 + " " + num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println(5 + 6); // 11
        // System.out.println(5 & 6); // 4
        // System.out.println(5 | 6); // 7
        // System.out.println(5 ^ 6); // 3
        // System.out.println(~5); // -6

        // System.out.print("Ente the number : ");
        // int num = sc.nextInt();

        // System.out.println(isEven(num) ? "Even" : "Odd");
        // System.out.println(getBit(num, 2));
        // System.out.println(setBit(num, 2));
        // System.out.println(clearBit(num, 1));
        // System.out.println(updateBit(num, 1, 0)); // num, pos, value
        // System.out.println(clearIBits(num, 2));
        // System.out.println(clearRangeBits(num, 2, 4)); // num, start, end
        // System.out.println(powerOf2(num));
        // System.out.println(countSetBits(num));
        // System.out.println(fastExpo(num, 3)); // base, power
        // swapBits(5, 6);

        sc.close();
    }
}
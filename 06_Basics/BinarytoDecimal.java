import java.util.*;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number : ");
        long binaryNum = sc.nextLong();

        if (binaryNum < 0 || !isValidBinary(binaryNum)) {
            System.out.println("Invalid binary number. Binary numbers can only contain 0s and 1s.");
        } else {
            binaryToDecimal(binaryNum);
        }

        sc.close();
    }

    public static boolean isValidBinary(long binaryNum) {
        long temp = binaryNum;

        if (temp == 0) {
            return true;
        }

        while (temp != 0) {
            long digit = temp % 10;
            if (digit != 0 && digit != 1) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public static void binaryToDecimal(long binaryNum) {
        long decimalNum = 0;
        long power = 0;
        long originalBinaryNum = binaryNum;

        while (binaryNum > 0) {
            long lastDigit = binaryNum % 10;
            decimalNum += (lastDigit * (long) Math.pow(2, power));
            power++;
            binaryNum /= 10;

        }

        System.out.println("Decimal of " + originalBinaryNum + " = " + decimalNum);
    }
}
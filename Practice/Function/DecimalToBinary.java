package Practice.Function;

import java.util.*;

public class DecimalToBinary {

    public static void decimalToBinary(long decimalNum) {
        long originalDecimalNum = decimalNum;
        int power = 0;
        long binaryNum = 0;

        while (decimalNum > 0) {
            long lastDigit = decimalNum % 2;
            binaryNum += lastDigit * (long) Math.pow(10, power);
            power++;
            decimalNum /= 2;
        }

        System.out.println("Binary of " + originalDecimalNum + " = " + binaryNum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        long decimalNum = sc.nextLong();

        if (decimalNum < 0) {
            System.out.println("Invalid Decimal Number");
        } else {
            decimalToBinary(decimalNum);
        }

        sc.close();
    }
}

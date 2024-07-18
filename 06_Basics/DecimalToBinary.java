import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        long decimalNum = sc.nextLong();

        if (decimalNum < 0) {
            System.out.println("Invalid decimal number. Decimal numbers can only contain positive integers.");
        } else {
            decimalToBinary(decimalNum);
        }

        sc.close();
    }

    public static void decimalToBinary(long decimalNum) {
        long binaryNum = 0;
        long power = 0;
        long originalDecimalNum = decimalNum;

        while (decimalNum > 0) {
            long lastDigit = decimalNum % 2;
            binaryNum += lastDigit * (long) Math.pow(10, power);
            power++;
            decimalNum /= 2;
        }

        System.out.println("Binary of " + originalDecimalNum + " = " + binaryNum);
    }
}
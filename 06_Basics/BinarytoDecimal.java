import java.util.*;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number : ");
        int binaryNum = sc.nextInt();

        binaryToDecimal(binaryNum);

        sc.close();
    }

    public static void binaryToDecimal(int binaryNum) {
        int decimalNum = 0;
        int power = 0;

        int originalBinaryNum = binaryNum;
        while (binaryNum > 0) {
            int lastDigit = binaryNum % 10;
            decimalNum = decimalNum + (lastDigit * (int) Math.pow(2, power));
            power++;
            binaryNum /= 10;

        }

        System.out.println("Decimal of " + originalBinaryNum + " = " + decimalNum);
    }
}

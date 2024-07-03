/* Input in java */

/*  use the package in first line - import java.util.*;
    use this - Scanner sc = new Scanner(System.in);
        sc.next();          - for single word
        sc.nextLine();      - for multiple words
        sc.nextInt();       - for integer
        sc.nextByte();      - for byte
        sc.nextFloat();     - for float
        sc.nextDouble();    - for double
        sc.nextBoolean();   - for boolean
        sc.nextShort();     - for short
        sc.nextLong();      - for long
        sc.close();         -- use this line in new version of java
 */

import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input
        // System.out.println("Enter your Salutation : ");
        // String salutation = sc.next();
        System.out.println("Enter your Full Name : ");
        String fullName = sc.nextLine();
        System.out.println("Enter your age: ");
        byte age = sc.nextByte();
        System.out.println("Are you Graduated ? (true/false)");
        boolean graduated = sc.nextBoolean();
        System.out.println("Enter your last semester marks : ");
        float marks = sc.nextFloat();
        System.out.println("Enter your Mobile Number : ");
        long mobileNumber = sc.nextLong();
        

        // Output
        System.out.println("---------------------------------------------");
        System.out.println("Your name is                : " + fullName);
        System.out.println("Your age is                 : " + age);
        System.out.println("Are you graduated           : " + graduated);
        System.out.println("Your last semester marks is : " + marks);
        System.out.println("Your mobile number is       : " + mobileNumber);

        sc.close();
    }
}

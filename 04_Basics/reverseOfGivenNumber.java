// import java.util.*;

// public class reverseOfGivenNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input
//         System.out.print("Enter the number : ");
//         int num = sc.nextInt();

//         // Logic
//         int reverse = 0;
//         while (num != 0) {
//             int lastDigit = num % 10;
//             reverse = reverse * 10 + lastDigit;
//             num = num / 10;
//         }

//         // Output
//         System.out.println("Reverse of given number : " + reverse);

//         sc.close();
//     }
// }


import java.util.*;

public class reverseOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        // Convert number to string and reverse
        String numStr = Integer.toString(num);
        String reversedStr = new StringBuilder(numStr).reverse().toString();

        // Output
        System.out.println("Reverse of given number : " + reversedStr);

        sc.close();
    }
}


/* Both codes are corrcet but with the first code you cant a reverse of number hich ends with zero in proper way. For eg.- 100 will be 001 but the code shows the answer as 1 because it removes the zeroes which comes before any other number. */
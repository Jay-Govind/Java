import java.util.Scanner;

public class primeOrComposite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num > 0) {
                if (num == 1) {
                    System.out.println("Neither prime nor composite");
                } else {
                    boolean result = isPrime(num);
                    System.out.println(result ? "Prime" : "Composite");
                }
            } else {
                System.out.println("Invalid input: Enter a positive integer.");
            }
        } else {
            System.out.println("Invalid input: Please enter an integer.");
        }

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int count = 2; count <= Math.sqrt(num); count++) {
            if (num % count == 0) {
                return false;
            }
        }
        return true;
    }
}

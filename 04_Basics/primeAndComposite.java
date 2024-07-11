import java.util.*;

public class primeAndComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        boolean isPprime = true;

        // logic -- 1st Method
        if (num > 0) {
            if (num == 1) {
                System.out.println("1 is neither prime nor composite");
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPprime = false;
                        break;
                    }
                }
                System.out.println(isPprime ? (num + " is a prime number") : (num + " is a composite number"));
            }
        } else {
            System.out.println("| Invalid input |");
        }

        // logic -- 2nd Method

        if (num > 0) {
            if (num == 1) {
                System.out.println("1 is neither prime nor composite");
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPprime = false;
                        break;
                    }
                }
                if (isPprime) {
                    System.out.println(num + " is a prime number");
                } else {
                    System.out.println(num + " is a composite number");
                }
            }
        } else {
            System.out.println("| Invalid input |");
        }

        sc.close();
    }
}

// There is 2 methods in this program. Both are correct. Comment out the one you don't want to use.
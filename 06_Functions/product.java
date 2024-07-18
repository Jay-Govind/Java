import java.util.*;

public class product {
    public static void main(String[] args) {

        int result = multiply();
        System.out.println("Product of the numbers : " + result);
    }

    // Function to multiply n numbers
    public static int multiply() {
        Scanner sc = new Scanner(System.in);
        int product = 1;

        while (true) {
            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            product *= num;

            System.out.println("Do you want to continue? (1/0)");
            int choice = sc.nextInt();

            if (choice == 1)
                continue;
            else if (choice == 0)
                break;
            else
                System.out.println("Invalid choice. Exiting.");
            break;
        }

        sc.close();
        return product;
    }
}

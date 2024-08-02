import java.util.*;

public class continueQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println("Number is : " + num + " ");
            break;
        } while (true);

        sc.close();
    }
}

// in this code, if user input multiple of 10, then it will continue
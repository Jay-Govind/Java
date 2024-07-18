import java.util.*;

public class InvertedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        for (int current_line = 1; current_line <= num; current_line++) {

            for (int number = 1; number <= num; number++) {
                System.out.print(number + " ");
            }

            System.out.println();
            num--;
        }

        sc.close();
    }
}
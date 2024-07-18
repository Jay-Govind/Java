import java.util.*;

public class InvertedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int total_number_of_line = num;
        int current_number_of_line = 1;

        while (current_number_of_line <= total_number_of_line) {

            for (int row = 1; row <= num; row++) {
                System.out.print(row + " ");
            }

            System.out.println();
            num--;
            current_number_of_line++;
        }

        sc.close();
    }
}

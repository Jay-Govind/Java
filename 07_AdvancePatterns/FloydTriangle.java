import java.util.*;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();

        int counter = 1;

        // logic
        for (int current_line = 1; current_line <= num; current_line++) {
            for (int number = 1; number <= current_line; number++) {

                System.out.print(counter + " ");
                counter++;
            }

            System.out.println();
        }

        sc.close();
    }
}
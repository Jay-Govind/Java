import java.util.*;

public class InvertedStarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the number of lines : ");
        int num = sc.nextInt();

        int total_number_of_lines = num;

        int star = num;
        int spaces = 0;
        int current_number_of_lines = 1;

        while (current_number_of_lines <= total_number_of_lines) {
            // print spaces
            for ( int row = 1; row <= spaces; row++) {
                System.out.print("  ");
            }

            // print stars
            for ( int row = 1; row <= star; row++){
                System.out.print("* ");
            }

            System.out.println();
            star--;
            spaces++;
            current_number_of_lines++;

        }

        sc.close();
    }
}

// output
/* 
Enter the number of lines : 5

* * * * *
  * * * *    
    * * *
      * *
        *
 */
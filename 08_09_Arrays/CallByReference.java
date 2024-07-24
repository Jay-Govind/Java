import java.util.*;

public class CallByReference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
 
        // input
        for (int count = 0; count < marks.length; count++) {
            System.out.print("Enter marks : ");
            marks[count] = sc.nextInt();
        }

        // function call
        updateMarks(marks);

        // output
        for (int count = 0; count < marks.length; count++) {
            System.out.print(marks[count] + " ");
        }

        sc.close();
    }

    public static void updateMarks(int[] marks) {
        for (int count = 0; count < marks.length; count++) {
            if (marks[count] < 100) {
                marks[count] = marks[count] + 1;
            }
        }
    }
}
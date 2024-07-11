package Practice.conditional;

import java.util.*;

public class locationOfPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the x coordinate : ");
        int x = sc.nextInt();
        System.out.print("Enter the y coordinate : ");
        int y = sc.nextInt();

        // Logic
        if (x == 0 && y == 0) {
            System.out.println("| Point lies at origin |");
        } else if (x == 0) {
            System.out.println("| Point lies on x-axis |");
        } else if (y == 0) {
            System.out.println("| Point lies on y-axis |");
        } else if (x > 0 && y > 0) {
            System.out.println("| Point lies in 1st quadrant |");
        } else if (x < 0 && y > 0) {
            System.out.println("| Point lies in 2nd quadrant |");
        } else if (x < 0 && y < 0) {
            System.out.println("| Point lies in 3rd quadrant |");
        } else {
            System.out.println("| Point lies in 4th quadrant |");
        }

        sc.close();
    }
}
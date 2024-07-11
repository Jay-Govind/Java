package Practice.conditional;

import java.util.*;

public class compareAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the length : ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth : ");
        int breadth = sc.nextInt();

        // calculate
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        // Logic
        if (area > perimeter) {
            System.out.println("| Area is greater than Perimeter |");
        } else if (area < perimeter) {
            System.out.println("| Perimeter is greater than Area |");
        } else {
            System.out.println("| Area and Perimeter are equal |");
        }

        // output
        System.out.println("| Area       : " + area);
        System.out.println("| Perimeter  : " + perimeter);

        sc.close();
    }
}
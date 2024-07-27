import java.util.*;

public class ShortestPath {

    public static float shortestPath(String src) {
        int x = 0, y = 0;

        for (int i = 0; i < src.length(); i++) {
            char dir = src.charAt(i);
            // East
            if (dir == 'E') {
                x++;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // South
            else if (dir == 'S') {
                y--;
            }
        }

        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the path(Enter 'E' for east, 'W' for west, 'N' for north, 'S' for south) : ");
        String path = sc.nextLine();

        // Logic
        System.out.println("The shortest path is : " + shortestPath(path));

        sc.close();
    }
}

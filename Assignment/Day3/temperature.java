package Day3;

import java.util.*;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the temperature : ");
        double temperature = sc.nextDouble();

        // Logic
        if (temperature < 100) {
            System.out.println("Cold ! You don't have a fever");
        } else {
            System.out.println("Hot ! You have a fever");
        }

        sc.close();
    }
}

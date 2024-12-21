package Practice.Mix;

import java.util.*;

public class Mix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day number :");
        int day_num = sc.nextInt();
        day(day_num);

        sc.close();
    }

    public static void day(int day) {
        switch (day) {
            case 1:
                System.out.println("The day is 'Sunday'");
                break;
            case 2:
                System.out.println("The day is 'Monday'");
                break;
            case 3:
                System.out.println("The day is 'Tuesday'");
                break;
            case 4:
                System.out.println("The day is 'Wednesday'");
                break;
            case 5:
                System.out.println("The day is 'Thursday'");
                break;
            case 6:
                System.out.println("The day is 'Friday'");
                break;
            case 7:
                System.out.println("The day is 'Saturday'");
                break;
            default:
                System.out.println("The day is 'Invalid'");
                break;
        }
    }
}

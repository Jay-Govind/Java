import java.util.*;

public class Substring {

    public static String subString(String str, int start, int end) {
        String subString = "";

        for (int i = start; i < end; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        // check validation and take input of start and end

        int start, end;
        while (true) {
            System.out.print("Enter start index : ");
            start = sc.nextInt();
            System.out.print("Enter end index : ");
            end = sc.nextInt();
            sc.nextLine();
            if (start >= 0 && start <= str.length() && end >= 0 && end <= str.length() && start <= end) {
                break;
            }
            System.out.println("Invalid input. Please try again.");
        }

        System.out.println("The substring is : " + subString(str, start, end));

        // in built function
        System.out.println("The substring is : " + str.substring(start, end));

        sc.close();
    }
}

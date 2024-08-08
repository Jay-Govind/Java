import java.util.*;

public class FriendsPairing {
    public static int friendsPair(int num) {
        if (num == 1 || num == 2) {
            return num;
        }

        /*
         * if choice = 1,
         *      no of ways = f(n-1)
         * if choice = 2,
         *      no of ways = no of pairs + f(n-2)
         */
        return friendsPair(num - 1) + ((num - 1) * friendsPair(num - 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons : ");
        int num = sc.nextInt();
        System.out.println("Total pairs are : " + friendsPair(num));

        sc.close();
    }
}

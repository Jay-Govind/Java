import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = { "1)Idli", "2)Dosa", "3)Samosa", "4)Chhole Bhature", "5)Puri", "6)Panner Tikka",
                "7)Pani Puri", "8)Vada Pav", "9)French Fries", "10)Plain Paratha" };

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + " ");
        }
        System.out.println();

        System.out.print("Enter the item number you want to order : ");
        int item = sc.nextInt();

        searchItem(item, menu);

        sc.close();
    }

    public static void searchItem(int item, String[] menu) {
        for (int i = 0; i < menu.length; i++) {
            if (item == i + 1) {
                System.out
                        .println("You ordered " + menu[i] + ". Thank you for ordering. Enjoy your meal! in 30 min.");
            } else {
                System.out.println("Item not found");
            }
        }
    }
}

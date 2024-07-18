import java.util.*;

public class breakQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Logic
        do {
            System.out.print("Enter your name : ");
            String name = sc.nextLine();
            if (name.charAt(0) == 'A' || name.charAt(0) == 'a') {
                break;
            }
            System.out.println(name + " , You are a coder.");
        } while (true);

        System.out.println("Thank you");
        
        sc.close();
    }
}

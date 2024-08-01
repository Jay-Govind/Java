import java.util.*;

public class StringUpperCase {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int idx = 1; idx < str.length(); idx++) {
            if (str.charAt(idx) == ' ' && idx < str.length() - 1) {
                sb.append(str.charAt(idx));
                idx++;
                sb.append(Character.toUpperCase(str.charAt(idx)));
            } else {
                sb.append(str.charAt(idx));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        System.out.println(toUpperCase(str));

        sc.close();
    }
}

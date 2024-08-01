import java.util.*;

public class StringCompression {

    public static String compress(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count;
            }
        }

        return newStr;
    }

    public static String compression(String str) {
        if (str == null || str.isEmpty())
            return str;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter a string (e.g. 'aabcccccaaa') : ");
        String str = sc.nextLine();

        System.out.println(compress(str));
        System.out.println(compression(str));
        sc.close();
    }
}

/*
 * Time Complexity : O(n).
 * Both functions are correct and give the same output. But the second function
 * is more efficient.
 */

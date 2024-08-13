import java.util.*;

public class Subset {
    public static void subset(String str, String newStr, int i) {
        if (i == str.length()) {
            if (newStr == "") {
                System.out.print(null + " ");
                return;
            } else {
                System.out.print(newStr + " ");
                return;
            }

        }

        subset(str, newStr + str.charAt(i), i + 1);
        subset(str, newStr, i + 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        subset(str, "", 0);
    }
}

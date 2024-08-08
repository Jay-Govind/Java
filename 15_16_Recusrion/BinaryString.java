public class BinaryString {
    public static void notConsecutiveOne(int num, int lastPlace, String str) {
        // base case
        if (num == 0) {
            System.out.println(str);
            return;
        }

        // work
        notConsecutiveOne(num - 1, 0, str + "0");
        if (lastPlace == 0) {
            notConsecutiveOne(num - 1, 1, str + "1");
        }
    }

    public static void notConsecutiveZero(int num, int lastPlace, String str) {
        // base case
        if (num == 0) {
            System.out.println(str);
            return;
        }

        // work
        notConsecutiveZero(num - 1, 1, str + "1");
        if (lastPlace == 1) {
            notConsecutiveZero(num - 1, 0, str + "0");
        }
    }

    public static void main(String[] args) {
        notConsecutiveOne(3, 0, "");
        notConsecutiveZero(3, 1, "");
    }
}

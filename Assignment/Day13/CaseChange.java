package Assignment.Day13;

public class CaseChange {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' ') + " ");
        }
        // prints a b c d e f g h i j k l m n o p q r s t u v w x y z
    }
}

//   01000001 (binary for 'A' = 65)
// | 00100000 (binary for ' ' = 32)
// -------------
//  01100001 (result = 97, which is 'a')

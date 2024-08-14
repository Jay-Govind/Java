public class Permutation {
    public static void findPermutation(String str, String newStr){
        // base case
        if (str.length() == 0){
            System.out.print(newStr + " ");
            return;
        }

        // recursion
        for ( int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String currStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(currStr, newStr+curr);
        }
    }

    public static void main(String[] args){
        String str = "abc";
        findPermutation(str, "");
    }
}

package Practice.Sorting;

public class DictionaryOrder {

    public static void dictionarySort(String[] words) {
        int n = words.length;
        boolean swapped = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n - 1 - i); j++) {
                if (words[j].toLowerCase().compareTo(words[j + 1].toLowerCase()) > 0) {

                    // swap
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        if (swapped == false) {
            System.out.println("Already Sorted");
            return;
        }

    }

    public static void main(String[] args) {

        String[] words = { "Computer", "Arpanet", "arpanet", "Banking", "Mouse" };

        dictionarySort(words);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " ");
        }

    }
}

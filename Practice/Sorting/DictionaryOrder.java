package Practice.Sorting;

import java.util.*;

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
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("How many words you want to enter : ");
        int size = sc.nextInt();
        String[] words = new String[size];

        sc.nextLine(); // Consume newline character left by nextInt()

        for (int i = 0; i < words.length; i++) {
            System.out.print("Enter word " + (i + 1) + " : ");
            words[i] = sc.nextLine().trim();
        }

        sc.close();
        dictionarySort(words);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " ");
        }

    }
}

// Apply Mergesort to sort an array of Strings. (Assume that all the characters in all the Strings are in lowercase).

package Day17;

public class MergeSort {

    // print array
    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(String[] arr, int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // work
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left
        mergeSort(arr, mid + 1, ei); // right

        // merge
        merge(arr, si, mid, ei);
    }

    public static void merge(String[] arr, int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            // arr[i].charAt(0) < arr[j].charAt(0) --> This condition check only 1st letter
            if (isAlphabeticallySmaller(arr[i], arr[j])) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover elements of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // for leftover elements of 1st sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    // return true if first is smaller by second in dictionary order
    static boolean isAlphabeticallySmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}

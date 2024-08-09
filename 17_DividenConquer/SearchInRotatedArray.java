public class SearchInRotatedArray {

    public static int search(int[] arr, int key, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }

        // find mid
        int mid = si + (ei - si) / 2;

        // case found
        if (arr[mid] == key) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= key && key <= arr[mid]) {
                // case a: left
                return search(arr, key, si, mid - 1);
            } else {
                // case b: right
                return search(arr, key, mid + 1, ei);
            }

        }

        // mid on L2
        else {
            if (arr[mid] <= key && key <= arr[ei]) {
                // case c : right
                return search(arr, key, mid + 1, ei);
            } else {
                // case d: left
                return search(arr, key, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int key = 0;

        int idx = search(arr, key, 0, arr.length - 1);
        if (idx < 0) {
            System.out.println("Target Not Found");
        } else {
            System.out.println(idx);
        }
    }
}

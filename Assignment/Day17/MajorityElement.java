package Day17;

public class MajorityElement {

    // Brute Force approach
    public static int majorityElement(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        int majorityCount = majorityElement(nums);
        if (majorityCount == -1) {
            System.out.print("Majority Element Not Found");
        } else {
            System.out.println("The majority found element is : " + majorityCount);
        }

    }
}



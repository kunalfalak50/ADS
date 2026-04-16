package pgcp;

import java.util.Arrays;

public class InsertSorted {
    public static int[] insert(int[] arr, int n, int key) {
        // Create new array with extra space
        int[] result = new int[n + 1];

        // Copy elements
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }

        int i = n - 1;

        // Shift elements to the right
        while (i >= 0 && result[i] > key) {
            result[i + 1] = result[i];
            i--;
        }

        // Insert element
        result[i + 1] = key;

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        int key = 4;

        int[] updated = insert(arr, arr.length, key);

        System.out.println(Arrays.toString(updated));
    }
}
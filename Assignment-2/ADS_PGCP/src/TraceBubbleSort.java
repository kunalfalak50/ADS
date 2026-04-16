import java.util.Arrays;

public class TraceBubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            
            // One pass
            for (int j = 0; j < n - 1 - i; j++) {
                
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            // Print array after each pass
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }
}
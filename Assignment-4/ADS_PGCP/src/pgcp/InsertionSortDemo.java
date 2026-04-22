import java.util.Arrays;

public class InsertionSortDemo {

    static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];     // element to insert
            int j = i - 1;

            // shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;   // place key at correct position
        }
    }

    public static void main(String[] args) {

        int arr1[] = {12, 11, 13, 5, 6};
        insertionSort(arr1);
        System.out.println("Sorted: " + Arrays.toString(arr1));

        int arr2[] = {4, 3, 2, 10, 12};
        insertionSort(arr2);
        System.out.println("Sorted: " + Arrays.toString(arr2));
    }
}
import java.util.Arrays;

public class QuickSortDemo {

    // Quick Sort function
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high); // pivot index

            // sort left and right parts
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition using last element as pivot
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];  // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int arr1[] = {10, 7, 8, 9, 1, 5};
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println("Sorted: " + Arrays.toString(arr1));

        int arr2[] = {1, 1, 1, 1};
        quickSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted: " + Arrays.toString(arr2));
    }
}
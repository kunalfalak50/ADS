import java.util.Arrays;

public class BubbleSortDemo {

    static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // optimization: stop if already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {

        int arr1[] = {5, 2, 9, 1, 5, 6};
        bubbleSort(arr1);
        System.out.println("Sorted: " + Arrays.toString(arr1));

        int arr2[] = {3, 2, 1};
        bubbleSort(arr2);
        System.out.println("Sorted: " + Arrays.toString(arr2));

        int arr3[] = {1, 2, 3};
        bubbleSort(arr3);
        System.out.println("Sorted: " + Arrays.toString(arr3));
    }
}
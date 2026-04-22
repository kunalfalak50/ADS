import java.util.Arrays;

public class SelectionSortDemo {

    static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // find index of smallest element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int arr1[] = {64, 25, 12, 22, 11};
        selectionSort(arr1);
        System.out.println("Sorted: " + Arrays.toString(arr1));

        int arr2[] = {29, 10, 14, 37, 13};
        selectionSort(arr2);
        System.out.println("Sorted: " + Arrays.toString(arr2));
    }
}
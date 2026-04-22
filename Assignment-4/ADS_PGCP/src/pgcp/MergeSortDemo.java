import java.util.Arrays;

public class MergeSortDemo {

    // Merge Sort function
    static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // divide
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // merge
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted halves
    static void merge(int arr[], int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy data
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // merge arrays
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int arr1[] = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr1, 0, arr1.length - 1);
        System.out.println("Sorted: " + Arrays.toString(arr1));

        int arr2[] = {5, 4, 3, 2, 1};
        mergeSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted: " + Arrays.toString(arr2));
    }
}
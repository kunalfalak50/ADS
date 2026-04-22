import java.util.Arrays;

public class StringSortDemo {

    static void bubbleSort(String arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                // compare strings
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // swap
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void main(String[] args) {

        String arr1[] = {"apple", "banana", "cherry", "date"};
        bubbleSort(arr1);
        System.out.println("Sorted: " + Arrays.toString(arr1));

        String arr2[] = {"dog", "cat", "elephant", "bee"};
        bubbleSort(arr2);
        System.out.println("Sorted: " + Arrays.toString(arr2));
    }
}
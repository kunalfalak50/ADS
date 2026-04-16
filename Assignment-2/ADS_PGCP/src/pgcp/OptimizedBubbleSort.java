package pgcp;
import java.util.Arrays;

public class OptimizedBubbleSort {
	 public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        boolean swapped;
	        
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;

	                    swapped = true; // mark swap happened
	                }
	            }
	            if (!swapped) {
	                break;
	            }
	        }
	    }
	 public static void main(String args[]) {
		 int[] arr = {1, 2, 5, 4, 3};

	        bubbleSort(arr);

	        System.out.println(Arrays.toString(arr));
	 }
}

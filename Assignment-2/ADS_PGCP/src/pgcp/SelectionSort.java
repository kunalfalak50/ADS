package pgcp;
import java.util.Arrays;

public class SelectionSort {
       public static void sortDesc(int[] arr) {
    	   
    	   int n = arr.length;
    	   
    	   for(int i = 0; i < n - 1; i++) {
               int maxIndex = i;
            
               for(int j = i + 1; j < n; j++) {
                   if(arr[j] > arr[maxIndex]) {  // Find largest
                       maxIndex = j;
                   }
               }
               int temp = arr[i];
               arr[i] = arr[maxIndex];
               arr[maxIndex] = temp;
    	   }
       }
	public static void main(String[] args) {
		int[] arr = {3, 5, 1, 2};

        sortDesc(arr);

        System.out.println(Arrays.toString(arr));

	}

}

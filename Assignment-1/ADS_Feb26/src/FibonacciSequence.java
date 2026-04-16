import java.util.Scanner;
public class FibonacciSequence {

	static int fibonacci(int n) {
		
		if(n < 0) {
			  System.out.println("Fibonacci not defined for negative numbers");
	            return -1;
		}
		if(n == 0)return 0;
		if(n == 1)return 1;
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        int result = fibonacci(n);

        // Print only if valid
        if (result != -1) {
            System.out.println("Fibonacci = " + result);
        }
    }
}




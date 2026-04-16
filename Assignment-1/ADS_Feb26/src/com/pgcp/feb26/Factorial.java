package com.pgcp.feb26;
import java.util.Scanner;
public class Factorial {

	static int factorial(int n) {
		
		if(n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");

		}
		if(n == 0) {
			return 1;
		}
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        
	        try {
	            int result = factorial(n);
	            System.out.println("Factorial = " + result);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}



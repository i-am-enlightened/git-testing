package interviewPrepMiscellanous;

import java.util.Scanner;

public class NthNumberFibonacciRecursive {
	
	public static int getNthFibonacciNumber(int n) {
		if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 1;
		}
		else {
			return getNthFibonacciNumber((n-1))+getNthFibonacciNumber((n-2));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getNthFibonacciNumber(n));
		
	}

}

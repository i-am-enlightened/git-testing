package interviewPrepMiscellanous;

import java.util.Scanner;

public class NthNumberFibonacciIterative {
	
	public static int findNthFibonacci(int n) {
		int i=1;
		int preset1 = 1;
		int preset2 = 1;
		int sum=0;
		boolean check=true;
		int presum1=0;
		
		while(i<n) {
			if(n==1) {
				sum=1;
				return sum;
			}
			else if(n==2) {
				sum=1;
				return sum;
			}
			else {
				sum += preset1;
				preset1 = sum;
				
				sum += preset2;
				preset2 = sum;
			}
			i++;
		}
		
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		
		System.out.println(findNthFibonacci(n));
	}

}

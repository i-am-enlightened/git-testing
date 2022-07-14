package interviewPrep;

import java.util.Scanner;

public class program1 {
	//odd numbers
	//which end by 7
	// upto n numbers
	
	public static void getOddNumbers(int n) {
		int i=7;
		int count=0;
		int oddCount=0;
		
		while(count<n) {
			if(i%10==7) {
				if(oddCount%2==0) {
					System.out.print(i+" ");
					++count;
				}
				++oddCount;
			}
			++i;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		List<Integer> oddList = 
		getOddNumbers(n);
//		Iterator<Integer> iterator = oddList.iterator();
//		while(iterator.hasNext()) {
//			System.out.print(iterator.next()+" ");
//		}
	}

}

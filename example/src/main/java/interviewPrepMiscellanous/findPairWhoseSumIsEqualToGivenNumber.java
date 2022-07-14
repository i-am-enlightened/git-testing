package interviewPrepMiscellanous;

import java.util.Scanner;

public class findPairWhoseSumIsEqualToGivenNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = {1, 34, 3, 98, 9, 76, 45, 4};
		int i,j;
		int k;
		int[] sumArray = new int[2];
		
		k = sc.nextInt();
		
		for(i=0;i<array.length;i++) {
			for(j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==k) {
					sumArray[0] = array[i];
					sumArray[1] = array[j];
					break;
				}
			}
		}
		
		
		for(i=0;i<sumArray.length;i++) {
			System.out.print(sumArray[i]+" ");
		}
	}

}

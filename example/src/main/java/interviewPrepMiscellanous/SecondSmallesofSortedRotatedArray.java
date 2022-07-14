package interviewPrepMiscellanous;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallesofSortedRotatedArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {5,3,7,1,3,9,0,6};
		int i;
		
		Arrays.sort(arr);
//		for(i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		int k = sc.nextInt();
		
		arr = rotateArray(k,arr);
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("Second Minimum: "+secondMinimum(arr));
		
	}
	
	public static int secondMinimum(int[] arr) {
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		int i;
		
		for(i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secondMin=min;
				min=arr[i];
			}
			else if(arr[i]<secondMin) {
				secondMin=arr[i];
			}
		}
		
		return secondMin;
	}
	
	public static int[] rotateArray(int k,int[] arr) {
		int[] temp = new int[k];
		int i;
		
		for(i=0;i<k;i++) {
			temp[i]=arr[i];
		}
		
		int j=0;
		while(j<k) {
			for(i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			j++;
		}
		
		int m=0;
		for(i=arr.length-k;i<arr.length;i++) {
			arr[i] = temp[m];
			m++;
		}
		
		return arr;
	}

}

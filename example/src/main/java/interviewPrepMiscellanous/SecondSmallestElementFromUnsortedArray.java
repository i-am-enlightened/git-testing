package interviewPrepMiscellanous;

import java.util.HashMap;
import java.util.Map.Entry;

public class SecondSmallestElementFromUnsortedArray {
	
	public static void main(String[] args) {
		int[] arr = {5,3,7,1,3,9,0,6};
//		int[] arr = {11,-5,4,77,31,2,6};
		int i;
		Integer min = Integer.MAX_VALUE;
		Integer secondMin = Integer.MAX_VALUE;
		
		for(i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secondMin=min;
				min=arr[i];
			}
			else if(arr[i]<secondMin) {
				secondMin=arr[i];
			}
		}
		
		System.out.println(secondMin);
	}

}

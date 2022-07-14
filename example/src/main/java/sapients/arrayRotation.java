package sapients;

import java.util.Scanner;

public class arrayRotation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = {7,4,1,6,2,8};
		
		int x = sc.nextInt();
		
		int[] holdingArray = new int[x];
		int i;
		
		for(i=0;i<x;i++) {
			holdingArray[i] = ar[i];
		}
		
		int y=0;
		while(y<x) {
			for(i=0;i<ar.length-1;i++) {
				ar[i] = ar[i+1];
			}
			y++;
		}
		
		y=0;
		for(i=ar.length-x;i<ar.length;i++) {
			ar[i] = holdingArray[y];
			y++;
		}
		
		for(i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}

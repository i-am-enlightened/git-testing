package interviewPrepMiscellanous;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primeFactorArray {
	
	public static boolean primeCheck(int x) {
		int i;
		int count=0;
		
		for(i=1;i<=x;i++) {
			if(x%i==0) {
				++count;
			}
		}
		
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static List<Integer> getPrimeList(int x) {
		List<Integer> newList = new ArrayList<>();
		int i;
		
		for(i=2;i<x;i++) {
			if(x%i==0) {
				if(primeCheck(i)) {
					newList.add(i);
				}
			}
		}
		return newList;
	}
	
	public static int[] getPrimeArray(int x) {
		int i;
		int[] newArray = null;
		
		if(primeCheck(x)) {
			newArray = new int[1];
			newArray[0] = x;
			return newArray;
		}
		else {
			List<Integer> primeList = getPrimeList(x);
			Object[] objArray = primeList.toArray();
			newArray = new int[objArray.length];
			for(i=0;i<newArray.length;i++) {
				newArray[i] = (int) objArray[i];
			}
		}
		return newArray;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int i;
		int[] primeArray = getPrimeArray(x);
		for(i=0;i<primeArray.length;i++) {
			System.out.print(primeArray[i]+" ");
		}
	}

}

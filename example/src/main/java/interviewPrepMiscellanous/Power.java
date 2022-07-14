package interviewPrepMiscellanous;

import java.util.Scanner;

public class Power {
	
	public static int getExponentValue(int x,int y) {
		int orignalX = x;
		if(y==0) {
			return 1;
		}
		else if(y==1) {
			return 1;
		}
		else if(y<1) {
			int j=1;
			while(j<y) {
				x = x*orignalX;
				j++;
			}
			return 1/x;
		}
		else {
			int j=1;
			while(j<y) {
				x = x*orignalX;
				j++;
			}
		}
		
		return x; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		
		i = sc.nextInt();
		j = sc.nextInt();
		
		System.out.println("Power Value: "+getExponentValue(i, j));
	}

}

package interviewPrepMiscellanous;

import java.util.ArrayList;
import java.util.List;

public class armStrongNumber {
	
	public static boolean checkArmstrong(int num) {
		List<Integer> list = new ArrayList<>();
		int copyNum = num;
		while(copyNum>0) {
			list.add(copyNum%10);
			copyNum = copyNum/10;
		}
		
		int sum = list.stream().map(p -> p%10).map(p -> p*p*p).reduce(0, (p1,p2) -> p1+p2);
		System.out.println(sum);
		
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int num = 371;
		
		if(checkArmstrong(num)) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not Armstrong");
		}
		
	}

}

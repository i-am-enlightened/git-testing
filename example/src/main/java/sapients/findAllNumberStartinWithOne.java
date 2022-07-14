package sapients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class findAllNumberStartinWithOne {
	
	public static void main(String[] args) {
//		List<Integer> list2 = Arrays.asList(10,15,8,49,25,98,32,111);
		List<Integer> list2 = Arrays.asList(10,15,8,1119,1,98,32,111);
		int i,j;
		
		List<Integer> list3 = new ArrayList<>();
		
		Iterator<Integer> itr = list2.iterator();
		while(itr.hasNext()) {
			int number = itr.next();
			int temp = number;
			while(temp>1) {
				temp = temp/10;
			}
			
			if(temp==1) {
				list3.add(number);
			}
		}
		
		System.out.println(list3);
		
	}

}

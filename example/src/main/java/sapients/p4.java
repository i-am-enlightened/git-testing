package sapients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class p4 {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(4,5);
		
		int[] array1 = new int[list1.size()];
		Iterator<Integer> itr1 = list1.iterator();
		int i=0;
		
		while(itr1.hasNext()) {
			array1[i] = itr1.next();
			i++;
		}
		
		int[] array2 = new int[list2.size()];
		Iterator<Integer> itr2 = list2.iterator();
		int j=0;
		
		while(itr2.hasNext()) {
			array2[j] = itr2.next();
			j++;
		}
		
		for(int k=0;k<array1.length;k++) {
			for(int l=0;i<array2.length;l++) {
				if(array1[k]==array2[l]) {
					array1[k]=-1;
				}
			}
		}
		
		// 1 2 3 -1 -1
		
		list1 = new ArrayList<>();
		for(int k=0;k<array1.length;k++) {
			if(array1[k]!=-1) {
				list1.add(array1[k]);
			}
		}
		
		Iterator<Integer> itr3 = list1.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
	}

}

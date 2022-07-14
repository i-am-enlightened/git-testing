package interviewPrep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class x1 {
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		list2.add(4);
		list2.add(5);
		
		Iterator<Integer> itr2 = list2.iterator();
		
		while(itr2.hasNext()) {
			int temp = itr2.next();
			if(list1.contains(temp)) {
				int index = (int) list1.indexOf(temp);
				list1.remove(index);
			}
		}
		
		Iterator<Integer> itr1 = list1.iterator();
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
		}
	}

}

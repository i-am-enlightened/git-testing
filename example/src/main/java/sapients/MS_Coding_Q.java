package sapients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class MS_Coding_Q {
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
//		list1.add(1);
//		list1.add(2);
//		list1.add(3);
//		list1.add(4);
//		list1.add(5);
//		
//		list2.add(4);
//		list2.add(5);
		
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		list1.add(11);
		
		list2.add(8);
		list2.add(9);
		
//		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//		List<Integer> list2 = Arrays.asList(4,5);
		
//		ListIterator<Integer> itr1 = list2.listIterator();
		Iterator<Integer> itr1 = list2.iterator();
		while(itr1.hasNext()) {
			Optional<Integer> temp = Optional.ofNullable(itr1.next());
			if(temp.isPresent()) {
				if(list1.contains(temp.get())) {
					list1.remove(temp.get());
				}
			}
		}
		
		Iterator<Integer> itr2 = list1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}

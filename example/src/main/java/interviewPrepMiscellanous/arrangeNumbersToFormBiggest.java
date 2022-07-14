package interviewPrepMiscellanous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class arrangeNumbersToFormBiggest {
	
	public static void getBiggestNumber(List<Integer> list) {
//		List<Integer> list1 = new ArrayList<>();
//		List<Integer> list2 = new ArrayList<>();
		
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			int temp = itr.next();
//			if(temp<10) {
//				list1.add(temp);
//			}
//			else {
//				int num = temp/10;
//				list2.add(num);
//			}
//		}
		
		CopyOnWriteArrayList<Integer> copyList = new CopyOnWriteArrayList<>();
		copyList.addAll(list);
		
		Collections.sort(copyList,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>10 && o2>10) {
					return o1<o2?1:-1;
				}
				else if(o1<10 && o2>10) {
					int num = o2/10;
					if(num>=o1) {
						return 1;
					}
				}
				else if(o1>10 && o2<10) {
					int num = o1/10;
					if(num>=o2) {
						return 1;
					}
				}
				else {
					return o1<o2?1:-1;
				}
				return o1<o2?1:-1;
			}
		});
		
		
		Iterator<Integer> ibr = copyList.iterator();
		while(ibr.hasNext()) {
			System.out.print(ibr.next()+" ");
		}
		
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 34, 3, 98, 9, 76, 45, 4);
		getBiggestNumber(list);
		
//		1 3 9 4
//		34 98 76 45
		
//		9 4 3 1
//		98 76 45 34
		
//		9 98 76 45 4 34 3 1
		
		
	}

}

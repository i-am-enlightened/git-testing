package interviewPrep;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class x4 {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(34, 6, 3, 12, 12, 8, 8);
		
		list1 = list1.stream().distinct().collect(Collectors.toList());
		
		Iterator<Integer> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}

package interviewPrep;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class x3 {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(34, 6, 3, 12, 65, 1, 8);
		
		List<Integer> list2 = list1.stream().filter(p -> p>5).sorted().collect(Collectors.toList());
		Iterator<Integer> itr = list2.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}

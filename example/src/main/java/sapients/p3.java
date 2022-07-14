package sapients;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class p3 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(14);
		list.add(16);
		list.add(18);
		list.add(20);
		
		Map<Integer,Integer> map = list.stream().collect(Collectors.toMap(p -> p,p -> 2));
		for(Entry<Integer,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}

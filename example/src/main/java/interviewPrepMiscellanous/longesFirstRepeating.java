package interviewPrepMiscellanous;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class longesFirstRepeating {
	
	public static void main(String[] args) {
//		String s = "aabbbbddcc";
//		String s = "aabdcccerrr";
		String s = "abbbccda";
		int i;
//		HashMap<Character,Integer> hash = new HashMap<>();
		TreeMap<Character,Integer> tree = new TreeMap<>();
		
		for(i=0;i<s.length();i++) {
			if(tree.containsKey(s.charAt(i))) {
				tree.put(s.charAt(i), (int) tree.get(s.charAt(i))+1);
			}
			else {
				tree.put(s.charAt(i), 1);
			}
		}
		
		int longest=0;
		for(Entry<Character,Integer> entry: tree.entrySet()) {
			int temp = entry.getValue();
			if(temp>longest) {
				longest = temp;
			}
		}
		
		for(Entry<Character,Integer> entry: tree.entrySet()) {
			int temp = entry.getValue();
			if(temp==longest) {
				int count = entry.getValue();
				for(i=0;i<count;i++) {
					System.out.print(entry.getKey());
				}
				break;
			}
		}
		
		
		
	}

}

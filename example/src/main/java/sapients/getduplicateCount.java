package sapients;

import java.util.HashMap;
import java.util.Map.Entry;

public class getduplicateCount {
	
	public static void main(String[] args) {
		String a = "aaabbbttteedddwwww";
		// expected output = a3b3t3e2d3w4
		
		char[] ar = a.toCharArray();
		HashMap<Character,Integer> hasher = new HashMap<>();
		int i;
		
		for(i=0;i<ar.length;i++) {
			if(hasher.containsKey(ar[i])) {
				hasher.put(ar[i], hasher.get(ar[i]).intValue()+1);
			}
			else {
				hasher.put(ar[i], 1);
			}
		}
		
		StringBuilder sbr = new StringBuilder();
		for(Entry<Character,Integer> entry:hasher.entrySet()) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
			sbr.append(entry.getKey());
			sbr.append(entry.getValue());
		}
		
		System.out.println(sbr.toString());
		
	}

}

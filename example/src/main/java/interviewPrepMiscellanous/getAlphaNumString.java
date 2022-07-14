package interviewPrepMiscellanous;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class getAlphaNumString {
	
	public static void main(String[] args) {
		String s = "SSSSSTTPPPQ";
		char[] charArr = s.toCharArray();
		int i=0;
		HashMap<Character,Integer> hash = new HashMap<>();
		
		for(i=0;i<s.length();i++) {
			if(hash.containsKey(s.charAt(i))) {
				int count = hash.get(s.charAt(i));
				hash.put(s.charAt(i), count+1);
			}
			else {
				hash.put(s.charAt(i), 1);
			}
		}
		
		StringBuilder sbr = new StringBuilder();
		for(Entry<Character,Integer> entry: hash.entrySet()) {
			sbr.append(entry.getValue()+""+entry.getKey());
//			System.out.println(entry.getKey());
		}
		
		String s1 = sbr.toString();
		System.out.println(s1);
	}

}

package sapients;

import java.util.HashSet;

public class removeDuplicates {
	
	public static void main(String[] args) {
		String a = "aaabbbttteedddwwww";
		char[] ar = a.toCharArray();
		int i;
		HashSet<Character> hasher = new HashSet<>();
		
		for(i=0;i<ar.length;i++) {
			if(hasher.contains(ar[i])) {
				continue;
			}
			else {
				hasher.add(ar[i]);
			}
		}
		
		
		StringBuilder sbr = new StringBuilder();
		hasher.forEach(p -> sbr.append(p));
		
		a = sbr.toString();
		System.out.println(a);
		
	}

}

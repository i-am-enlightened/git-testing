package interviewPrepMiscellanous;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class missingCharactersToMakeStringPangram {
	
	public static void main(String[] args) {
//		String s = "Java is a programming language";
		String s = "Don't do doggy style";
		s = s.toUpperCase();
		int i;
		
		HashSet<Character> hash = new HashSet<>();
		for(i=65;i<91;i++) {
			hash.add((char)i);
		}
		
		char[] charArr = s.toCharArray();
		List<Character> charList = new ArrayList<>();
		for(i=0;i<charArr.length;i++) {
			charList.add(charArr[i]);
		}
		
		List<Character> missCharList = new ArrayList<>();
		
		Iterator<Character> itr = hash.iterator();
		while(itr.hasNext()) {
			char c = itr.next();
			if(!charList.contains(c)) {
				missCharList.add(c);
			}
		}
		
		Iterator<Character> ibr = missCharList.iterator();
		while(ibr.hasNext()) {
			System.out.print(ibr.next()+" ");
		}
	}

}
